package ru.stqa.pft.javawebtesting.tests.Groups;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.GroupData;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class AddGroupTest extends TestBase {

  @Test
  public void addGroup() {
    app.getNavigationHelper().goToFollowPage("Группы");
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
