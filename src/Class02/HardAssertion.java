package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HardAssertion extends CommonMethods {

    @Test
    public void validationOfTitle() {
        String actuallTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaagement System";
        Assert.assertEquals(actuallTitle, expectedTitle);//instead of if-else condtions we should use Assertion
        //it is a hard assertion it will stop the further execution of the code.
        /*if(actuallTitle.equals(expectedTitle)){
            System.out.println("test is passed");
        }else{
            System.out.println("test is faild");
        }*/
        WebElement username = driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("I am test code");

    }
}

