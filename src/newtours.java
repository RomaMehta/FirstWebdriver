import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class newtours {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");

driver.findElement(By.name("firstName")).sendKeys("Sam");
driver.findElement(By.name("lastName")).sendKeys("John");
driver.findElement(By.name("phone")).sendKeys("01123456789");
driver.findElement(By.id("userName")).sendKeys("samjohn@gmail.com");
driver.findElement(By.name("address1")).sendKeys("14 Saunders Avenue");
driver.findElement(By.name("address2")).sendKeys("Maybridge Road");
driver.findElement(By.name("city")).sendKeys("Houston");
driver.findElement(By.name("state")).sendKeys("Texas");
driver.findElement(By.name("postalCode")).sendKeys("1100223");
driver.findElement(By.id("email")).sendKeys("samjohn@gmail.com");
driver.findElement(By.name("password")).sendKeys("Test1234");
driver.findElement(By.name("confirmPassword")).sendKeys("Test1234");
driver.findElement(By.name("register")).click();

        String ExpectedMessage = "sign-in";
        String ActualMessage = driver.findElement(By.xpath(".//*[@href ='mercurysignon.php']")).getText();
        System.out.println(driver.findElement(By.xpath(".//*[@href ='mercurysignon.php']")).getText());

        if (ActualMessage.equals(ExpectedMessage))
        {System.out.print("Test case is PASS");}
        else {System.out.print("Test case is FAIL");}

        driver.close();

    }

}
