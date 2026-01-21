package GroupingInTestNG;

import org.testng.annotations.Test;

public class Signup {

    @Test(priority = 1, groups = {"regression"})
    void whatsapp(){
        System.out.println("sign up from whatsapp...");
    }

    @Test(priority = 2, groups = {"regression"})
    void facebook(){
        System.out.println("sign up from facebook...");
    }

    @Test(priority = 3, groups = {"regression"})
    void twitter(){
        System.out.println("sign up from twitter...");
    }
}
