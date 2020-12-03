import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLlinksCountInPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/boiaryntseva/Desktop/Libraries/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        //print all link in page
        System.out.println(driver.findElements(By.tagName("a")).size());
        //links count only in footer
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        //links only in the first column of footer
        WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        //click on the links in the first column
        for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++){
            columndriver.findElements(By.tagName("a")).get(i).click();
        }

    }
}
