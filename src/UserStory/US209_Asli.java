package UserStory;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US209_Asli extends BaseDriver {

@Test
    public void SiparisGecmisiLocalKontrol(){


        driver.get("https://demowebshop.tricentis.com/");
    Tools.Bekle(2);


    Actions aksiyonDriver=new Actions(driver);


    WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
    Action aksiyonlar=aksiyonDriver.moveToElement(logIn).click().build();
    aksiyonlar.perform();

    WebElement email=driver.findElement(By.cssSelector("[name='Email']"));
    Action aksiyonlar2=aksiyonDriver.moveToElement(email).sendKeys("asli0@gmail.com").build();
    aksiyonlar2.perform();









}
}
