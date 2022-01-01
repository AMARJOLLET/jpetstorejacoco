package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rattlesnake extends PageObject {
	public Rattlesnake(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Venomless_Rattlesnake;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Rattlesnake;
	
	
	public ShopVenomless_Rattlesnake clickVenomless_Rattlesnake() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-11')]");
		Venomless_Rattlesnake.click();		
		return new ShopVenomless_Rattlesnake(driver);
	}
	
	
}
