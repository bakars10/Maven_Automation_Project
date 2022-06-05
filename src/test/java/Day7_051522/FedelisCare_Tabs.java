package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FedelisCare_Tabs {

    public static void main(String[] args) throws InterruptedException {

        //set up your chrome driver with webdriver manager
        WebDriverManager.chromedriver().setup();;
        //ser chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver= new ChromeDriver(options);

        //navigate to fidelis site
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(3000);

        //click on shop for a plan
        //we are clicking on index 0 becayse there are two elements for this xpath
        driver.findElements(By.xpath("//*[text() = 'Shop For a Plan']")).get(0).click();
        //wait for a bit for page to load
        Thread.sleep(1000);
        //click on Medicaid Managed Care
        driver.findElements(By.xpath("//*[text() = 'Medicaid Managed Care']")).get(0).click();
        //wait for a bit for page to load
        Thread.sleep(1000);
        //click on search under find a doctor card
        driver.findElement(By.xpath("//*[@href = '/findadoctor']")).submit();
        //wait for a bit for page to load
        Thread.sleep(1000);

        //store new tabs in an array list, we use getWindowHandles methos to get list of tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab, it should be at index 1
        driver.switchTo().window(tabs.get(1));
        //click on new search button

        driver.findElement(By.xpath("//*[@class = 'fal fa-search-plus']")).click();
        //wait a bit
        Thread.sleep(1000);
        //close the new tab
        driver.close();
        //switch back to the default tab
        driver.switchTo().window(tabs.get(0));
        // then click on providers card
        driver.findElement(By.xpath("//*[@class = 'fal fa-stethoscope fa-fw']")).click();
        //wait until provider card is clicked on
        Thread.sleep(3000);


    }// end of main
}// end of class
