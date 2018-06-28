import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Gmail {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");

        driver.findElement(By.id("firstName")).sendKeys("Rodney");
        driver.findElement(By.id("lastName")).sendKeys("Rohan");
        driver.findElement(By.id("username")).sendKeys("rodneyrohan5@gmail.com");
        driver.findElement(By.name("Passwd")).sendKeys("Test@1234");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content/span")).click();

        driver.findElement(By.id("phoneNumberId")).sendKeys("07712166338");
        driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/content/span")).click();
        //did not do beyond this because of ph number verification issue.
    }
}
