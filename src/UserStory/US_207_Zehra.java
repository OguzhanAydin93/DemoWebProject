package UserStory;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_207_Zehra extends BaseDriver {
    @Test
    public void SurveyResponse(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("lilith.lance@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("P12345");

        WebElement loginbtn= driver.findElement(By.xpath("//input[@value='Log in']"));
        loginbtn.click();


        bekle.until(ExpectedConditions.urlContains("https://demowebshop.tricentis.com/"));
        WebElement surveyExcellent=driver.findElement(By.xpath("//li[@class='answer']/input[@value='1']"));
        surveyExcellent.click();

        WebElement voteButton=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        voteButton.click();
        WebElement pollSection= driver.findElement(By.xpath("//*[text()='Community poll']"));
        bekle.until(ExpectedConditions.visibilityOf(pollSection));


        List<WebElement> answerElements = driver.findElements(By.xpath("//ul[@class='poll-results']/li[contains(text(),'vote(s)')]"));
        for (WebElement pollAnswers : answerElements) {
            System.out.println("Sonuçlar, " + pollAnswers.getText());
        }





        BekleVeKapat();




    }

}
