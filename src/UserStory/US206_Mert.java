package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US206_Mert extends BaseDriver {

    @Test

    public void SiparisVerme(){
        driver.get("https://demowebshop.tricentis.com/");

        Actions actionDriver=new Actions(driver);

        WebElement loginButton= driver.findElement(By.cssSelector("[class='ico-login']"));
        actionDriver.moveToElement(loginButton).click().build().perform();

        WebElement inputEmail= driver.findElement(By.id("Email"));
        actionDriver.moveToElement(inputEmail).sendKeys("mert123@gmail.com").build().perform();

        WebElement inputPassword= driver.findElement(By.id("Password"));
        actionDriver.moveToElement(inputPassword).sendKeys("pass123").build().perform();








    }

}
