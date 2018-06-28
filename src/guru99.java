import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class guru99 {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        //chromedriver path - got by right clicking the chromedriver.exe file and copy pasting the the path.

        driver = new ChromeDriver();
        // declaring the driver.

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        // setting time-limit for the browser incase the internet speed is slow.

        driver.manage().window().maximize();
        // to maximize the browser window.

        driver.get("http://demo.guru99.com/v4/");
        // to enter the url in the browser

        driver.findElement(By.name("uid")).sendKeys("mngr139537");
        driver.findElement(By.name("password")).sendKeys("banAnUg");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("New Customer")).click();
        driver.findElement(By.name("name")).sendKeys("Dave Smith");
        driver.findElement(By.id("dob")).sendKeys("01/01/1980");
        driver.findElement(By.name("addr")).sendKeys("2 NorthPole Home");
        driver.findElement(By.name("city")).sendKeys("Kansas");
        driver.findElement(By.name("state")).sendKeys("Texas");
        driver.findElement(By.name("pinno")).sendKeys("110023");
        driver.findElement(By.name("telephoneno")).sendKeys("012345678910");
        driver.findElement(By.name("emailid")).sendKeys("davesmith@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.name("sub")).click();

        System.out.println(driver.switchTo().alert().getText());
        // to print alert msg

        driver.close();
        // to close the browser
    }
}
