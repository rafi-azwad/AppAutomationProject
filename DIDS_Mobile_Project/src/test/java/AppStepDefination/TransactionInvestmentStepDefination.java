package AppStepDefination;


import Core.AppHelper;
import SearchPage.TransactionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class TransactionInvestmentStepDefination {
   // AndroidDriver driver;
    TransactionPage tp;

    @Given("user click in navigation menu")
    public void userClickInNavigationMenu() throws InterruptedException {
        tp = new TransactionPage(driver);
        tp.clickNavigation();

    }

    @When("user enter click in transaction")
    public void userEnterClickInTransaction() throws InterruptedException {
       tp.clickTransaction();
    }

    @And("select investment initiation")
    public void selectInvestmentInitiation() throws InterruptedException {
        tp.investmentInitiation();

    }

    @And("fill up information with valid data")
    public void fillUpInformationWithValidData() throws InterruptedException {
        tp.mpoInvestmentInfo();

    }

    @Then("successfully investment initiation")
    public void successfullyInvestmentInitiation() {

        System.out.println("Successfully Created Investment Initiation");
        AppHelper.stopRecording();
    }
}
