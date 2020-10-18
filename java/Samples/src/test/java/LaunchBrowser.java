import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
       // WebDriver driver = new FirefoxDriver();  // Uncomment  and  comment the chromedriver line to run Firefox

        //Next two lines for Chromedriver
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver"); //Path to chromedriver if you not set in bash/env varaible
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");  //Change this URL with your app URL and try
        Thread.sleep(5000);
        driver.quit();

    }
}
