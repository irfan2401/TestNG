package GroupingInTestNG;

import org.testng.annotations.Test;

public class Signin {

    @Test(priority = 1, groups = {"sanity"})
    void whatsapp(){
        System.out.println("sign in to whatsapp...");
    }

    @Test(priority = 2, groups = {"sanity"})
    void facebook(){
        System.out.println("sign in to facebook...");
    }

    @Test(priority = 3, groups = {"sanity"})
    void twitter(){
        System.out.println("sign in to twitter...");
    }
}
