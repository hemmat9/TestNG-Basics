package Class03;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class Paralleltest extends CommonMethods {

    @Test(groups = "Regression")
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(groups = "Regression")
    public void validationOfTitle(){
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        Assert.assertEquals(expectedTitle, actuallTitle);
        }
}



