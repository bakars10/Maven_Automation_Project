package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class A3_SeleniumWebdriver {

    public static void main(String[] args) throws InterruptedException {

        //declare your chrome and webdriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);




        /*
       Go to bing.com
       using ArrayList variable with 5 values,
       using for or while loop create scenarios
       1. go to bing.com
       2. put few seconds to wait
       3. enter a keyword on a search field
       4. click on search button
       5. wait few secomds
       capture search message
       7. split and print out onlu search number for each values
       8. outside of loop, quit the driver

        */


        ArrayList<String> sports = new ArrayList<>();
        sports.add("basketball games");
        sports.add("baseball games");
        sports.add("soccer games");
        sports.add("football games");
        sports.add("tennis games");


        for (int i = 0; i < sports.size(); i++) {
        //1. go to bing homepage
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        //maximize window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));
        //click on search
        driver.findElement(By.xpath("//*[@cx='9']")).submit();
        Thread.sleep(2000);
        String searchResult = driver.findElement(By.xpath("//*['class = sb_count']")).getText();
        //System.out.println(" Result is " + searchResult);
//extract out number and only print search number
        String[] arrayResult = searchResult.split(" ");

        System.out.println("Results for  " + sports.get(i) + "is" + arrayResult[0]);





    }//end of for loop


driver.quit();


    }// end of main
}// end of java class
