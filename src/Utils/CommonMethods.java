package Utils;

import TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static void sendingText(WebElement element, String text){

     element.clear();
     element.sendKeys(text);


    }
    public static void takeSS(String filename){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
                FileUtils.copyFile(sourceFile, new File("Screenshot/testNg" + filename + ".png"));

        } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void printText(WebElement element){
            System.out.println(element.getText());
        }

    }

