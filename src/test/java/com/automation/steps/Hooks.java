package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before Scenario");
        DriverManager.createDriver();

    }
    @After
    public void cleanUp(){
        System.out.println("After Scenario");
    }
}
