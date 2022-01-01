package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProductDogs extends PageObject {
	public PageProductDogs(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'K9-BD-01')]")
	WebElement Bulldog;

	public PageItemBulldog clickBulldog() {
		waitElementsXpath("//a[contains(@href,'K9-BD-01')]");
		Bulldog.click();
		return new PageItemBulldog(driver);
	}

}
