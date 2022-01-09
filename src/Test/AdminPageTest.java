package Test;
import Pages.AdminPage;
import TestBase.BaseClass;
import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class AdminPageTest {
    @BeforeMethod
    public void before(){
        BaseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
    }
    @Test
    public void test1(){
        AdminPage adminPage = new AdminPage();
        WebElement user = adminPage.username;
        CommonMethods.sendingText(user, "Admin");
        WebElement pass = adminPage.password;
        CommonMethods.sendingText(pass, "");
        adminPage.loginBtn.click();
        WebElement passwordMsg = adminPage.passMsg;
        CommonMethods.printText(passwordMsg);
    }
    @AfterMethod
    public void after(){
        CommonMethods.takeSS("AdminPage");
        CommonMethods.tearDown();
    }
}
