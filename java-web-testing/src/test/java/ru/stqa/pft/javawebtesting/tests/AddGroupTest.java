package ru.stqa.pft.javawebtesting.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.GroupData;

public class AddGroupTest extends TestBase{

  @Test
  public void addGroup() {
    app.getNavigationHelper().goToFollowPage("������");
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
