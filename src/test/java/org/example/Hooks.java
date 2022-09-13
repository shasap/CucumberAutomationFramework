package org.example;

import org.junit.After;
import org.junit.Before;

public class Hooks extends Utils{
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
