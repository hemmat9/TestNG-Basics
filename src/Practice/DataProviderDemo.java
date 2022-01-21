package Practice;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DataProviderDemo {
    WebDriver driver;
    @DataProvider
    public Object [][] data(){
        Object[][] login= new Object[2][2];
        login[0][0]="Admin";
        login[0][1]="Hum@nhrm123";
        login[1][0]="Admin";
        login[1][1]="Hum@nhrm123";

        return login;
    }
    @BeforeMethod
    public void loginToBrowser(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @Test (dataProvider = "data")
    public void loginWithCredintials(String username, String password){
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password, Keys.ENTER);
    }
    @AfterMethod
    public void tearDown(){
        TakesScreenshot  ss = (TakesScreenshot) driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot , new File("ScreenShot/Syntax/Login.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
