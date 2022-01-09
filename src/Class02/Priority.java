package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Priority {
    WebDriver driver;
    //pre condition @before method --- launch browser and navigate url

    @BeforeMethod
    public void openBrowserandLaunchApplication(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //@Test(priority=?)

    @Test(priority = 2)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test (priority = 1)
    public void validationOfTitle(){
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        if(expectedTitle.equals(actuallTitle)){
            System.out.println("test is passed");
        }else{
            System.out.println("test is failed");
        }
    }

    //post condition @after method -- close browser

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
