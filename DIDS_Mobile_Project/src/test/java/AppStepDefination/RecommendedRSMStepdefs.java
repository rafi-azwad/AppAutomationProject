package AppStepDefination;

import Core.AppHelper;
import SearchPage.RecommendedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static AppStepDefination.LoginStepDefination.driver;

public class RecommendedRSMStepdefs {
    RecommendedPage rp;
    @And("rsm click in navigation menu for recommended")
    public void rsmClickInNavigationMenuForRecommended() throws InterruptedException {
        rp = new RecommendedPage(driver);
        rp.clickNavigation();

    }

    @And("enter click in transaction button")
    public void enterClickInTransactionButton() throws InterruptedException {
        rp.clickTransaction();

    }

    @And("enter click in investment approval")
    public void enterClickInInvestmentApproval() throws InterruptedException {
        rp.investmentApproval();

    }

    @And("rsm click reference for select reference no")
    public void rsmClickReferenceForSelectReferenceNo() throws InterruptedException {
        rp.selectInvestmentRef();

    }

    @And("clicks next button and add targeted product of SBU if needed")
    public void clicksNextButtonAndAddTargetedProductOfSBUIfNeeded() throws InterruptedException {
        rp.clickNextButtonRSM();

    }

    @Then("successfully approved by RSM")
    public void successfullyApprovedByRSM() throws InterruptedException {
        System.out.println("Successfully approval status");
        Thread.sleep(2000);
        AppHelper.stopRecording();
        driver.quit();
    }
}
