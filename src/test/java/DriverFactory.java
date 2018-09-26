import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");

        if (browser == null) {
            //return new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
            return new ChromeDriver();

        }
        switch (browser)
        {
            case "IE":
                return new InternetExplorerDriver();
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
                return new ChromeDriver();
            default:
                return new FirefoxDriver();
        }
    }
}
