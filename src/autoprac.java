import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class autoprac {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php?controller=authentication");

        driver.findElement(By.id("email_create")).sendKeys("smithdave1@gmail.com");
        driver.findElement(By.name("SubmitCreate")).click();

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Dave");
        driver.findElement(By.id("customer_lastname")).sendKeys("Smith");
        driver.findElement(By.id("passwd")).sendKeys("Test1234");
        driver.findElement(By.id("days")).sendKeys("20");
        driver.findElement(By.id("months")).sendKeys("November");
        driver.findElement(By.id("years")).sendKeys("1980");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();

        //driver.findElement(By.id("firstname")).sendKeys("Dave");
        //driver.findElement(By.id("lastname")).sendKeys("Smith")
        // prints double

        driver.findElement(By.id("company")).sendKeys("Smithson");
        driver.findElement(By.id("address1")).sendKeys("14 Mayfair Avenue");
        driver.findElement(By.id("address2")).sendKeys("Burbick Road");
        driver.findElement(By.id("city")).sendKeys("Houston");
        driver.findElement(By.id("id_state")).sendKeys("Texas");
        driver.findElement(By.name("postcode")).sendKeys("11023");
        driver.findElement(By.id("other")).sendKeys("Demo testing");
        driver.findElement(By.id("phone")).sendKeys("01123456789");
        driver.findElement(By.id("phone_mobile")).sendKeys("07788991122");
        driver.findElement(By.id("submitAccount")).click();

       /* String actualmessage = driver.findElement(By.xpath("//ol/li")).getText();
        if (actualmessage.contains("already been registered")) {
            System.out.println("Test is passed since the user is already registered");
            System.out.println("Try changing the email address, in the code above and you should be able to register");*/

       String Expectedmessage = "An account using this email address has already been registered. Please enter a valid password or request a new one. ";
        String Actualmessage = driver.findElement(By.xpath("//*[@id = 'create_account_error']/ol/li")).getText();
        System.out.println(driver.findElement(By.xpath("//*[@id = 'create_account_error']/ol/li")).getText());

        if (Expectedmessage .equals(Actualmessage)){System.out.println("Test case is Pass");}
        else {System.out.println("Test case is Fail");}
//why am i not able to print pass or fail??
       // driver.close();
        // why the browser is not closed??


        }
    }

