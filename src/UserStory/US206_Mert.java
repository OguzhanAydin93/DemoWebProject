package UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US206_Mert extends BaseDriver {
    List<String> siparisler=new ArrayList<>();

    @Test

    public void SiparisVerme() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions actionDriver = new Actions(driver);

        WebElement loginButton = driver.findElement(By.cssSelector("[class='ico-login']"));
        bekle.until(ExpectedConditions.elementToBeClickable(loginButton));
        actionDriver.moveToElement(loginButton).click().perform();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        bekle.until(ExpectedConditions.elementToBeClickable(inputEmail));
        actionDriver.moveToElement(inputEmail).sendKeys("mert123@gmail.com").perform();

        WebElement inputPassword = driver.findElement(By.id("Password"));
        bekle.until(ExpectedConditions.elementToBeClickable(inputPassword));
        actionDriver.moveToElement(inputPassword).click().sendKeys("pass123").perform();

        WebElement lgnBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        actionDriver.moveToElement(lgnBtn).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
        actionDriver.moveToElement(computers).build().perform();

        WebElement noteBooks = driver.findElement(By.linkText("Notebooks"));
        bekle.until(ExpectedConditions.elementToBeClickable(noteBooks));
        actionDriver.moveToElement(noteBooks).click().build().perform();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/notebooks"));

        WebElement laptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        bekle.until(ExpectedConditions.elementToBeClickable(laptop));
        actionDriver.moveToElement(laptop).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/141-inch-laptop"));

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        bekle.until(ExpectedConditions.elementToBeClickable(addToCart));
        actionDriver.moveToElement(addToCart).click().build().perform();

        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        bekle.until(ExpectedConditions.elementToBeClickable(shoppingCart));
        actionDriver.moveToElement(shoppingCart).click().build().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/cart"));

        WebElement country = driver.findElement(By.xpath("//select[@id='CountryId']"));
        Select countrySelect = new Select(country);
        countrySelect.selectByIndex(0);

        WebElement province = driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
        Select provinceSelect = new Select(province);
        provinceSelect.selectByValue("0");

        WebElement acceptConditions = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        bekle.until(ExpectedConditions.elementToBeClickable(acceptConditions));
        actionDriver.moveToElement(acceptConditions).click().build().perform();

        WebElement checkOut = driver.findElement(By.cssSelector("[id='checkout']"));
        bekle.until(ExpectedConditions.elementToBeClickable(checkOut));
        actionDriver.moveToElement(checkOut).click().build().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));

        WebElement blngAd = driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));

        Select billingAdress = new Select(blngAd);
        billingAdress.selectByIndex(1);

        WebElement company = driver.findElement(By.cssSelector("[id='BillingNewAddress_Company']"));
        bekle.until(ExpectedConditions.elementToBeClickable(company));
        actionDriver.moveToElement(company).click().sendKeys("New Company").build().perform();

        WebElement blnCou = driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select blngCountry = new Select(blnCou);
        blngCountry.selectByIndex(1);

        WebElement pro = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
        Select prov = new Select(pro);
        prov.selectByIndex(2);

        WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
        bekle.until(ExpectedConditions.elementToBeClickable(city));
        actionDriver.moveToElement(city).click().sendKeys("New York").build().perform();

        WebElement adress1 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
        bekle.until(ExpectedConditions.elementToBeClickable(adress1));
        actionDriver.moveToElement(adress1).click().sendKeys("Macera dolu America").build().perform();

        WebElement adress2 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']"));
        bekle.until(ExpectedConditions.elementToBeClickable(adress2));
        actionDriver.moveToElement(adress2).click().sendKeys("Center of New York :)").build().perform();

        WebElement postalCode = driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"));
        bekle.until(ExpectedConditions.elementToBeClickable(postalCode));
        actionDriver.moveToElement(postalCode).click().sendKeys("42019").perform();

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']"));
        bekle.until(ExpectedConditions.elementToBeClickable(phoneNumber));
        actionDriver.moveToElement(phoneNumber).click().sendKeys("12345").perform();

        WebElement faxNumber = driver.findElement(By.xpath("//input[@name='BillingNewAddress.FaxNumber']"));
        bekle.until(ExpectedConditions.elementToBeClickable(faxNumber));
        actionDriver.moveToElement(faxNumber).click().sendKeys("123").perform();

        WebElement continueBtn = driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continueBtn));
        actionDriver.moveToElement(continueBtn).click().perform();

        WebElement pickUpInStore = driver.findElement(By.id("PickUpInStore"));
        bekle.until(ExpectedConditions.elementToBeClickable(pickUpInStore));
        actionDriver.moveToElement(pickUpInStore).click().perform();

        WebElement cntBt = driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cntBt));
        actionDriver.moveToElement(cntBt).click().perform();
        MyFunc.Bekle(3);

        WebElement payment = driver.findElement(By.cssSelector("[value='Payments.Manual']"));
        bekle.until(ExpectedConditions.elementToBeClickable(payment));
        actionDriver.moveToElement(payment).click().build().perform();

        WebElement cntBtn1 = driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cntBtn1));
        actionDriver.moveToElement(cntBtn1).click().build().perform();

        WebElement visa = driver.findElement(By.cssSelector("[value='Visa']"));
        bekle.until(ExpectedConditions.elementToBeClickable(visa));
        actionDriver.moveToElement(visa).click().build();
        actionDriver.perform();

        WebElement cardHolderName = driver.findElement(By.id("CardholderName"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardHolderName));
        actionDriver.moveToElement(cardHolderName).click().sendKeys("Mert Ozmen").perform();

        WebElement cardHolder = driver.findElement(By.id("CardNumber"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardHolder));
        actionDriver.moveToElement(cardHolder).click().sendKeys("4242 4242 4242 4242").perform();

        WebElement month = driver.findElement(By.id("ExpireMonth"));
        Select expireMonth = new Select(month);
        expireMonth.selectByValue("1");

        WebElement year = driver.findElement(By.id("ExpireYear"));
        Select expireYear = new Select(year);
        expireYear.selectByValue("2032");

        WebElement cardCode = driver.findElement(By.id("CardCode"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardCode));
        actionDriver.moveToElement(cardCode).click().sendKeys("123").perform();

        WebElement cnBtn = driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cnBtn));
        actionDriver.moveToElement(cnBtn).click().perform();

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(confirmButton));
        actionDriver.moveToElement(confirmButton).click().perform();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/checkout/completed/"));
        WebElement isItEquals = driver.findElement(By.cssSelector("[class='title']>strong"));
        bekle.until(ExpectedConditions.visibilityOf(isItEquals));
        System.out.println("isItEquals.getText() = " + isItEquals.getText());

        Assert.assertEquals(isItEquals.getText(), "Your order has been successfully processed!");

        WebElement orderNumber = driver.findElement(By.cssSelector("[class='details']>li:nth-child(1)"));
        siparisler.add(orderNumber.getText());
        System.out.println("orderNumber.getText() = " + orderNumber.getText());

        WebElement logo = driver.findElement(By.xpath("//*[@value='Continue']"));
        bekle.until(ExpectedConditions.elementToBeClickable(logo));
        actionDriver.moveToElement(logo).click().perform();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement orders = driver.findElement(By.linkText("Orders"));
        bekle.until(ExpectedConditions.elementToBeClickable(orders));
        actionDriver.moveToElement(orders).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/customer/orders"));

        WebElement other = driver.findElement(By.xpath("(//div[@class='title']/strong)[2]"));
        System.out.println("other.getText() = " + other.getText());

        Assert.assertTrue("Orders number is different.",other.getText().equalsIgnoreCase(siparisler.get(0)));

        BekleVeKapat();


    }

}
