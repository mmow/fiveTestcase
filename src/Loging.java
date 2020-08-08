import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Loging {
    WebDriver driver;
    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (2)//chromedriver_win32 (2)//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");

    }

}
