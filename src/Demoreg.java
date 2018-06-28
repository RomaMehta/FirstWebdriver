import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demoreg {

    static protected WebDriver driver;
    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://demoqa.com/registration/");
        driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys("David");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Rose");
        driver.findElement(By.xpath("//input[@name='radio_4[]'and @value='married']")).click();
        driver.findElement(By.xpath("//input[ @value='cricket ']")).click();
        driver.findElement(By.xpath("//input[ @value='reading']")).click();
        driver.findElement(By.xpath("//select[@id='dropdown_7']/option[@value='United Kingdom']")).click();
        driver.findElement(By.xpath("//select[@id='mm_date_8']/option[@value='11']")).click();
        driver.findElement(By.xpath("//select[@id='dd_date_8']/option[@value='22']")).click();
        driver.findElement(By.xpath("//select[@id='yy_date_8']/option[@value='1988']")).click();
        driver.findElement(By.id("phone_9")).sendKeys("08765432109");
        driver.findElement(By.id("username")).sendKeys("David123");
        driver.findElement(By.id("email_1")).sendKeys("David123@gmail.com");
        driver.findElement(By.id("description")).sendKeys("Keep Calm Carry On");
        driver.findElement(By.id("password_2")).sendKeys("Test@1234");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//input[@name='pie_submit']")).click();

        String actualresult=driver.findElement(By.xpath("//div[@class='entry-content']/p")).getText();
        if (actualresult.contains("already exists"))
        {
              System.out.println("The email/username is already used to register. Please register with other details.");
        }
        driver.close();
        }
    }
