package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage{
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIME;
	@FindBy(xpath="(//td[@class='infoTitle'])[1]")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeButton;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void clickHelp(){
		sleep(1);
		help.click();
	}
	public void clickAboutActiTIME(){
		sleep(1);
		aboutActiTIME.click();
	}
	public void verifyVersion(String eVersion){
		String aVersion=version.getText();
		Assert.assertEquals(aVersion,eVersion);
	}
	public void clickCloseButton(){
		closeButton.click();
	}
	public void clickLogout(){
		logout.click();
	}

}
