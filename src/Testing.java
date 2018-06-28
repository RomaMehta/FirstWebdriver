import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testing {
    static protected WebDriver driver;
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.manage().window().maximize();
            driver.get("http://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.id("FirstName")).sendKeys("Roma");

            // for selecting radio button
            driver.findElement(By.id("gender-female")).click();
            driver.findElement(By.id("LastName")).sendKeys("Mehta");

            // for dropdown menu
            driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='18']")).click();
            driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='2']")).click();
            driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='1986']")).click();

            //driver.findElement(By.name("DateOfBirthDay")).sendKeys("18");
            //driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");
            //driver.findElement(By.name("DateOfBirthYear")).sendKeys("1986");

            driver.findElement(By.id("Email")).sendKeys("dr.roma@gmail.com");
            driver.findElement(By.id("Company")).sendKeys("romamehta");
            driver.findElement(By.id("Newsletter")).click();
            driver.findElement(By.id("Password")).sendKeys("Test1234");
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
            driver.findElement(By.id("register-button")).click();


           String Expectedmsg = "Your registration completed";
            String Actualmsg = driver.findElement(By.xpath("//*[@class='result']")).getText();

            if (Expectedmsg.equals(Actualmsg)) {
                System.out.println("Test case PASS");
            } else {
                System.out.println("Test case FAIL");
            }
           // {System.out.println(driver.findElement(By.xpath("//*[@class ='message-error validation-summary-errors']")).getText());}
//why it does not print test case fail and close the browser??

            driver.close();

        }
}


