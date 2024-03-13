package UserStory;
import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US209_Asli extends BaseDriver {


    @Test
    public void Test(){
       driver .get("https://demowebshop.tricentis.com/");


        Actions aksiyonDriver=new Actions(driver);

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        Action aksiyonlar=aksiyonDriver.moveToElement(logIn).click().build();
        aksiyonlar.perform();

        WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
        aksiyonDriver.moveToElement(eMail).sendKeys("asli0@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        aksiyonDriver.moveToElement(password).click().sendKeys("asli2003").perform();


        WebElement login2=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        aksiyonDriver.moveToElement(login2).click().build().perform();


        WebElement hesabim=driver.findElement(By.xpath("(//a[@href='/customer/info'])[1]"));
        aksiyonDriver.moveToElement(hesabim).click().build().perform();


        WebElement orders=driver.findElement(By.xpath("(//a[@href='/customer/orders'])[2]"));
        aksiyonDriver.moveToElement(orders).click().build().perform();


        WebElement details=driver.findElement(By.xpath("//input[@class='button-2 order-details-button']"));
        aksiyonDriver.moveToElement(details).click().build().perform();


        WebElement pdfFatura=driver.findElement(By.cssSelector("[href='/orderdetails/pdf/1640838']"));
        aksiyonDriver.moveToElement(pdfFatura).click().build().perform();


        Assert.assertTrue("Aranılan sayfa bulunamadı",driver.getCurrentUrl().contains("orderdetails/1640838"));





    }
    }

