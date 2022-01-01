package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tiger_Shark extends PageObject {
	public Tiger_Shark(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement addTiger_Shark;

	public ShopTiger_Shark clickTiger_Shark() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-3')]");
		addTiger_Shark.click();
		return new ShopTiger_Shark(driver);
	}

}
