package TestngConcepts;
import org.testng.annotations.Test;

public class Main {

    @Test(priority = 1)
    void openapp() {
        System.out.println("successfully opened the app");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("login in to application..");
    }

    @Test(priority = 3)
    void logout() {
        System.out.println("logout from application..");
    }
}