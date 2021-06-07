package ru.stqa.pft.javawebtesting.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{


    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        typeInField(By.name("user"), username);
        typeInField(By.name("pass"), password);
        submit(By.id("LoginForm"));
    }
}
