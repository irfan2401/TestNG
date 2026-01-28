package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    //To perform post actions we use listeners
//for example if i am running a class in that class multiple test methods are there.
// from that some test methods may fail or some will pass or some will be skipped.
// for each conditions pass or fail or skip i want to perform some further actions
// these are known as post actions.

    //>for that i need to create:
    //>>create a test case
    //>>create listeners class
    //>>create xml file and include both test cases and listeners class.

    public void onStart(ITestContext context){
        System.out.println("Test execution is started...");
    }

    public void onTestStart(ITestResult result){
        System.out.println("Test started...");
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed...");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test failed...");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test skipped...");
    }

    public void onFinish(ITestContext context){
        System.out.println("Test execution is finished...");
    }

}
