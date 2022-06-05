package Day9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWay {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);

        //set up your global implicit wait right after your webdriver
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //if time limit is not done by 8 seconds it will stop and fail your script
        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //call mouse actions
        Actions actions = new Actions(driver);


        //declare and define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,8);

        //hover to quick tools
        WebElement quickTools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tools']")));
        actions.moveToElement(quickTools).perform();

        //click on track a package
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();


        //click on and then type on track a package field
        WebElement packageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        packageField.click();
        packageField.sendKeys("73827382282");






    }//end of main
}//end of class
