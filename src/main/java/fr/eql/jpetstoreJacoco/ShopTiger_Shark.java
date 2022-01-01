package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopTiger_Shark extends PageObject {
	public ShopTiger_Shark(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement removeTiger_Shark;
	@FindBy(xpath = "//input[@name='EST-3']")
	WebElement addTiger_Shark;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmTiger_Shark;

	public Cards clickCards(int number_add) {
		waitElementsXpath("//input[@name='EST-3']");
		addTiger_Shark.click();
		addTiger_Shark.clear();
		addTiger_Shark.sendKeys(String.valueOf(number_add));
		confirmTiger_Shark.click();
		return new Cards(driver);
	}
}
