package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
   static int counter;
   public static WebDriver driver;

   @BeforeMethod(alwaysRun = true)
   public static void openBrowserandLaunchApplication() {
      ConfigReader.readProperties("C:\\Users\\farha\\IdeaProjects\\TestNGBasicsBatch11\\src\\Config\\config.properties");
      switch (ConfigReader.getPropertyValue("browser")) {
         case "chrome":
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            driver = new ChromeDriver();
            break;
         case "firfox":
            System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
            driver = new ChromeDriver();
            break;
         default:
            throw new RuntimeException("Invalid browser name");

      }
      driver.manage().window().maximize();
      driver.get(ConfigReader.getPropertyValue("url"));
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }


   @AfterMethod (alwaysRun = true)
   public void closeBrowser(){
      driver.quit();
   }
   public static void takeScreenShot(){

      TakesScreenshot tss = (TakesScreenshot) driver;

      File sourceFile = tss.getScreenshotAs(OutputType.FILE);

      try {
         FileUtils.copyFile(sourceFile, new File("ScreenShots/syntaxEmplpoyee/emplyee"+(counter)+".png"));
      } catch (IOException e) {
         e.printStackTrace();
      }
   counter++;
   }
}
