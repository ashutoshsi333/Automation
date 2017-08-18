package com.automation.test;
import com.automation.page.LoginPage;
import com.automation.page.EnterTimeTrackPage;

import org.testng.annotations.Test;


import generic.BaseTest;

public class ValidLogin extends BaseTest {
      @Test(priority=1)
      public void testValidLogin(){
    	  //Enter valid Username
    	    LoginPage l=new LoginPage(driver);
    	    l.setUserName("admin");
    	  //Enter valid Password
    	    l.setPassword("manager");
    	  //click on Login
    	    l.clickLogin();
    	  //verify Home page is displayed
    	    EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
    	    e.verifyTitle(driver,10,"actiTIME - Enter Time - Track");
      }
}
