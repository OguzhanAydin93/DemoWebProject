package UserStory;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US202_Selda_Hatun extends BaseDriver {
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
        action.moveToElement(email).click().sendKeys("acemihoca.01@gmail.com").perform();

        WebElement password= driver.findElement(By.xpath("//input[@name='Password']"));
        action.moveToElement(password).click().sendKeys("caykuruuzum1").perform();

        WebElement comfırmpassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        action.moveToElement(comfırmpassword).click().sendKeys("caykuruuzum1").perform();

        WebElement Registerbtn= driver.findElement(By.cssSelector("[id='register-button']"));
        action.moveToElement(Registerbtn).click().perform();

        WebElement mesaj=driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        System.out.println("mesaj.getText()=" + mesaj.getText());

        Assert.assertTrue(mesaj.getText().contains("The specified email already exists"));

        BekleVeKapat();


    }
    }
