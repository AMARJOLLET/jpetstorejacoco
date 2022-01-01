package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageBirds extends PageObject {
	public PageBirds(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href, 'productId=AV-CB-01')]")
	WebElement Amazon_Parrot;

	public Amazon_Parrot clickAmazon_Parrot() {
		waitElementsXpath("//a[contains(@href, 'productId=AV-CB-01')]");
		Amazon_Parrot.click();
		return new Amazon_Parrot(driver);
	}

}
