package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractBandeauPersistant extends AbstractPageObject {
	public AbstractBandeauPersistant(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//img [contains(@src, 'topbar')]")
	private WebElement pageAccueilReturn;

	@FindBy(xpath = "//img [contains(@src,'cart') and (@align='middle')]")
	private WebElement shoppingCart_button;
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	private WebElement signIn_button;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	private WebElement signOut_button;
	@FindBy(xpath = "//a[contains(@href,'AccountForm')]")
	private WebElement myAccount_button;
	@FindBy(xpath = "//a[contains(@href,'help')]")
	private WebElement help_button;

	@FindBy(xpath = "//form [@method='post']/input[@name='keyword']")
	private WebElement searchField;
	@FindBy(xpath = "//form [@method='post']/input[@name='searchProducts']")
	private WebElement search_button;

	@FindBy(xpath = "//a [contains(@href,'mybatis')]")
	private WebElement mybatis_button;

	@FindBy(xpath = "//div[@id='QuickLinks']//img[contains(@src, 'fish')]")
	private WebElement fishQuick_button;
	@FindBy(xpath = "//div[@id='QuickLinks']//img[contains(@src, 'dogs')]")
	private WebElement dogsQuick_button;
	@FindBy(xpath = "//div[@id='QuickLinks']//img[contains(@src, 'cats')]")
	private WebElement catsQuick_button;
	@FindBy(xpath = "//div[@id='QuickLinks']//img[contains(@src, 'reptiles')]")
	private WebElement reptilesQuick_button;
	@FindBy(xpath = "//div[@id='QuickLinks']//img[contains(@src, 'birds')]")
	private WebElement birdsQuick_button;

	// Retour PageAccueil
	public PageAccueil Return() {
		pageAccueilReturn.click();
		return new PageAccueil(driver);
	}

	// SignIn - SignOut
	public PageSignIn SignIn() {
		signIn_button.click();
		return new PageSignIn(driver);
	}

	public PageAccueil SignOut() {
		signOut_button.click();
		return new PageAccueil(driver);
	}

	// Search
	public PageSearch search(String searchname) {
		searchField.clear();
		searchField.click();
		searchField.sendKeys(searchname);
		search_button.click();
		return new PageSearch(driver);
	}
	
	// Assertion Display
	public boolean SignOutDisplay() {
		return signOut_button.isDisplayed();
	}
	public boolean SignInDisplay() {
		return signIn_button.isDisplayed();
	}

}