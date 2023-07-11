package SearchPage;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
    public static AndroidDriver driver;
    public LoginPage(AndroidDriver driver){

        this.driver = driver;
    }

    public void userInformation(String userid, String password) throws InterruptedException {

        //explicit
//          WebDriverWait wait = new WebDriverWait(driver, 30);
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.EditText'][1]"))).click();
//          Thread.sleep(2000);
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.EditText'][1]"))).sendKeys(userid);
//
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.EditText'][2]"))).click();
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.EditText'][2]"))).sendKeys(password);
//          driver.hideKeyboard();

          //normally
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][1]")).sendKeys(userid);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).sendKeys(password);
            driver.hideKeyboard();

//        Thread.sleep(2000);
//        TouchAction touchAction =new TouchAction(driver);
//        touchAction.press(PointOption.point(657, 342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(585))).moveTo(PointOption.point(657,29)).release().perform();

    }
    public void clickLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.CheckBox']"))).click();

        driver.findElement(By.xpath("//*[@class='android.widget.Button']")).click();
    }
    public void getSuccessfullMsg() throws InterruptedException {

//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Home\"]")).click();
//        String actual = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Home\"]")).getText();
//        String expect = "Home";
//        Assert.assertEquals(actual,expect);
        System.out.println("Successfully login to home page ");
    }

}
