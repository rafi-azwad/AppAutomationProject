package AppStepDefination;

import Core.AppHelper;
import SearchPage.LoginPage;

import io.appium.java_client.android.AndroidDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;



public class LoginStepDefination {
   public static AndroidDriver driver;
    LoginPage lp;

    @Given("user in the page")
    public void userInThePage() throws MalformedURLException, InterruptedException {
        driver = AppHelper.appAutomation();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String userid, String password) throws InterruptedException {
        lp = new LoginPage(driver);
        lp.userInformation(userid, password);
    }

//    @When("user enter invalid {string} and {string}")
//    public void userEnterInvalidAnd(String userid, String password) throws InterruptedException {
//        lp = new LoginPage(driver);
//        lp.userInformation(userid, password);
//    }

    @And("click login button")
    public void clickLoginButton() throws InterruptedException {
        lp.clickLogin();
    }

    @Then("successfully open home page")
    public void successfullyOpenHomePage() throws InterruptedException {
        lp.getSuccessfullMsg();


    }



//    @Then("failed to open home page")
//    public void failedToOpenHomePage() throws InterruptedException {
//        lp.getSuccessfullMsg();
//        AppHelper.stopRecording();
//    }
}


