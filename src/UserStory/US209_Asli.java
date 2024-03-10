package UserStory;
import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US209_Asli extends BaseDriver {


    @Test
    public void Test(){
       driver .get("https://demowebshop.tricentis.com/");


        Actions aksiyonDriver=new Actions(driver);

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
      Action aksiyon1=aksiyonDriver.moveToElement(login).click().build();
      aksiyon1.perform();




    }
    }

