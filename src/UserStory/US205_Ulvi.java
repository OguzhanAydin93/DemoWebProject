package UserStory;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Test;

public class US205_Ulvi extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");

        Actions action = new Actions(driver);

        WebElement loginPage = driver.findElement(By.linkText("Log in"));
        bekle.until(ExpectedConditions.elementToBeClickable(loginPage));
        action.moveToElement(loginPage).click().perform();

        WebElement loginButton = driver.findElement(By.cssSelector("[value='Log in']"));
        bekle.until(ExpectedConditions.elementToBeClickable(loginButton));
        action.moveToElement(loginButton).click().perform();

        WebElement errorMessage = driver.findElement(By.cssSelector("[class='validation-summary-errors']"));
        Assert.assertTrue("Test failed!", errorMessage.getText().toLowerCase().contains("unsuccessful"));

        WebElement emailInput = driver.findElement(By.id("Email"));
        bekle.until(ExpectedConditions.elementToBeClickable(emailInput));
        action.moveToElement(emailInput).sendKeys("ulvi@gmail.com").perform();
        Assert.assertTrue("Test failed!", errorMessage.getText().toLowerCase().contains("unsuccessful"));
        // empty email, empty password

        bekle.until(ExpectedConditions.elementToBeClickable(emailInput));
        action.moveToElement(emailInput).click().sendKeys("ulvi@gmail.com").perform();
        Assert.assertTrue("Test failed!", errorMessage.getText().toLowerCase().contains("unsuccessful"));
        // valid email, empty password

        emailInput.clear();
        WebElement passInput = driver.findElement(By.id("Password"));
        bekle.until(ExpectedConditions.elementToBeClickable(passInput));
        action.moveToElement(passInput).click().sendKeys("ulvi123").perform();
        Assert.assertTrue("Test failed!", errorMessage.getText().toLowerCase().contains("unsuccessful"));
        // empty email, valid password

        emailInput.clear();
        passInput.clear();
        bekle.until(ExpectedConditions.elementToBeClickable(emailInput));
        action.moveToElement(emailInput).sendKeys("ulvihatali@gmail.com").perform();
        bekle.until(ExpectedConditions.elementToBeClickable(passInput));
        action.moveToElement(passInput).click().sendKeys("hataliparola123").perform();
        Assert.assertTrue("Test failed!", errorMessage.getText().toLowerCase().contains("unsuccessful"));
        // invalid email, invalid password

        BekleVeKapat();
    }
}
