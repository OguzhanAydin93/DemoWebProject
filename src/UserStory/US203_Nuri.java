package UserStory;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class US203_Nuri extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");
    }

}
