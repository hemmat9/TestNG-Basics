package Class03;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class DataProviderDemo extends CommonMethods {

    @DataProvider// it is applicable only for small amount of data but for larger data this is not a good approach
    public Object[][] data(){//data driven test return 2D array
        Object[][] login = new Object[4][2];
        login[0][0] ="Admin";
        login[0][1] ="Hum@nhrm123";
        login[1][0] ="Admin";
        login[1][1] ="Hum@nhrm123";
        login[2][0] ="Admin";
        login[2][1] ="Hum@nhrm123";
        login[3][0] ="Admin";
        login[3][1] ="Hum@nhrm123";

        return login;
    }

    @Test(groups = "Regression", dataProvider = "data")
    public void adminLogin(String username, String password){
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

}
