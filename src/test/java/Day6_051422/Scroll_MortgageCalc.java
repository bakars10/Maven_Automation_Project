package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-fullscreen");
        WebDriver driver= new ChromeDriver(options);

//navigate to mortgagecalc.com
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //declare java script executor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to pixel 400 on mortgage calc website
        //use if you want to specifically scroll to certain # pixel amt. jse.executeScript("scroll(0,400)");
        //wait a bit
        //Thread.sleep(2000);

//declare webelement variable that we want to scroll into- ie. share button
        WebElement shareButton = driver.findElement(By.xpath("//*[@id = 'share_button']"));

        // scroll into the share this calc button
        jse.executeScript("arguments[0].scrollIntoView(true);", shareButton);
        Thread.sleep(2000);
        //click on share this calc button
        shareButton.click();
        Thread.sleep(2000);
        //scroll back up
        jse.executeScript("scroll(0,-400)");
        Thread.sleep(2000);
        //quit the chrome driver
        driver.quit();

    }//end of main
}// end of class
