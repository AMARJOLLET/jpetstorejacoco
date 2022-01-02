package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemRattlesnake extends AbstractBandeauPersistant {
	public PageItemRattlesnake(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement addVenomlessRattlesnake;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-12')]")
	WebElement addRattlelessRattlesnake;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]/preceding::td[contains(text(),'$')]")
	WebElement priceVenomlessRattlesnake;
	

	public ShoppingCart addCartVenomlessRattlesnake() {
		waitElementsXpath("//a[contains(@href,'workingItemId=EST-11')]");
		addVenomlessRattlesnake.click();
		return new ShoppingCart(driver);
	}

}
