package pk.merite.cucumber.steps.search;

import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pk.merite.cucumber.pages.search.SearchPage;

public class SearchStepdefs {

	@Autowired
	private SearchPage searchPage;
	private final Logger logger = LoggerFactory.getLogger(getClass());



	//-----------scenario 1-------------
	@Given("user visits bankingapp")
	public void user_visits_bankingapp() throws Throwable {
		searchPage.load();
	}
	@Then("by default Home page is shown")
	public void by_default_home_page_is_shown() throws Throwable {
		Assertions.assertTrue(searchPage.title().startsWith("Banking WebApp"));
	}

	@When("user clicks on Home in nav bar")
	public void user_clicks_on_home_in_nav_bar() throws Throwable {
		searchPage.clickNavHome();
	}
	@Then("Home page is shown")
	public void home_page_is_shown() throws Throwable {
		Assertions.assertTrue(searchPage.title().startsWith("Banking WebApp"));
	}

	@When("^user clicks on About in nav bar")
	public void user_clicks_on_about_in_nav_bar() throws Throwable {
		searchPage.clickNavAbout();
	}
	@Then("About page is shown")
	public void about_page_is_shown() throws Throwable {
		logger.info("title coming is: "+searchPage.title());
		Assertions.assertTrue(searchPage.title().startsWith("About"));
	}

	@When("user clicks on Contact in nav bar")
	public void user_clicks_on_contact_in_nav_bar() throws Throwable {
		searchPage.clickNavContact();
	}
	@Then("Contact page is shown")
	public void contact_page_is_shown() throws Throwable {
		Assertions.assertTrue(searchPage.title().startsWith("Contact"));
	}

	//-----------scenario 2-------------

	@Given("user visits bankingapp again")
	public void user_visits_bankingapp_again() throws Throwable {
		searchPage.load();
	}
	@Given("user clicks on Accounts in nav bar")
	public void user_clicks_on_Accounts_in_nav_bar() throws Throwable {
		searchPage.clickNavAccounts();
	}
	@Then("user redirects to login page")
	public void user_redirects_to_login_page() throws Throwable {
		Assertions.assertTrue(searchPage.title().startsWith("Login"));
	}

}
