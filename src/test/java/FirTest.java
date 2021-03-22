import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirTest {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String searchFieldXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";

        WebElement searchElement = driver.findElement(By.xpath(searchFieldXpath));
        searchElement.sendKeys("softserve it academy");
        searchElement.submit();

        String searchUrl = "//*[@id=\"rso\"]/div/div[1]/div/div[1]/a/div/cite";

        WebElement adsList= driver.findElement(By.xpath(searchUrl));

        adsList.click();
        System.out.println(adsList);
       /* String searchUrl = "//*[@id=\"rso\"]/div/div[1]/div/div[1]/a/h3";
        WebElement searchUurl = driver.findElement(By.xpath(searchUrl));
        searchElement.submit();*/
        driver.quit();
    }
}
