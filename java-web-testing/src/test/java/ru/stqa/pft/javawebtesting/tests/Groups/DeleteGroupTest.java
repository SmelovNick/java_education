package ru.stqa.pft.javawebtesting.tests.Groups;// Generated by Selenium IDE

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.tests.TestBase;

public class DeleteGroupTest extends TestBase {

  @Test
  public void deleteGroup() {
    app.getNavigationHelper().goToFollowPage("Группы");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }
}