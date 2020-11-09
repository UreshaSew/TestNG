import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifySign_OrangeHRM {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA_Projects_Interviews\\Test_Automation_University\\TestNG\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");
    }
    @Test()
    public void Login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
//        Assert.assertEquals(true,true,"The Welcome Link Is Not Correct On The Home Page");
//        Assert.assertFalse(false,"The Admin Tab Is Not Displayed On The Home Page");
//        Assert.assertTrue(true,"The Dashboard Is Not Correct On The Home Page");

        Assert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        Assert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");


    }
    public void SignOut(){
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]")).click();
    }
    @AfterClass
    public void tearDown ()
    {
        System.out.println("5. Close Chrome & Application");
        driver.quit();
    }
}
