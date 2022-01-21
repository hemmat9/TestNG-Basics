package Class02;
import utils.CommonMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends CommonMethods {
    //@Test

    @Test(priority = 2, groups = "regression")
    public void adminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(priority = 1, groups = "regression")
    public void validationOfTitle() {
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        Assert.assertEquals(actuallTitle, expectedTitle);
        /*if (expectedTitle.equals(actuallTitle)) {
            System.out.println("test is passed");// using if-else conditon will not work here we should use assertion
        } else {
            System.out.println("test is failed");
        }*/
    }

}
