package TestngConcepts;

import org.testng.annotations.*;

public class AllAnnotations {

    //annotations are used for order of execution

    @BeforeSuite
    void bs(){
        System.out.println("this is before suite..");
    }

    @AfterSuite
    void as(){
        System.out.println("this is after suite..");
    }

    @BeforeTest
    void bt(){
        System.out.println("this is before test..");
    }

    @AfterTest
    void at(){
        System.out.println("this is after test..");
    }

    @BeforeClass
    void bc(){
        System.out.println("this is before class..");
    }

    @AfterClass
    void ac(){
        System.out.println("this is after class..");
    }

    @BeforeMethod
    void bm(){
        System.out.println("this is before method..");
    }

    @AfterMethod
    void am(){
        System.out.println("this is after method..");
    }

    @Test
    void search(){
        System.out.println("this is search..");
    }

    @Test
    void advSearch(){
        System.out.println("this is adv search..");
    }
}
