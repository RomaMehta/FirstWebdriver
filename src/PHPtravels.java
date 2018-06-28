import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PHPtravels{
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.phptravels.net/register");

        driver.findElement(By.name("firstname")).sendKeys("David");
        driver.findElement(By.name("lastname")).sendKeys("Rose");
        driver.findElement(By.name("phone")).sendKeys("0712345678");
        driver.findElement(By.name("email")).sendKeys("davidrose@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.name("confirmpassword")).sendKeys("Test1234");
        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();

        String Alrtmsg1 = "Email Already Exists.";
        String Actalrtmsg = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[2]/div")).getText();
        System.out.println(Actalrtmsg);

        if (Alrtmsg1.equals(Actalrtmsg))
        { System.out.println("Test case Pass");}

        driver.close();
    }

    }
