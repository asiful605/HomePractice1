import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
    public static void main(String[] args) {

        // we created path for webdriver
        System.setProperty("webdriver.chrome.driver","BrowserDriver\\windows\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        // navigate to ebay
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //search for a product
        driver.findElement(By.id("gh-ac")).sendKeys("S20 ultra");
        driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3/span")).click();
        driver.findElement(By.cssSelector("#msku-sel-1")).click();
        driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[1]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[2]/div/div/ul/li[3]/h2")).click();


    }

}



