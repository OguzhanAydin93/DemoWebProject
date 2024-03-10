package UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.String.*;

public class US204_Nuri extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");


    }
}
