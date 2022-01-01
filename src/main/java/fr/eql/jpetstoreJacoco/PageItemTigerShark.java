package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemTigerShark extends PageObject {
	public PageItemTigerShark(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement addTiger_Shark;

	public ShoppingCart addCartTiger_Shark() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-3')]");
		addTiger_Shark.click();
		return new ShoppingCart(driver);
	}

}
