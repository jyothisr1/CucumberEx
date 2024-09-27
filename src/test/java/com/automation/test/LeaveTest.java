package com.automation.test;

import org.testng.annotations.Test;

public class LeaveTest extends BaseTest{

    @Test
    public void verifyLeave(){
        loginPage.openWebsite();
        loginPage.doLogin("Admin","admin123");
    }
}
