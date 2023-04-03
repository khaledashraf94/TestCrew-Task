package test;


import main.HomePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static main.HomePage.driver;


public class HomeTest {


    HomePage homeObj;

    @BeforeTest
    public void beforeMethod() {

        // String edgepath = System.getProperty("user.dir") + "//Drivers//msedgedriver.exe";

        // System.setProperty("webdriver.edge.driver", edgepath);

        //   WebDriver driver = new EdgeDriver();




        String chromepath = System.getProperty("user.dir") + "//Drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com");

        homeObj = new HomePage(driver);

    }


    @Test (priority = 1)
    public void VerifyEgyptTest() throws InterruptedException {

        String actualValue = homeObj.validateLitePackageValue();
        Assert.assertTrue(actualValue.contains("لايت"));

        String actualMainValue = homeObj.validateMainPackageValue();
        Assert.assertTrue(actualMainValue.contains("الأساسية"));

        String actualPremiumValue = homeObj.validatePremiumPackageValue();
        Assert.assertTrue(actualPremiumValue.contains("بريميوم"));


        String actualLitePrice =homeObj.validateLitePrice();
        Assert.assertTrue(actualLitePrice.contains("0.25"));

        String actualMainPrice = homeObj.validateMainPrice();
        Assert.assertTrue(actualMainPrice.contains("0.5"));

        String actualPremiumPrice = homeObj.validatePremiumPrice();
        Assert.assertTrue(actualPremiumPrice.contains("1"));


        String actualLiteCurrency = homeObj.validateLiteCurrency();
        Assert.assertTrue(actualLiteCurrency.contains("دولار"));

        String actualMainCurrency = homeObj.validateMainCurrency();
        Assert.assertTrue(actualMainCurrency.contains("دولار"));

        String actualPremiumCurrency = homeObj.validatePremiumCurrency();
        Assert.assertTrue(actualPremiumCurrency.contains("دولار"));




    }

    @Test (priority = 2)

    public void verifyAETest (){


        homeObj.SelectUAE();

        String actualValue = homeObj.validateLitePackageValue();
        Assert.assertTrue(actualValue.contains("لايت"));

        String actualMainValue = homeObj.validateMainPackageValue();
        Assert.assertTrue(actualMainValue.contains("الأساسية"));

        String actualPremiumValue = homeObj.validatePremiumPackageValue();
        Assert.assertTrue(actualPremiumValue.contains("بريميوم"));


        String actualLitePrice =homeObj.validateLitePrice();
        Assert.assertTrue(actualLitePrice.contains("5.4"));

        String actualMainPrice = homeObj.validateMainPrice();
        Assert.assertTrue(actualMainPrice.contains("10.9"));

        String actualPremiumPrice = homeObj.validatePremiumPrice();
        Assert.assertTrue(actualPremiumPrice.contains("16.3"));


        String actualLiteCurrency = homeObj.validateLiteCurrency();
        Assert.assertTrue(actualLiteCurrency.contains("دولار"));

        String actualMainCurrency = homeObj.validateMainCurrency();
        Assert.assertTrue(actualMainCurrency.contains("دولار"));

        String actualPremiumCurrency = homeObj.validatePremiumCurrency();
        Assert.assertTrue(actualPremiumCurrency.contains("دولار"));




    }

    @Test (priority = 3)

    public void verifyMoroccoTest (){


        homeObj.SelectMorocco();

        String actualValue = homeObj.validateLitePackageValue();
        Assert.assertTrue(actualValue.contains("لايت"));

        String actualMainValue = homeObj.validateMainPackageValue();
        Assert.assertTrue(actualMainValue.contains("الأساسية"));

        String actualPremiumValue = homeObj.validatePremiumPackageValue();
        Assert.assertTrue(actualPremiumValue.contains("بريميوم"));


        String actualLitePrice =homeObj.validateLitePrice();
        Assert.assertTrue(actualLitePrice.contains("2"));

        String actualMainPrice = homeObj.validateMainPrice();
        Assert.assertTrue(actualMainPrice.contains("3.9"));

        String actualPremiumPrice = homeObj.validatePremiumPrice();
        Assert.assertTrue(actualPremiumPrice.contains("5.8"));


        String actualLiteCurrency = homeObj.validateLiteCurrency();
        Assert.assertTrue(actualLiteCurrency.contains("دولار"));

        String actualMainCurrency = homeObj.validateMainCurrency();
        Assert.assertTrue(actualMainCurrency.contains("دولار"));

        String actualPremiumCurrency = homeObj.validatePremiumCurrency();
        Assert.assertTrue(actualPremiumCurrency.contains("دولار"));




    }





    @AfterTest
     public void afterMethod() {
    driver.quit();
    }

}

