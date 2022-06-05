package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {

    public static void main(String[] args) throws InterruptedException {
        // go to bing, click on second element of the links by using class & index
        //set up chrome driver with webdrive
        WebDriverManager.chromedriver().setup();;
        //ser chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver= new ChromeDriver(options);

//navigate to bing.com
        driver.navigate().to("https://www.bing.com");
                Thread.sleep(3000);
        //click on images using class property with index of 1
        //to ignore white space in the property value we can use contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();






    }// end of main
}// end of class
