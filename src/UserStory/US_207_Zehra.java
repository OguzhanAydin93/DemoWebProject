package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_207_Zehra extends BaseDriver {
    @Test
    public void SurveyResponse(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("zgkoroglu@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Q1q2q3q4.");

        WebElement loginbtn= driver.findElement(By.xpath("//input[@value='Log in']"));
        loginbtn.click();

        bekle.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
        WebElement excellent=driver.findElement(By.xpath("//*[text()='Excellent']"));
        excellent.click();

        BekleVeKapat();




    }

}
