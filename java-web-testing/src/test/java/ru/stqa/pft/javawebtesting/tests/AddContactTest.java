package ru.stqa.pft.javawebtesting.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.ContactData;

public class AddContactTest extends TestBase{

    @Test
    public void addContactTest(){
        app.getNavigationHelper().goToFollowPage("�������� �������");
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactData(new ContactData("����", "�����", "88005553535", "yar@yar.com"));
        app.getContactHelper().initContactDataSubmit();
        app.getContactHelper().returnToHomePage();
    }
}