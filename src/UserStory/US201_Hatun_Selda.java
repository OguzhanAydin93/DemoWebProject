package UserStory;

import Utlity.BaseDriver;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US201_Hatun_Selda extends BaseDriver {
    @Test
    public void Test(){

         driver.get("https://demowebshop.tricentis.com/");

        Actions action=new Actions(driver);

        WebElement register= driver.findElement(By.cssSelector("[class='ico-register']"));
        action.moveToElement(register).click().perform();

        WebElement fmale= driver.findElement(By.cssSelector("[id='gender-female']"));
        action.moveToElement(fmale).click().perform();

        WebElement firstname= driver.findElement(By.cssSelector("[id='FirstName']"));
        action.moveToElement(firstname).click().sendKeys("Hatun").perform();

        WebElement lastname= driver.findElement(By.cssSelector("[id='LastName']"));
        action.moveToElement(lastname).click().sendKeys("YÜKSEL").perform();

        WebElement email= driver.findElement(By.xpath("//input[@name='Email']"));
        action.moveToElement(email).click().sendKeys("hatunyksel.106@gmail.com").perform();






    }
    }

