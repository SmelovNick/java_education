package ru.stqa.pft.javawebtesting.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class DeleteContactTest extends TestBase {

    @Test
    public void deleteContact(){
        app.getNavigationHelper().goToFollowPage("Главная");
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }

}
