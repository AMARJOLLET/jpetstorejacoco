package fr.eql.jpetstoreJacoco;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJacoco extends PageObjectTest {
	Logger LOGGER = LoggerFactory.getLogger(TestJacoco.class);

	@Before
	public void SetupDriver() {
		super.SetupDriver();
	}

	@Test
	public void navigateJpetstore() {
		int number_add = 3;
		String username = "ACID";
		String password = "ACID";

		PageWelcome pageWelcome = new PageWelcome(driver);
		PageAccueil pageAccueil = pageWelcome.clickEnter();

		LOGGER.info("INITIALISATION");
		// SIGN UP
		PageSign_In pageSign_In = pageAccueil.clickSign_up();
		pageSign_In.field(username, password);
		pageSign_In.SignIn();

		assertTrue(pageAccueil.SignOutDisplay());

		LOGGER.info("SIGN UP ok");

		// BIRDS
		PageBirds pageBirds = pageAccueil.clickBirds();
		Amazon_Parrot amazon_Parrot = pageBirds.clickAmazon_Parrot();
		ShopAmazon_Parrot shopAmazon_Parrot = amazon_Parrot.clickAmazon_Parrot();
		Cards cards = shopAmazon_Parrot.clickCards(number_add);
		CardsConfirm cardsConfirm = cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();
		LOGGER.info("BIRDS ok");

		// REPTILE
		PageReptile pageReptile = pageAccueil.clickReptile();
		Rattlesnake rattlesnake = pageReptile.clickRattlesnake();
		ShopVenomless_Rattlesnake shopVenomless_Rattlesnake = rattlesnake.clickVenomless_Rattlesnake();
		shopVenomless_Rattlesnake.clickCards(number_add);
		cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();

		LOGGER.info("REPTILE ok");

		// FISH
		PageFish pageFish = pageAccueil.clickFish();
		Tiger_Shark tiger_Shark = pageFish.clickTiger_Shark();
		ShopTiger_Shark shopTiger_Shark = tiger_Shark.clickTiger_Shark();
		shopTiger_Shark.clickCards(number_add);
		cards.clickCardsConfirm();
		cardsConfirm.clickReturn_to_Main_Menu();

		LOGGER.info("FISH ok");

	}

	@After
	public void Close() {
		super.cleanUp();
		super.teardown();
	}
}