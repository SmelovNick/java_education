package ru.stqa.pft.javawebtesting.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.stqa.pft.javawebtesting.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUp() {
        app.init();
    }

    @AfterTest
    public void tearDown() {
        app.stop();
    }

}
