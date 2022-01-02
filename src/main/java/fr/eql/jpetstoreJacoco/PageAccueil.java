package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends PageObject {
	public PageAccueil(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'signon')]")
	WebElement Sign_in;
	@FindBy(xpath = "//a[contains(@href,'signoff')]")
	WebElement Sign_out;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]")
	WebElement Reptile;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]")
	WebElement Fish;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]")
	WebElement Birds;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=DOGS')]")
	WebElement Dogs;
	
	// Webelement
	public PageSignIn clickSign_up() {
		waitElementsXpath("//a[contains(@href,'signon')]");
		Sign_in.click();
		return new PageSignIn(driver);
	}
	public PageSignIn clickSign_out() {
		waitElementsXpath("//a[contains(@href,'signoff')]");
		Sign_out.click();
		return new PageSignIn(driver);
	}

	public PageProductReptile clickReptile() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]");
		Reptile.click();
		return new PageProductReptile(driver);
	}

	public PageProductFish clickFish() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]");
		Fish.click();
		return new PageProductFish(driver);
	}

	public PageProductBirds clickBirds() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]");
		Birds.click();
		return new PageProductBirds(driver);
	}
	public PageProductDogs clickDogs() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=DOGS')]");
		Dogs.click();
		return new PageProductDogs(driver);
	}
	
	// Assertion Display
	public boolean SignOutDisplay() {
		return Sign_out.isDisplayed();
	}
	public boolean SignInDisplay() {
		return Sign_in.isDisplayed();
	}

}
