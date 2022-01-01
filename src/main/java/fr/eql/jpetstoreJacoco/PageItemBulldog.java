package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemBulldog extends PageObject {
	public PageItemBulldog(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-6')]")
	WebElement MaleAdultBulldog;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-7')]")
	WebElement FemalePuppyBulldog	;

	public ShoppingCart addCartMaleAdultBulldog() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-6')]");
		MaleAdultBulldog.click();
		return new ShoppingCart(driver);
	}

}
