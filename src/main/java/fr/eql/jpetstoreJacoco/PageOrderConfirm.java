package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOrderConfirm extends PageObject {
	public PageOrderConfirm(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'confirmed')]")
	WebElement confirm_button;

	public PageOrderRecap confirm_buttonclick() {
		waitElementsXpath("//a[contains(@href,'confirmed')]");
		confirm_button.click();
		return new PageOrderRecap(driver);
	}
}
