package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class US203_Nuri extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");

        Actions action=new Actions(driver);

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        action.moveToElement(login).click().perform();

        WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
        action.moveToElement(eMail).sendKeys("nuriabc@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        action.moveToElement(password).click().sendKeys("123456").perform();

        WebElement loginbutton=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        action.moveToElement(loginbutton).click().perform();

        WebElement logout=driver.findElement(By.cssSelector("[class='ico-logout']"));
        action.moveToElement(logout).click().perform();

        WebElement login2=driver.findElement(By.cssSelector("[class='ico-login']"));
        action.moveToElement(login2).click().perform();

        if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/logout")) {
            System.out.println("Sayfaya giriş yapılamadı!");
        } else {
            System.out.println("Sayfadan çıkış  yapıldı!");
        }

        BekleVeKapat();
    }

}
