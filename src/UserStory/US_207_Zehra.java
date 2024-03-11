package UserStory;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_207_Zehra extends BaseDriver {
    @Test
    public void SurveyResponse() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions actionDriver = new Actions(driver);

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        actionDriver.moveToElement(login).click().perform();

        WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
        actionDriver.moveToElement(eMail).sendKeys("medicanovo@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        actionDriver.moveToElement(password).click().sendKeys("P12345").perform();

        WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        actionDriver.moveToElement(loginbtn).click().perform();

       bekle.until(ExpectedConditions.urlContains("https://demowebshop.tricentis.com/"));
       WebElement surveyExcellent = driver.findElement(By.xpath("//li[@class='answer']/input[@value='1']"));
       WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
       WebElement pollSection = driver.findElement(By.xpath("//*[text()='Community poll']"));
       if (surveyExcellent.isDisplayed())
           actionDriver.moveToElement(surveyExcellent).click().moveToElement(voteButton).click().perform();
       else
           bekle.until(ExpectedConditions.visibilityOf(pollSection));

        // WebElement voteButton=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        //actionDriver.moveToElement(voteButton).click().perform();
        // WebElement pollSection= driver.findElement(By.xpath("//*[text()='Community poll']"));
        // bekle.until(ExpectedConditions.visibilityOf(pollSection));

       List<WebElement> answerElements = driver.findElements(By.xpath("//ul[@class='poll-results']/li[contains(text(),'vote(s)')]"));
       for (WebElement pollAnswers : answerElements) {
           System.out.println("Sonuçlar, " + pollAnswers.getText());
       }

        BekleVeKapat();


    }

}
