package abc.defenitions;

import abc.po.MainPage;
import abc.po.ProductCategoryPage;
import abc.po.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CategoryDefenitions {

    private MainPage mainPage = new MainPage();
    private ProductCategoryPage productCategoryPage = new ProductCategoryPage();
    private ProductPage productPage = new ProductPage();
    private String firstProductTitle;

    @Given("^I am on the main page$")
    public void goToTheMainPage() {
        mainPage.openMainPage();
    }

    @When("^I go to the category page$")
    public void goToTheCategoryPage() {
        mainPage.clickOnClothingMenuButton();
        mainPage.clickOnNewInClothingMenuButton();
    }

    @And("^I grab first product title on category page$")
    public void grabProductTitleOnCategoryPage() {
        firstProductTitle = productCategoryPage.grabTextProductTitle();
    }

    @And("^I click on first product on category page$")
    public void clickOnProductOnCategoryPage() {
        productCategoryPage.clickOnFirstProductOnCategoryPage();
    }

    @Then("^product title is correct$")
    public void verifyProductTitleIsCorrect() {
        String productTitle = productPage.grabProductName();
        Assert.assertEquals(firstProductTitle,productTitle);
    }
}