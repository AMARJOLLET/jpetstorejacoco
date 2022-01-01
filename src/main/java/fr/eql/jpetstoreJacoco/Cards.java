package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Cards extends PageObject {
	public Cards(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='newOrder']")
	WebElement continuecards;
	
	public CardsConfirm clickCardsConfirm () {
		waitElementsXpath("//input[@name='newOrder']");
		continuecards.click();
		return new CardsConfirm(driver);
	}
}