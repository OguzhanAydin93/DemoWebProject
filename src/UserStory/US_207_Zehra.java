package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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




    }

}
