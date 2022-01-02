package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemBulldog extends AbstractBandeauPersistant {
	public PageItemBulldog(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-6')]")
	WebElement addMaleAdultBulldog;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-7')]")
	WebElement addFemalePuppyBulldog;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-6')]/preceding::td[contains(text(),'$')]")
	WebElement priceMaleAdultBulldog;

	public ShoppingCart addCartMaleAdultBulldog() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-6')]");
		addMaleAdultBulldog.click();
		return new ShoppingCart(driver);
	}

}
