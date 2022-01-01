package fr.eql.jpetstoreJacoco;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public  class TestJacoco {
	WebDriver driver;
	Logger LOGGER = LoggerFactory.getLogger(TestJacoco.class);
	
	@Before
	public void SetupDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/jpetstore");

	}
	
	
	@Test
	public  void navigateJpetstore() {
		PageWelcome pageWelcome = PageFactory.initElements(driver,PageWelcome.class);
		PageAccueil pageAccueil = pageWelcome.clickEnter();
		
		LOGGER.info("INITIALISATION");
		// SIGN UP
		PageSign_In pageSign_In = pageAccueil.clickSign_up();
		pageSign_In.clickSign_In("ACID","ACID");
		LOGGER.info("SIGN UP ok");

		// BIRDS
		PageBirds pageBirds = pageAccueil.clickBirds();
		Amazon_Parrot amazon_Parrot = pageBirds.clickAmazon_Parrot();
		ShopAmazon_Parrot shopAmazon_Parrot = amazon_Parrot.clickAmazon_Parrot();
		Cards cards = shopAmazon_Parrot.clickCards(2);
		CardsConfirm cardsConfirm = cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();	
		LOGGER.info("BIRDS ok");

		// REPTILE
		PageReptile pageReptile = pageAccueil.clickReptile();
		Rattlesnake rattlesnake = pageReptile.clickRattlesnake();
		ShopVenomless_Rattlesnake shopVenomless_Rattlesnake = rattlesnake.clickVenomless_Rattlesnake();
		shopVenomless_Rattlesnake.clickCards(2);
		cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();		
		
		LOGGER.info("REPTILE ok");

		// FISH
		PageFish pageFish = pageAccueil.clickFish();
		Tiger_Shark tiger_Shark = pageFish.clickTiger_Shark();
		ShopTiger_Shark shopTiger_Shark = tiger_Shark.clickTiger_Shark();
		shopTiger_Shark.clickCards(2);
		cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();
		
		LOGGER.info("FISH ok");

		
		}
	@After
	public void teardown() {
		driver.quit();

	}
}