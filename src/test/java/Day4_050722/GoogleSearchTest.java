package Day4_050722;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {

        //set up your chrome driver with webdrivermanager, do so by calling command
        WebDriverManager.chromedriver().setup();
        //define the webdriver I am going to use (ie. crhome)
        WebDriver driver = new ChromeDriver();


        //simply go to Google home page
        driver.navigate().to("https://www.google.com");
        //maximize the driver
        driver.manage().window().maximize(); // for mac we use maximize, for window use .fullscreen;

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //capture the google search and print it
        String searchResult= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println(" Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        //String replaceParanth = arrayResult[3].replace.("(replace(")","");
        System.out.println(" My search number is " + arrayResult[1]);
        //quit the driver
        //driver.quit();

    }//end of main
}// end of java class
