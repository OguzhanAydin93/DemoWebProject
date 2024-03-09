package UserStory;


import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Us208_Oguzhan extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demowebshop.tricentis.com/");

        Actions action=new Actions(driver);

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        action.moveToElement(login).click().perform();

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        action.moveToElement(email).sendKeys("ozi@gmail.com").perform();

        WebElement password=driver.findElement(By.id("Password"));
        action.moveToElement(password).click().sendKeys("9517536").perform();

        WebElement loginbutton=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        action.moveToElement(loginbutton).click().perform();

        WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
        action.moveToElement(computers).build().perform();

        bekle.until(ExpectedConditions.elementToBeClickable(By.linkText("Notebooks")));
        WebElement notebooks=driver.findElement(By.linkText("Notebooks"));
        action.moveToElement(notebooks).click().perform();

        WebElement laptop=driver.findElement(By.linkText("14.1-inch Laptop"));
        action.moveToElement(laptop).click().perform();

        WebElement addtocard=driver.findElement(By.cssSelector("[id='add-to-cart-button-31']"));
        action.moveToElement(addtocard).click().perform();




















    }


}
