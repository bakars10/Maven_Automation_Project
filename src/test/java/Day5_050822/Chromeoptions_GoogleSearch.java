package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //define the webdriver I am going to use (ie. crhome)
        //setup chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-fullscreen");
                //define the webdriver i am going to use
        //add headless so it runs in backround
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        //simply go to Google home page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //maximize the driver
        driver.manage().window().maximize(); // for mac we use maximize, for window use .fullscreen;

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(2500);
        //capture the google search and print it
        String searchResult= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println(" Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        //String replaceParanth = arrayResult[3].replace.("(replace(")","");
        System.out.println(" My search number is " + arrayResult[1]);
        //quit the driver
        //driver.quit();

    }// end of main
}// end of java class
