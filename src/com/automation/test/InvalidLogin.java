package com.automation.test;

import org.testng.annotations.Test;

import com.automation.page.LoginPage;


import generic.BaseTest;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testInvalidLogin(){
		//Enter invalid user name
		LoginPage l=new LoginPage(driver);
		l.setUserName("abc");
		//Enter invalid Password
		l.setPassword("xyz");
		//click on Login
		l.clickLogin();
		//verify the err msg is Displayed
		l.verifyErrMsgIsDisplayed();
	}

}
