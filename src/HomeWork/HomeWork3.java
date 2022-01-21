package HomeWork;

import utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeWork3 {
    int counter=1;
    WebDriver driver;

    @DataProvider
    public Object[][] data() {
        Object[][] employee = new Object[5][4];
        employee[0][0] = "John";//name
        employee[0][1] = "Muir";//lastname
        employee[0][2] = "Muir@John";//username
        employee[0][3] = "Far@nhrm123";//password
        employee[1][0] = "Jose";
        employee[1][1] = "Rodriguez";
        employee[1][2] = "Jose@Rodriguez";
        employee[1][3] = "Far@nhrm123";
        employee[2][0] = "Jennifer";
        employee[2][1] = "Hilard";
        employee[2][2] = "Jennifer@Hilard";
        employee[2][3] = "Far@nhrm123";
        employee[3][0] = "Jane";
        employee[3][1] = "Doe";
        employee[3][2] = "Jane@Doe";
        employee[3][3] = "Far@nhrm123";
        employee[4][0] = "Fawad";
        employee[4][1] = "Mirdad";
        employee[4][2] = "Fawad@Mirdad";
        employee[4][3] = "Far@nhrm123";

        return employee;
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowserandLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[2]")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
    }

    @Test(groups = "regression", dataProvider = "data")
    public void addEmployee(String firstName, String lastName,String username, String password) {

        driver.findElement(By.cssSelector("input#firstName")).sendKeys(firstName);
        driver.findElement(By.cssSelector("input#lastName")).sendKeys(lastName);
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys(username);
        driver.findElement(By.cssSelector("input#user_password")).sendKeys(password);
        driver.findElement(By.cssSelector("input#re_password")).sendKeys(password);
        driver.findElement(By.cssSelector("input#btnSave")).click();

}
@AfterMethod(alwaysRun = true)



    public void closeWebPage(){
    TakesScreenshot ts = (TakesScreenshot) driver;
    File ss = ts.getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(ss, new File("screenshot/SyntaxEmployee/employee"+counter+".png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
        counter++;
        driver.quit();

}
}