package SearchPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransactionPage {
     AndroidDriver driver;
    public TransactionPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void clickNavigation() throws InterruptedException {

            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@class='android.widget.Button']"))).click();

    }
    public void clickTransaction() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='android.view.View'][2]")).click();
    }
    public void investmentInitiation() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='android.view.View'][3]")).click();
    }
    public void investmentInfo() throws InterruptedException {


            WebDriverWait wait = new WebDriverWait(driver, 120);

            //from search option

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[3]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"Close\"]/android.widget.ScrollView/android.widget.EditText"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"Close\"]/android.widget.ScrollView/android.widget.EditText"))).sendKeys("20230700018");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"Reference No: \n" +
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



            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

            Thread.sleep(1000);
            TouchAction touchAction =new TouchAction(driver);
            touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345,85)).release().perform();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();


            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();



            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Save']")).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='CONFIRM']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Yes']")).click();

    }

    public void logOut() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='Logout']")).click();
          System.out.println("hello");
    }

//////

    public void selectMarket() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Market Group\"]")).click();


    }
    public void marketGroupInfo() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc=' ']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("Rafi");
            driver.hideKeyboard();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Targeted Market\n" + "Select Market\n" + "Market Code\n" + "Market Name\n" + "SBU\"]")).click();

            WebDriverWait wait = new WebDriverWait(driver, 120);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"Satkania(N)\n" +
                    "AA6\"]"))).click();
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Targeted Market\n" + "Select Market\n" + "Market Code\n" + "Market Name\n" + "SBU\"]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"Mohakhali-1(N)\n" +
                    "AC5\"]"))).click();
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Targeted Market\n" + "Select Market\n" + "Market Code\n" + "Market Name\n" + "SBU\"]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"U07\n" +
                    "AGAILJHARA(B)\"]"))).click();
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Targeted Market\n" + "Select Market\n" + "Market Code\n" + "Market Name\n" + "SBU\"]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"G14\n" +
                    "AGRABAD-1(A)\"]"))).click();
            Thread.sleep(1000);
            driver.hideKeyboard();


    }

    public void saveMarketInfo() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Save']")).click();
    }

    public void mpoInvestmentInfo() throws InterruptedException {

       // page 1

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Choose Propose For']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Others']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Donation Type\n" + "Select Donation Type']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Medicine']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Choose Donation To']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Doctor']")).click();

            WebDriverWait wait = new WebDriverWait(driver, 120);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@content-desc='Reference\n" + "Click To Generate']"))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

       // page 2

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Doctor Name\n" + "Choose Doctor']")).click();
            TouchAction touchAction = new TouchAction(driver);
        //  touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345, 85)).release().perform();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@content-desc='75857 - A. T. M. Abdur Razzak']"))).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Institution\n" + "Choose Institution']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='14016 - Ibn-Sina Diagnostic & Consultantion Centre']"))).click();

            Thread.sleep(1000);
            touchAction.press(PointOption.point(345, 1342)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5850))).moveTo(PointOption.point(345,259)).release().perform();
            driver.findElement(By.xpath("//*[@content-desc='Choose Category']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Regular']")).click();

            driver.findElement(By.xpath("//*[@content-desc='Choose Type']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='B']")).click();
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("15");
            driver.hideKeyboard();

            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).sendKeys("50");
            driver.hideKeyboard();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Add Products']")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@content-desc=concat('Ace 500 Supp 30', \"'\", 's')]"))).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("2");
            driver.findElement(By.xpath("//*[@content-desc='OK']")).click();
            Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();



       // page 3
            Thread.sleep(1000);
            driver.hideKeyboard();

            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][1]")).sendKeys("any");
            driver.hideKeyboard();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Select Payment Freq']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Yearly']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Start']")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc=\"2, Sunday, July 2, 2023\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='OK']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='End']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc=\"31, Monday, July 31, 2023\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='OK']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][2]")).sendKeys("20");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][3]")).sendKeys("40");
            driver.hideKeyboard();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Select Payment Method']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Cash']")).click();

//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][4]")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[@class='android.widget.EditText'][4]")).sendKeys("Money");

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

       // page 4

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Add Products']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[@content-desc='Alarid Tab']"))).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='NEXT']")).click();

        // page 5

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@content-desc='Save']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Choose Group\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.view.View[@content-desc='SAVAR']")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Save']")).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@content-desc='CONFIRM']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@content-desc='Yes']")).click();


    }


}
