package GroupingInTestNG;

import org.testng.annotations.Test;

public class PaymentMethod {

    @Test(priority = 1, groups = {"sanity","regression"})
    void PaymentInRupees(){
        System.out.println("payment done in rupees..");
    }

    @Test(priority = 2, groups = {"sanity","regression"})
    void PaymentInDollars(){
        System.out.println("payment done in dollars..");
    }
}
