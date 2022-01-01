package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends PageObject {
	public PageAccueil(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[.='Sign In']")
	WebElement Sign_in;
	@FindBy(xpath = "//a[.='Sign Out']")
	WebElement Sign_out;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]")
	WebElement Reptile;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]")
	WebElement Fish;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]")
	WebElement Birds;

	public boolean SignOutDisplay() {
		return Sign_out.isDisplayed();
	}

	public PageSign_In clickSign_up() {
		waitElementsXpath("//a[.='Sign In']");
		Sign_in.click();
		return new PageSign_In(driver);
	}

	public PageReptile clickReptile() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]");
		Reptile.click();
		return PageFactory.initElements(driver, PageReptile.class);
	}

	public PageFish clickFish() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]");
		Fish.click();
		return PageFactory.initElements(driver, PageFish.class);
	}

	public PageBirds clickBirds() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]");
		Birds.click();
		return PageFactory.initElements(driver, PageBirds.class);
	}

}
