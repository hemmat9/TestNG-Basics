package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Priority extends CommonMethods {

    //@Test(priority=?)

    @Test(priority = 2)
    public void adminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(priority = 1)
    public void validationOfTitle() {
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        if (expectedTitle.equals(actuallTitle)) {
            System.out.println("test is passed");
        } else {
            System.out.println("test is failed");
        }
    }
}