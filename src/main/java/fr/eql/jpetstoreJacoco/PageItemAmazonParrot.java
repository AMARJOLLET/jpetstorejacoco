package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemAmazonParrot extends PageObject {
	public PageItemAmazonParrot(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-18')]")
	WebElement addAdultMaleAmazonParrot;

	public ShoppingCart addCartAdultMaleAmazonParrot() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-18')]");
		addAdultMaleAmazonParrot.click();
		return new ShoppingCart(driver);
	}

}
