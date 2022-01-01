package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOrderNew extends PageObject {
	public PageOrderNew(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='newOrder']")
	WebElement continuecards;

	public PageOrderConfirm clickCardsConfirm() {
		waitElementsXpath("//input[@name='newOrder']");
		continuecards.click();
		return new PageOrderConfirm(driver);
	}
}