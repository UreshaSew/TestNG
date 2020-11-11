import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    @Test
    @Parameters({"URL","BrowserType"})
    public void Verify(String url, String browserType){
        if  (browserType.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver","E:\\QA_Projects_Interviews\\Test_Automation_University\\TestNG\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "E:\\QA_Projects_Interviews\\Test_Automation_University\\TestNG\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        System.out.println("\n" + "Open " + browserType);
        System.out.println("   " +  driver.getTitle());
        System.out.println("Close " + browserType + "\n");

        driver.quit();
    }
}
