package TestngConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

    //by default testng will execute all test cases if one test case fails also it will
    //continue to execute other test cases. so that we are using dependency methods
    // if one test case gets failed it skip the other test cases

    @Test(priority = 1)
    void openapp(){
        Assert.assertTrue(true);
    }

    @Test(priority = 2, dependsOnMethods = {"openapp"})
    void login(){
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    void search(){
        Assert.assertTrue(false);
    }

    @Test(priority = 4, dependsOnMethods = {"login", "search"})
    void advsearch(){
        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout(){
        Assert.assertTrue(true);
    }


}
