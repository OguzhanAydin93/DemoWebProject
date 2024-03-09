package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US206_Mert extends BaseDriver {

    @Test

    public void SiparisVerme(){
        driver.get("https://demowebshop.tricentis.com/");

        Actions actionDriver=new Actions(driver);

        WebElement loginButton= driver.findElement(By.cssSelector("[class='ico-login']"));
        actionDriver.moveToElement(loginButton).click().perform();

        WebElement inputEmail= driver.findElement(By.xpath("//input[@id='Email']"));
        actionDriver.moveToElement(inputEmail).sendKeys("mert123@gmail.com").perform();

        WebElement inputPassword= driver.findElement(By.id("Password"));
        actionDriver.moveToElement(inputPassword).click().sendKeys("pass123").perform();

        WebElement lgnBtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        actionDriver.moveToElement(lgnBtn).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement computers= driver.findElement(By.linkText("COMPUTERS"));
        actionDriver.moveToElement(computers).build().perform();

        WebElement noteBooks= driver.findElement(By.linkText("Notebooks"));
        bekle.until(ExpectedConditions.elementToBeClickable(noteBooks));
        actionDriver.moveToElement(noteBooks).click().build().perform();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/notebooks"));

        WebElement laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        actionDriver.moveToElement(laptop).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/141-inch-laptop"));

        WebElement addToCart= driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        actionDriver.moveToElement(addToCart).click().build().perform();

        WebElement shoppingCart= driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        actionDriver.moveToElement(shoppingCart).click().build().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/cart"));

        WebElement country= driver.findElement(By.xpath("//select[@id='CountryId']"));

        Select countrySelect=new Select(country);
        countrySelect.selectByIndex(0);

        WebElement province= driver.findElement(By.xpath("//select[@id='StateProvinceId']"));

        Select provinceSelect=new Select(province);
        provinceSelect.selectByValue("0");

        WebElement acceptConditions= driver.findElement(By.xpath("//input[@id='termsofservice']"));
        actionDriver.moveToElement(acceptConditions).click().build().perform();

        WebElement checkOut= driver.findElement(By.cssSelector("[id='checkout']"));
        actionDriver.moveToElement(checkOut).click().build().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));

        WebElement blngAd= driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));

        Select billingAdress=new Select(blngAd);
        billingAdress.selectByIndex(1);

        WebElement company= driver.findElement(By.cssSelector("[id='BillingNewAddress_Company']"));
        actionDriver.moveToElement(company).click().sendKeys("New Company").build().perform();

        WebElement blnCou= driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select blngCountry=new Select(blnCou);
        blngCountry.selectByIndex(1);

        WebElement pro= driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
        Select prov=new Select(pro);
        prov.selectByIndex(2);

        WebElement city= driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
        actionDriver.moveToElement(city).click().sendKeys("New York").build().perform();

        WebElement adress1= driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
        actionDriver.moveToElement(adress1).click().sendKeys("Macera dolu America").build().perform();

        WebElement adress2=driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']"));
        actionDriver.moveToElement(adress2).click().sendKeys("Center of New York :)").build().perform();

        WebElement postalCode=driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"));
        actionDriver.moveToElement(postalCode).click().sendKeys("42019").perform();

        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']"));
        actionDriver.moveToElement(phoneNumber).click().sendKeys("12345").perform();

        WebElement faxNumber=driver.findElement(By.xpath("//input[@name='BillingNewAddress.FaxNumber']"));
        actionDriver.moveToElement(faxNumber).click().sendKeys("123").perform();

        WebElement continueBtn=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        actionDriver.moveToElement(continueBtn).click().perform();

        WebElement pickUpInStore=driver.findElement(By.id("PickUpInStore"));
        actionDriver.moveToElement(pickUpInStore).click().perform();

        WebElement cntBt=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        actionDriver.moveToElement(cntBt).click().perform();

        WebElement payment=driver.findElement(By.id("paymentmethod_3"));
        actionDriver.moveToElement(payment).click().perform();

        WebElement cnBtn=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        actionDriver.moveToElement(cnBtn).click().perform();

        WebElement poNumber=driver.findElement(By.id("PurchaseOrderNumber"));
        actionDriver.moveToElement(poNumber).click().sendKeys("345").perform();

        WebElement cBtn=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        actionDriver.moveToElement(cBtn).click().perform();


























    }

}
