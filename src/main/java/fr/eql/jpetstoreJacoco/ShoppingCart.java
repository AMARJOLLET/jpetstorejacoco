package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends PageObject {
	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	
	

	@FindBy(xpath = "//a[contains(@href,'removeItemFromCart')]")
	WebElement removeAmazon_Parrot;
	@FindBy(xpath = "//input[@name='EST-18']")
	WebElement addAmazon_Parrot;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmAmazon_Parrot;
	@FindBy(xpath = "//input[@value='Update Cart']")
	WebElement updateCart_button;
	@FindBy(xpath ="//input[@value='Update Cart']/preceding-sibling::text()")
	WebElement Subtotal;
	@FindBy(xpath ="//a[text()='Return to Main Menu']")
	WebElement ReturnPageActuel;
	
	
	public Cards clickCards(int number_add) {
		waitElementsXpath("//input[@name='EST-18']");
		addAmazon_Parrot.click();
		addAmazon_Parrot.clear();
		addAmazon_Parrot.sendKeys(String.valueOf(number_add));
		updateCart_button.click();
		
		confirmAmazon_Parrot.click();
		return new Cards(driver);
	}
}
