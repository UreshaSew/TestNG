import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//Default Execution order
@Test
public class AutomationPractice {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\TestNG\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
        System.out.println("1. Open Chrome & Application");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void Login() {
        driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("email")).sendKeys("TestNG@Framework.com");
        driver.findElement(By.id("passwd")).sendKeys("TestNG1234");
        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println("2. Sign In");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public void userSearch() {

        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("bule");
        driver.findElement(By.id("//*[@id='searchbox']/button")).click();
        System.out.println("2. Search For T-Shirt");

    }

    public void SignOut() {
        driver.findElement(By.id("//*[contains(text(),'Sign out')]")).click();
        System.out.println("3. Sign Out");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
