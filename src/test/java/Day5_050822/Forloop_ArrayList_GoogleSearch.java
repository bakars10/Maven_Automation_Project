package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Forloop_ArrayList_GoogleSearch {

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
        //options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver







        // capture search number and print for following cities using arraylist and for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Staten Island");

        //start for loop

        for(int i = 0; i < cities.size(); i++) {
            // go to Google home page
            driver.navigate().to("https://www.google.com");
            Thread.sleep(3000);
            //maximize the driver
            driver.manage().window().maximize(); // for mac we use maximize, for window use .fullscreen;

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));
            //submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(2500);
            //capture the google search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //System.out.println(" Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            //String replaceParanth = arrayResult[3].replace.("(replace(")","");
            System.out.println(" My search number for city " + cities.get(i) + " is " + arrayResult[1]);
        }// end of for loop
                    //quit the driver

            driver.quit();



    }//end of main
}// end of java class
