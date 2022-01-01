package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemRattlesnake extends PageObject {
	public PageItemRattlesnake(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Venomless_Rattlesnake;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Rattlesnake;

	public ShoppingCart addCartVenomless_Rattlesnake() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-11')]");
		Venomless_Rattlesnake.click();
		return new ShoppingCart(driver);
	}

}
