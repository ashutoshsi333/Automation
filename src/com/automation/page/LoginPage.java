package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage {
	private WebDriver driver;
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void setUserName(String un){
		sleep(1);
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		sleep(1);
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		login.click();
	}
	public void verifyErrMsgIsDisplayed(){
		verifyElementPresent(driver,10,errmsg);
	}

}
