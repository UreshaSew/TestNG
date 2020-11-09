import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class OrangeHRM {

    WebDriver driver;

   @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA_Projects_Interviews\\Test_Automation_University\\TestNG\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");
    }
    @Test(dependsOnMethods = "setUp")
    public void Login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        System.out.println("2. Sign In");
    }
    @Test(dependsOnMethods = "Login")
    public void userSearch () {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("admin");
        driver.findElement(By.id("searchBtn")).click();
        System.out.println("3. Search For User");
    }
    @Test(dependsOnMethods = "userSearch")
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


