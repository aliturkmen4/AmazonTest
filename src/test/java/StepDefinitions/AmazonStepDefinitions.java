package StepDefinitions;

import Pages.AmazonPages;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonStepDefinitions {

    WebDriver driver= DriverFactory.getDriver();
    AmazonPages pages=new AmazonPages(driver);

    @Given("User is on home page")
    public void userIsOnHomePage() {
        AmazonPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.searchButton();
    }

    @When("Filter for shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();
    }

    @When("Filter for apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.firstProduct();
    }

    @When("Add to cart")
    public void addToCart() {
        AmazonPages.addCart();
    }

    @Then("Check the cart page")
    public void checkTheCartPage() {
        AmazonPages.checkCart();
    }
}
