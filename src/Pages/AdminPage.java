package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends CommonMethods {
    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement username;
    @FindBy (xpath = "//input[@id='txtPassword']")
    public WebElement password;
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginBtn;
    @FindBy (xpath = "//span[@id='spanMessage']")
    public WebElement passMsg;


    public AdminPage(){
        PageFactory.initElements(driver, this);
    }
}
