package ru.stqa.pft.javawebtesting.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.ContactData;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class EditContactTest extends TestBase {

    @Test
    public void editContact() {
        app.getNavigationHelper().goToFollowPage("???????");
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactData(new ContactData("????", "?????", "880069",
                "dore@dame.com", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
