package ru.stqa.pft.javawebtesting.tests.Groups;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.GroupData;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class EditGroupTest extends TestBase {

    @Test
    public void editGroupTest(){
        app.getNavigationHelper().goToFollowPage("Группы");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test3", "test3", "test3"));
        app.getGroupHelper().submitGroupModification();
    }
}
