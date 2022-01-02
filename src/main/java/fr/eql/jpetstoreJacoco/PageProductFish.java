package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProductFish extends AbstractBandeauPersistant {
	public PageProductFish(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href, 'FI-SW-01')]")
	WebElement Angelfish;
	@FindBy(xpath = "//a[contains(@href, 'FI-SW-02')]")
	WebElement TigerShark;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-01')]")
	WebElement Koi;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-02')]")
	WebElement Goldfish;

	public PageItemTigerShark clickTigerShark() {
		waitElementsXpath("//a[contains(@href, 'FI-SW-02')]");
		TigerShark.click();
		return new PageItemTigerShark(driver);
	}

}
