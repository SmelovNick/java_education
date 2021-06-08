package ru.stqa.pft.javawebtesting.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.ContactData;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class EditContactTest extends TestBase {

    @Test
    public void editContact() {
        app.getNavigationHelper().goToFollowPage("Главная");
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Петя", "Васин", "880069", "dore@dame.com"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
