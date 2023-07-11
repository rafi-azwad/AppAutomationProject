package AppStepDefination;

import Core.AppHelper;
import SearchPage.RecommendedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class RecommendedMPOStepdefs {

    RecommendedPage rp;
    @Given("user click in navigation menu for recommended")
    public void userClickInNavigationMenuForRecommended() throws InterruptedException {
        rp = new RecommendedPage(driver);
        rp.clickNavigation();
    }

    @When("user enter click in transaction page")
    public void userEnterClickInTransactionPage() throws InterruptedException {
        rp.clickTransaction();

    }

    @And("select investment initiation page")
    public void selectInvestmentInitiationPage() throws InterruptedException {
        rp.investmentInitiation();

    }
    @And("click search investments list and select reference no")
    public void clickSearchInvestmentsListAndSelectReferenceNo() {
        rp.searchInvestmentsList();
    }

    @And("click next button and add targeted products of SBU if needed")
    public void clickNextButtonAndAddTargetedProductsOfSBUIfNeeded() throws InterruptedException {
        rp.clickNextButton();

    }

    @Then("successfully recommended for mpo")
    public void successfullyRecommendedForMpo() throws InterruptedException {
        System.out.println("Successfully Recommended of MPO");
        Thread.sleep(2000);
        AppHelper.stopRecording();
        driver.quit();

    }

}
