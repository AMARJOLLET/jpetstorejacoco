package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageReptile extends PageObject {
	public PageReptile(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'RP-SN-01')]")
	WebElement Rattlesnake;
	
	public Rattlesnake clickRattlesnake () {
		waitElementsXpath("//a[contains(@href,'RP-SN-01')]");
		Rattlesnake.click();		
		return new Rattlesnake(driver);
	}
	
	
}
