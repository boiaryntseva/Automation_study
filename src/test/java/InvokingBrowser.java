import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/boiaryntseva/Desktop/Libraries/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
}
