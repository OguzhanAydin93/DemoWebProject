package UserStory;


import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Us208_Oguzhan extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demowebshop.tricentis.com/");

        Actions action=new Actions(driver);

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        bekle.until(ExpectedConditions.elementToBeClickable(login));
        action.moveToElement(login).click().perform();

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        bekle.until(ExpectedConditions.elementToBeClickable(email));
        action.moveToElement(email).sendKeys("ozi@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        bekle.until(ExpectedConditions.elementToBeClickable(password));
        action.moveToElement(password).click().sendKeys("9517536").perform();

        WebElement loginbutton=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        bekle.until(ExpectedConditions.elementToBeClickable(loginbutton));
        action.moveToElement(loginbutton).click().perform();

        WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
        bekle.until(ExpectedConditions.elementToBeClickable(computers));
        action.moveToElement(computers).build().perform();

        bekle.until(ExpectedConditions.elementToBeClickable(By.linkText("Notebooks")));
        WebElement notebooks=driver.findElement(By.linkText("Notebooks"));
        action.moveToElement(notebooks).click().build().perform();

        WebElement laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        bekle.until(ExpectedConditions.elementToBeClickable(laptop));
        action.moveToElement(laptop).click().perform();

        WebElement addtocard=driver.findElement(By.cssSelector("[id='add-to-cart-button-31']"));
        bekle.until(ExpectedConditions.elementToBeClickable(addtocard));
        action.moveToElement(addtocard).click().build().perform();

        WebElement shoppingcard=driver.findElement(By.className("cart-label"));
        bekle.until(ExpectedConditions.elementToBeClickable(shoppingcard));
        action.moveToElement(shoppingcard).click().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/cart"));

        WebElement applycoupon=driver.findElement(By.name("applydiscountcouponcode"));
        bekle.until(ExpectedConditions.elementToBeClickable(applycoupon));
        action.moveToElement(applycoupon).click().perform();

        WebElement assert1=driver.findElement(By.cssSelector("[class='message']"));
        Assert.assertTrue("Kupon Bilgi Görüntülenemedi",assert1.getText().equals("The coupon code you entered couldn't be applied to your order"));

        WebElement assert2=driver.findElement(By.cssSelector("[class='message']"));
        Assert.assertTrue(" Gift Card Bilgisi Görüntülenemedi",assert2.getText().equals("The coupon code you entered couldn't be applied to your order"));

        WebElement addgiftcard=driver.findElement(By.name("applygiftcardcouponcode"));
        bekle.until(ExpectedConditions.elementToBeClickable(addgiftcard));
        action.moveToElement(addgiftcard).click().perform();

        WebElement countryselect=driver.findElement(By.cssSelector("[name='CountryId']"));
        Select select1=new Select(countryselect);
        select1.selectByValue("1");

        WebElement zip=driver.findElement(By.className("zip-input"));
        bekle.until(ExpectedConditions.elementToBeClickable(zip));
        action.moveToElement(zip).sendKeys("16140").perform();

        WebElement estimateshippin=driver.findElement(By.xpath("//input[@name='estimateshipping']"));
        bekle.until(ExpectedConditions.elementToBeClickable(estimateshippin));
        action.moveToElement(estimateshippin).click().perform();

        WebElement check=driver.findElement(By.cssSelector("[id='termsofservice']"));
        bekle.until(ExpectedConditions.elementToBeClickable(check));
        action.moveToElement(check).click().perform();

        WebElement checkout=driver.findElement(By.xpath("//button[@type='submit']"));
        bekle.until(ExpectedConditions.elementToBeClickable(checkout));
        action.moveToElement(checkout).click().build().perform();
        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));

        WebElement company=driver.findElement(By.name("BillingNewAddress.Company"));
        bekle.until(ExpectedConditions.elementToBeClickable(company));
        action.moveToElement(company).click().sendKeys("Techno Study").perform();

        WebElement countryselect2=driver.findElement(By.name("BillingNewAddress.CountryId"));
        Select select3=new Select(countryselect2);
        select3.selectByValue("3");

        WebElement city=driver.findElement(By.cssSelector("[data-val-required='City is required']"));
        bekle.until(ExpectedConditions.elementToBeClickable(city));
        action.moveToElement(city).click().sendKeys("Buenos Aires").perform();

        WebElement address1=driver.findElement(By.name("BillingNewAddress.Address1"));
        bekle.until(ExpectedConditions.elementToBeClickable(address1));
        action.moveToElement(address1).click().sendKeys("Kısmetse").perform();

        WebElement address2=driver.findElement(By.name("BillingNewAddress.Address2"));
        bekle.until(ExpectedConditions.elementToBeClickable(address2));
        action.moveToElement(address2).click().sendKeys("Arjantin").perform();

        WebElement zip2 =driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"));
        bekle.until(ExpectedConditions.elementToBeClickable(zip2));
        action.moveToElement(zip2).click().sendKeys("16140").perform();

        WebElement phonenumber=driver.findElement(By.cssSelector("[id='BillingNewAddress_PhoneNumber']"));
        bekle.until(ExpectedConditions.elementToBeClickable(phonenumber));
        action.moveToElement(phonenumber).click().sendKeys("05464154532").perform();

        WebElement fax=driver.findElement(By.cssSelector("[class='text-box single-line'][name='BillingNewAddress.FaxNumber']"));
        bekle.until(ExpectedConditions.elementToBeClickable(fax));
        action.moveToElement(fax).click().sendKeys("05595478565").perform();

        WebElement continue1=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue1));
        action.moveToElement(continue1).click().perform();

        WebElement instorepickup=driver.findElement(By.name("PickUpInStore"));
        bekle.until(ExpectedConditions.elementToBeClickable(instorepickup));
        action.moveToElement(instorepickup).click().perform();

        WebElement continue2=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue2));
        action.moveToElement(continue2).click().perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[value='Payments.Manual']")));

        WebElement creditcard=driver.findElement(By.cssSelector("[value='Payments.Manual']"));
        bekle.until(ExpectedConditions.elementToBeClickable(creditcard));
        action.moveToElement(creditcard).click().build().perform();

        WebElement continue3=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue3));
        action.moveToElement(continue3).click().build().perform();

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='CardholderName'][name='CardholderName']")));

        WebElement cardHolderName = driver.findElement(By.cssSelector("[id='CardholderName'][name='CardholderName']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardHolderName));
        action.moveToElement(cardHolderName).click().sendKeys("Oğuzhan Aydın").perform();

        WebElement cardnumber=driver.findElement(By.cssSelector("[id='CardNumber']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardnumber));
        action.moveToElement(cardnumber).click().sendKeys("4242424242424242").perform();

        WebElement expirationdate1=driver.findElement(By.cssSelector("[id='ExpireMonth']"));
        Select select5=new Select(expirationdate1);
        select5.selectByValue("1");

        WebElement expirationdate2=driver.findElement(By.cssSelector("[name='ExpireYear']"));
        Select select6=new Select(expirationdate2);
        select6.selectByValue("2032");

        WebElement cardcode=driver.findElement(By.xpath("//input[@id='CardCode']"));
        bekle.until(ExpectedConditions.elementToBeClickable(cardcode));
        action.moveToElement(cardcode).click().sendKeys("123").perform();

        WebElement continue4=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue4));
        action.moveToElement(continue4).click().perform();

        WebElement continue5=driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue5));
        action.moveToElement(continue5).click().perform();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/checkout/completed/"));
        WebElement assert3 = driver.findElement(By.cssSelector("[class='title']>strong"));
        bekle.until(ExpectedConditions.visibilityOf(assert3));
        System.out.println("isItEquals.getText() = " + assert3.getText());

        WebElement continue6=driver.findElement(By.cssSelector("[class='button-2 order-completed-continue-button']"));
        bekle.until(ExpectedConditions.elementToBeClickable(continue6));
        action.moveToElement(continue6).click().build().perform();


        BekleVeKapat();






    }


}
