package SearchPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class RecommendedPage {
    AndroidDriver driver;

    public RecommendedPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickNavigation() throws InterruptedException {

        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.Button']"))).click();

    }

    public void clickTransaction() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='android.view.View'][2]")).click();
    }

    public void investmentInitiation() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='android.view.View'][3]")).click();
    }

    public void searchInvestmentsList() {


        WebDriverWait wait = new WebDriverWait(driver, 120);

        //from search option

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Close\"]/android.widget.ScrollView/android.widget.EditText"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Close\"]/android.widget.ScrollView/android.widget.EditText"))).sendKeys("20230700018");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Reference No: \n" +
                "20230700018\n" +
                "Propose For: \n" +
                "Others\n" +
                "Inv Type: \n" +
                "Medicine\n" +
                "Market: \n" +
                "Savar(D)\n" +
                "Donation To: \n" +
                "Doctor\n" +
                "Initiator: \n" +
                "Md. Anowarul Islam\n" +
                "Designation: \n" +
                "SMPO\"]"))).click();
    }
    public void clickNextButton() throws InterruptedException {


        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();


        Thread.sleep(1000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345, 85)).release().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        //4 product add if needed

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@content-desc='Add Products']")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='Afun VT']"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='CONFIRM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='Yes']")).click();

    }
    public void clickNextButtonTM() throws InterruptedException {


        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();


        Thread.sleep(1000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345, 85)).release().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        Thread.sleep(2000);
        touchAction.press(PointOption.point(600, 469)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(600, 1106)).release().perform();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        //4 product add if needed

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@content-desc='Add Products']")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='Afun VT']"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='CONFIRM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Status\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recommended\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='Yes']")).click();

    }
    public void clickLogoutButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\"]")).click();
    }



    public void investmentRecommendation() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Investment Recommendation\"]")).click();
    }
    public void clickForReference() throws InterruptedException {
       Thread.sleep(2000);
//        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Find Recommendation\n" +
//                "Reference\n" +
//                "Click For Reference\n" +
//                "Propose For\n" +
//                "Auto Generated\n" +
//                "Donation Type\n" +
//                "Auto Generated\n" +
//                "Donation To\n" +
//                "Auto Generated\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"20230700020\n" +
                "Others\n" +
                "Medicine\n" +
                "Savar(D)\n" +
                "Doctor\"]"))).click();

    }

    public void investmentApproval() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Investment Approval\"]")).click();
    }

    public void selectInvestmentRef() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"20230700029\n" +
                "Others\n" +
                "Medicine\n" +
                "Savar(D)\n" +
                "Doctor\"]"))).click();


    }

    public void clickNextButtonRSM() throws InterruptedException {


        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();


        Thread.sleep(1000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345, 85)).release().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        Thread.sleep(2000);
        touchAction.press(PointOption.point(600, 469)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(600, 1306)).release().perform();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        //4 product add if needed


//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@content-desc='Add Products']")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='Afun VT']"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='CONFIRM']")).click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Select Status\"]"))).click();

        //driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Status\"]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Recommended\"]"))).click();

        //driver.findElement(By.xpath("//android.view.View[@content-desc=\"Recommended\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@content-desc='Yes']")).click();

    }

}