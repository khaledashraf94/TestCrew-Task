package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
    public static WebDriver driver;
    public WebDriverWait wait;


    // Locators of Elements of the home page

    By litePackage = By.xpath("//*[@id='name-لايت']");
    By mainPackage = By.xpath("//*[@id='name-الأساسية']");
    By premiumPackage = By.xpath("//*[@id='name-بريميوم']");


    By litePrice = By.xpath("//*[@id='currency-لايت']/b");
    By mainPrice = By.xpath("//div[@id='currency-الأساسية']/b");
    By premiumPrice = By.xpath("//div[@id='currency-بريميوم']/b");

    By liteCurrency = By.xpath("//*[@id='currency-لايت']/i");
    By mainCurrency = By.xpath("//div[@id='currency-الأساسية']/i");
    By premiumCurrency = By.xpath("//div[@id='currency-بريميوم']/i");

    By selectCountry = By.xpath("//*[@id='country-btn']");
    By emirates = By.xpath("//*[@id='ae-contry-lable']");
    By morocco = By.xpath("//*[@id='ma-contry-lable']");
    By egypt = By.xpath("//*[@id='eg-contry-lable']");



    //constructor

    public HomePage(WebDriver driver) {

        HomePage.driver = driver;
        // wait=new WebDriverWait(driver,100);



    }


    public boolean validateLitePackageExist(){

        try {
            driver.findElement((litePackage));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public boolean validateMainPackageExist(){

        try {
            driver.findElement((mainPackage));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean validatePremiumPackageExist(){

        try {
            driver.findElement((premiumPackage));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    public String validateLitePackageValue (){

        String liteValue = driver.findElement((litePackage)).getText();
        return liteValue;

    }

    public String validateMainPackageValue (){

        String mainValue = driver.findElement((mainPackage)).getText();
        return mainValue;

    }

    public String validatePremiumPackageValue (){

        String premiumValue = driver.findElement((premiumPackage)).getText();
        return premiumValue;

    }

    public String validateLitePrice (){

        String litePriceActual = driver.findElement((litePrice)).getText();
        return litePriceActual;

    }
    public String validateMainPrice (){

        String mainPriceActual = driver.findElement((mainPrice)).getText();
        return mainPriceActual;

    }

    public String validatePremiumPrice (){

        String premiumPriceActual = driver.findElement((premiumPrice)).getText();
        return premiumPriceActual;

    }

    public String validatePremiumCurrency (){

        String premiumCurrencyActual = driver.findElement((premiumCurrency)).getText();
        return premiumCurrencyActual;

    }


    public String validateMainCurrency (){

        String mainCurrencyActual = driver.findElement((mainCurrency)).getText();
        return mainCurrencyActual;

    }



    public String validateLiteCurrency (){

        String liteCurrencyActual = driver.findElement((liteCurrency)).getText();
        return liteCurrencyActual;

    }


    public void SelectUAE (){

        driver.findElement(selectCountry).click();

        driver.findElement((emirates)).click();

    }


    public void SelectMorocco(){

        driver.findElement(selectCountry).click();

        driver.findElement((morocco)).click();



    }































}










