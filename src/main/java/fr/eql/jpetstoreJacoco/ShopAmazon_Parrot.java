package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopAmazon_Parrot extends PageObject {
	public ShopAmazon_Parrot(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'removeItemFromCart')]")
	WebElement removeAmazon_Parrot;
	@FindBy(xpath = "//input[@name='EST-18']")
	WebElement addAmazon_Parrot;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmAmazon_Parrot;
	
	
	public Cards clickCards (int number_add) {
		waitElementsXpath("//input[@name='EST-18']");
		addAmazon_Parrot.click();
		addAmazon_Parrot.clear();
		addAmazon_Parrot.sendKeys(String.valueOf(number_add));
		confirmAmazon_Parrot.click();		
		
		return new Cards(driver);
	}
}
