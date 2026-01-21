package TestngConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    //Asserations are used for validations

    //HardAssertions
    //@Test
    /*void HardAssertions(){
        //Assert.assertEquals("abc","abc");
        //Assert.assertEquals("abc",123);
        //Assert.assertEquals(123, 123);

        //Assert.assertNotEquals(123, "abc");
        //Assert.assertNotEquals(123, 123);

        //Assert.assertTrue(false);
        //Assert.assertTrue(true);
        //Assert.assertFalse(false);
        //Assert.assertFalse(true);
        //Assert.assertTrue(1==1);

        //Assert.fail();

        //hard assertions fails when the conditions got failed then it will come out
        and will not execute the remaining statements so mostly we use soft assertions
    }*/

    @Test
    void SoftAssertions(){
        System.out.println("testing...");
        System.out.println("testing...");
        //similar methods are also used in soft assertions but the difference is that
        // we cannot use them directly so we have to create object for soft assertions
        // and with that reference variable we can use the methods in soft assertions
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("abc",123);
        System.out.println("testing...");
        System.out.println("testing...");

        sa.assertAll(); //it is mandatory
    }
}
