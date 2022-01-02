package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemTigerShark extends AbstractBandeauPersistant {
	public PageItemTigerShark(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement addTigerShark;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]/preceding::td[contains(text(),'$')]")
	WebElement priceTigerShark;
	
	
	public ShoppingCart addCartTigerShark() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-3')]");
		addTigerShark.click();
		return new ShoppingCart(driver);
	}

}
