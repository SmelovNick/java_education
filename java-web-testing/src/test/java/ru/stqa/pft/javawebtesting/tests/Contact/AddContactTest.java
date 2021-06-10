package ru.stqa.pft.javawebtesting.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.ContactData;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class AddContactTest extends TestBase {

    @Test
    public void addContactTest(){
        app.getNavigationHelper().goToFollowPage("�������� �������");
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactData(new ContactData("����", "�����", "88005553535",
                "yar@yar.com", "test1"), true);
        app.getContactHelper().initContactDataSubmit();
        app.getContactHelper().returnToHomePage();
    }
}
