package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSign_In extends PageObject{
	public PageSign_In(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement US;
	@FindBy(xpath = "//input[@name='password']")
	WebElement PW;

	@FindBy(xpath = "//input[@name='signon']")
	WebElement Register;
	
	public PageSign_In clickSign_In(String username, String password) {
		waitElementsXpath("//input[@name='username']");
		US.click();
		US.clear();
		US.sendKeys(username);
		PW.click();
		PW.clear();
		PW.sendKeys(password);
		Register.click();
		
		return new PageSign_In(driver);
	}

}
