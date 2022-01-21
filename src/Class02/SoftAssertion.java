package Class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

public class SoftAssertion extends CommonMethods {

    @Test(groups = "Regression")
    public void verifyAndValidateSoftAssertion() {

        SoftAssert soft = new SoftAssert();
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaagement System";
        soft.assertEquals(actuallTitle, expectedTitle);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcometxt = driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
        soft.assertTrue(welcometxt.isDisplayed());

        System.out.println("I am still executing even after failing the test above");


        soft.assertAll();//should be the last line of test case
    }
}