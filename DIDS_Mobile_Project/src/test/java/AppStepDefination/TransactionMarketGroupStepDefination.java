package AppStepDefination;

import Core.AppHelper;
import SearchPage.TransactionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static AppStepDefination.LoginStepDefination.driver;

public class TransactionMarketGroupStepDefination {
    TransactionPage tp;
    @Given("user click in navigations menu")
    public void userClickInNavigationsMenu() throws InterruptedException {
        tp = new TransactionPage(driver);
        tp.clickNavigation();
    }

    @When("user enter click in transactions")
    public void userEnterClickInTransactions() throws InterruptedException {
        tp.clickTransaction();

    }

    @And("select market group")
    public void selectMarketGroup() throws InterruptedException {
         tp.selectMarket();
    }

    @And("fill up informations with valid data")
    public void fillUpInformationsWithValidData() throws InterruptedException {
        tp.marketGroupInfo();

    }

    @Then("successfully created market group")
    public void successfullyCreatedMarketGroup() throws InterruptedException {
        tp.saveMarketInfo();
        Thread.sleep(2000);
        AppHelper.stopRecording();
    }
}
