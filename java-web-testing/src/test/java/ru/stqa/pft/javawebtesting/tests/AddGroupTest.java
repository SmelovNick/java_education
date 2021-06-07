package ru.stqa.pft.javawebtesting.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.javawebtesting.model.GroupData;

public class AddGroupTest extends TestBase{

  @Test
  public void addGroup() {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test1", "test1"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
