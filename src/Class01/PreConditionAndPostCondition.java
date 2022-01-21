package Class01;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreConditionAndPostCondition {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {

        System.out.println("I am precondition");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("I am post condition");
    }

    @Test
    public void test() {

        System.out.println("I am actual test");
    }

    @Test
    public void anothertest() {

        System.out.println("I am another test");
    }
}
