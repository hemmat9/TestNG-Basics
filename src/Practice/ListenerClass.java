package Practice;
;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Taking the screenShot of the test having the name: "+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed the execution with the name: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("skipped the test execution for the test name: "+result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Strarting the execution with the name: "+result.getName());
    }

}
