package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardsConfirm extends PageObject {
	public CardsConfirm(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Return to Main Menu')]")
	WebElement Return_to_Main_Menu;

	public PageAccueil clickReturn_to_Main_Menu() {
		waitElementsXpath("//a[contains(text(),'Return to Main Menu')]");
		Return_to_Main_Menu.click();
		return new PageAccueil(driver);
	}
}
