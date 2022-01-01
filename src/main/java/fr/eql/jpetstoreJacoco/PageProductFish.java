package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProductFish extends PageObject {
	public PageProductFish(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href, 'FI-SW-01')]")
	WebElement Angelfish;
	@FindBy(xpath = "//a[contains(@href, 'FI-SW-02')]")
	WebElement Tiger_Shark;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-01')]")
	WebElement Koi;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-02')]")
	WebElement Goldfish;

	public PageItemTigerShark clickTiger_Shark() {
		waitElementsXpath("//a[contains(@href, 'FI-SW-02')]");
		Tiger_Shark.click();
		return new PageItemTigerShark(driver);
	}

}
