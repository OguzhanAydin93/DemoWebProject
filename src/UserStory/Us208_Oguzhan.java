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
        action.moveToElement(login).click().perform();

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        action.moveToElement(email).sendKeys("ozi@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        action.moveToElement(password).click().sendKeys("9517536").perform();

        WebElement loginbutton=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        action.moveToElement(loginbutton).click().perform();

        WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
        action.moveToElement(computers).build().perform();

        bekle.until(ExpectedConditions.elementToBeClickable(By.linkText("Notebooks")));
        WebElement notebooks=driver.findElement(By.linkText("Notebooks"));
        action.moveToElement(notebooks).click().perform();

        WebElement laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        action.moveToElement(laptop).click().perform();

        WebElement addtocard=driver.findElement(By.cssSelector("[id='add-to-cart-button-31']"));
        action.moveToElement(addtocard).click().perform();

        WebElement shoppingcard=driver.findElement(By.className("cart-label"));
        action.moveToElement(shoppingcard).click().perform();

        WebElement applycoupon=driver.findElement(By.name("applydiscountcouponcode"));
        action.moveToElement(applycoupon).click().perform();

        WebElement assert1=driver.findElement(By.cssSelector("[class='message']"));
        Assert.assertTrue("Kupon Bilgi Görüntülenemedi",assert1.getText().contains("The coupon code you entered couldn't be applied to your order"));

        WebElement assert2=driver.findElement(By.cssSelector("[class='message']"));
        Assert.assertTrue(" Gift Card Bilgisi Görüntülenemedi",assert2.getText().contains("The coupon code you entered couldn't be applied to your order"));

        WebElement addgiftcard=driver.findElement(By.name("applygiftcardcouponcode"));
        action.moveToElement(addgiftcard).click().perform();

        WebElement countryselect=driver.findElement(By.cssSelector("[name='CountryId']"));
        Select select1=new Select(countryselect);
        select1.selectByValue("1");

        WebElement zip=driver.findElement(By.className("zip-input"));
        action.moveToElement(zip).sendKeys("16140").perform();

        WebElement estimateshippin=driver.findElement(By.xpath("//input[@name='estimateshipping']"));
        action.moveToElement(estimateshippin).click().perform();

        WebElement check=driver.findElement(By.cssSelector("[id='termsofservice']"));
        action.moveToElement(check).click().perform();

        WebElement checkout=driver.findElement(By.xpath("//button[@type='submit']"));
        action.moveToElement(checkout).click().perform();

        WebElement company=driver.findElement(By.name("BillingNewAddress.Company"));
        action.moveToElement(company).sendKeys().perform();
































    }


}
