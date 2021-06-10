package ru.stqa.pft.javawebtesting.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void submit(By locator) {
        driver.findElement(locator).submit();
    }

    protected void typeInField(By locator, String text) {
        click(locator);
        if(text!=null){
            String existingTest = driver.findElement(locator).getAttribute("value");
            if (!text.equals(existingTest)){
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
    }
}
