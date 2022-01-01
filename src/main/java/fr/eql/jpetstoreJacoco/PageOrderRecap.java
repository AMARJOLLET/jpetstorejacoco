package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOrderRecap extends PageObject {
	public PageOrderRecap(WebDriver driver) {
			super(driver);
		}

	@FindBy(xpath = "//a[text()='Return to Main Menu']")
	WebElement Return_to_Main_Menu;
	
	public PageAccueil ReturnToMainMenu() {
		waitElementsXpath("//a[text()='Return to Main Menu']");
		Return_to_Main_Menu.click();
		return new PageAccueil(driver);
	}
}
