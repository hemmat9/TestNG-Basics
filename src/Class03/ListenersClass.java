package Class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {//we have to implement ITestListener interface


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting the execution with test: "+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Taking the screenShot of the test having the name: "+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failed the screenShot of the test having the name: "+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped the screenShot of the test having the name: "+ result.getName());
    }

    //we implement it in .xml
}
