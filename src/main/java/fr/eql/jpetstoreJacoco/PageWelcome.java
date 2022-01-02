package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageWelcome extends AbstractBandeauPersistant {
	public PageWelcome(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[.='Enter the Store']")
	WebElement Enter_the_Store;

	public PageAccueil clickEnter() {
		waitElementsXpath("//a[.='Enter the Store']");
		Enter_the_Store.click();
		return new PageAccueil(driver);
	}
}
