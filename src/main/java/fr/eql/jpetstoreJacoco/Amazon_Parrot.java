package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_Parrot extends PageObject {
	public Amazon_Parrot(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-18')]")
	WebElement addAmazon_Parrot;
	
	
	public ShopAmazon_Parrot clickAmazon_Parrot () {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-18')]");
		addAmazon_Parrot.click();		
		return new ShopAmazon_Parrot(driver);
	}
	
}


