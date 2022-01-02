package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProductReptile extends AbstractBandeauPersistant {
	public PageProductReptile(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'RP-SN-01')]")
	WebElement Rattlesnake;

	public PageItemRattlesnake clickRattlesnake() {
		waitElementsXpath("//a[contains(@href,'RP-SN-01')]");
		Rattlesnake.click();
		return new PageItemRattlesnake(driver);
	}

}
