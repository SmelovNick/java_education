package ru.stqa.pft.javawebtesting.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.javawebtesting.model.ContactData;

public class ContactHelper extends HelperBase{
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillAddressField(String address){
        typeInField(By.name("address"), address);
    }

    public void initContactCreation() {
        click(By.cssSelector("input[name='quickadd']"));
    }

    public void fillContactData(ContactData contactData) {
        typeInField(By.name("firstname"), contactData.getName());
        typeInField(By.name("lastname"), contactData.getLastname());
        typeInField(By.name("mobile"), contactData.getMobilePhone());
        typeInField(By.name("email"), contactData.getEmail());
    }

    public void initContactDataSubmit() {
        click(By.name("submit"));
    }

    public void returnToHomePage() {
            driver.findElement(By.linkText("home page")).click();
    }
}
