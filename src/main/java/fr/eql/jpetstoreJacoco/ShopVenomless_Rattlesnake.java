package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopVenomless_Rattlesnake extends PageObject {
	public ShopVenomless_Rattlesnake(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'removeItemFromCart')]")
	WebElement removeVenomless_Rattlesnake;
	@FindBy(xpath = "//input[@name='EST-11']")
	WebElement addVenomless_Rattlesnake;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmVenomless_Rattlesnake;

	public Cards clickCards(int number_add) {
		waitElementsXpath("//input[@name='EST-11']");
		addVenomless_Rattlesnake.click();
		addVenomless_Rattlesnake.clear();
		addVenomless_Rattlesnake.sendKeys(String.valueOf(number_add));
		confirmVenomless_Rattlesnake.click();
		return new Cards(driver);
	}
}
