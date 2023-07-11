package AppStepDefination;

import Core.AppHelper;
import SearchPage.RecommendedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class RecommendationTMStepdefs {


    RecommendedPage rp;
    @Given("user clicks in navigation menu for recommended")
    public void userClicksInNavigationMenuForRecommended() throws InterruptedException {
        rp = new RecommendedPage(driver);
        rp.clickNavigation();
    }

    @When("user enter click in transaction button")
    public void userEnterClickInTransactionButton() throws InterruptedException {
        rp.clickTransaction();

    }

    @And("user enter click in investment recommendation")
    public void userEnterClickInInvestmentRecommendation() throws InterruptedException {
        rp.investmentRecommendation();
    }
    @And("click reference for select reference no")
    public void clickReferenceForSelectReferenceNo() throws InterruptedException {
        rp.clickForReference();
    }

    @And("click next button and add targeted product of SBU if needed")
    public void clickNextButtonAndAddTargetedProductOfSBUIfNeeded() throws InterruptedException {
        rp.clickNextButtonTM();

    }

    @Then("successfully recommended by TM")
    public void successfullyRecommendedByTM() throws InterruptedException {
        System.out.println("Successfully Recommended by TM");
        Thread.sleep(2000);
        AppHelper.stopRecording();
        driver.quit();

    }


}
