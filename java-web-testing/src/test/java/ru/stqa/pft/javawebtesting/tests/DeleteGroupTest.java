package ru.stqa.pft.javawebtesting.tests;// Generated by Selenium IDE

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase{

  @Test
  public void deleteGroup() {
    app.getNavigationHelper().goToFollowPage("Группы");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }
}
