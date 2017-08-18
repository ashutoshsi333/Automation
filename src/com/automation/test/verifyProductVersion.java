package com.automation.test;

import org.testng.annotations.Test;

import com.automation.page.LoginPage;
import com.automation.page.EnterTimeTrackPage;

import generic.BaseTest;

public class verifyProductVersion extends BaseTest{
        @Test(priority=3)
        public void testProductVersion(){
          //Enter valid username
          LoginPage l=new LoginPage(driver); 
          l.setUserName("admin");
          //Enter valid password
          l.setPassword("manager");
          //click on Login
          l.clickLogin();
          //click on Help
          EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
          e.clickHelp();
          //click about your actiTime
          e.clickAboutActiTIME();
          //verify the version is 'actiTime 2017.1'
          e.verifyVersion("actiTIME 2017.1");
          //click on close Button
          e.clickCloseButton();
          //click on Logout
          e.clickLogout();
          
          
        } 
}
