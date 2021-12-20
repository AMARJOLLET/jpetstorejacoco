package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSign_In {
	@FindBy(xpath = "//input[@name='username']")
	WebElement US;
	@FindBy(xpath = "//input[@name='password']")
	WebElement PW;

	@FindBy(xpath = "//input[@name='signon']")
	WebElement Register;
	
	public PageSign_In clickSign_In(WebDriver driver, String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		US.click();
		US.clear();
		US.sendKeys(username);
		PW.click();
		PW.clear();
		PW.sendKeys(password);
		Register.click();
		
		return PageFactory.initElements(driver, PageSign_In.class);
	}

}
