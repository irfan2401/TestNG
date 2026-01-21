package TestngConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmTestcases {
     WebDriver driver;

     @Test(priority = 1)
     void openapp(){
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();

     }

     @Test(priority = 2)
     void testlogo(){
         boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
         System.out.println("Image displayed: "+status);
     }

     @Test(priority = 3)
     void testlogin(){
         driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//*[@type='submit']")).click();
     }

     @Test(priority = 4)
    void testclose(){
         driver.quit();
     }
}
