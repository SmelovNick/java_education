package ru.stqa.pft.javawebtesting.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {
    WebDriver driver;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    JavascriptExecutor js;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        //удалить, если не поломается ничего при следующих ранах
        //System.setProperty("webdriver.chrome.driver", "C:\\Apps\\Selenium\\webdrivers\\chromedriver.exe");
        if(browser == BrowserType.CHROME){
            driver = new ChromeDriver();
        }
        else if(browser == BrowserType.FIREFOX){
            driver = new FirefoxDriver();
        }
        else{
            driver = new EdgeDriver();
        }
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        js = (JavascriptExecutor) driver;
        driver.get("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
