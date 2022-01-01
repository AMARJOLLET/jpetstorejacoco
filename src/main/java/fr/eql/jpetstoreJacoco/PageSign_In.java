package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSign_In extends PageObject {
	public PageSign_In(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='signon']")
	WebElement Register;

	public void field(String username, String password) {
		waitElementsXpath("//input[@name='username']");
		this.username.click();
		this.username.clear();
		this.username.sendKeys(username);
		this.password.click();
		this.password.clear();
		this.password.sendKeys(password);
	}

	public PageAccueil SignIn() {
		Register.click();
		return new PageAccueil(driver);
	}

}
