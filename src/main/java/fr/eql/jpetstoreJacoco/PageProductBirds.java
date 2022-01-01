package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProductBirds extends PageObject {
	public PageProductBirds(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href, 'productId=AV-CB-01')]")
	WebElement AmazonParrot;

	public PageItemAmazonParrot clickAmazonParrot() {
		waitElementsXpath("//a[contains(@href, 'productId=AV-CB-01')]");
		AmazonParrot.click();
		return new PageItemAmazonParrot(driver);
	}

}
