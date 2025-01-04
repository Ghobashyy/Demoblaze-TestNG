package basesteps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseSteps {
    public WebDriver driver;
    public HomePage homepage;

    @BeforeClass
    public void openbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }
    @BeforeMethod
    public void openhomepage(){
        driver.get("https://demoblaze.com/index.html");
    }
    @AfterClass
    public void closebrowser(){
        driver.quit();
    }
}
