import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPageTest {
    protected WebDriver driver;

    public static String registerUrl="https://giris.hepsiburada.com/?ReturnUrl=https%3A%2F%2Foauth.hepsiburada.com%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DSPA%26redirect_uri%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252Fuyelik%252Fcallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%26state%3Ddf493100a0aa4e3bb51c8e8dcf738ec9%26code_challenge%3DtsffuTU3S6zXB_M3FzS6p3AsmYJcybIpHsWJ2MjErUo%26code_challenge_method%3DS256%26response_mode%3Dquery%26ActivePage%3DSIGN_UP%26oidcReturnUrl%3Dhttps%253A%252F%252Fwww.hepsiburada.com%252F";
    public static String mailUrl="https://mail.google.com/mail/u/0/#inbox/FMfcgzGqRZhTqpRtNwhPqRSSHNKxtJfq";


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Salim Kartal/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void correctLogin() {
        driver.get(registerUrl);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("txtEmail")).sendKeys("mail");
        driver.findElement(By.id("btnSignUpSubmit")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(mailUrl);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/docs/configuration']")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("txtName")).sendKeys("Salim");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("txtSurName")).sendKeys("Salim");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("txtNewPassEmail")).sendKeys("Salim");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
