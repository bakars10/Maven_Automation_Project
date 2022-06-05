package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class WeightWatchers {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ;
        //ser chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);


        //navigate to weightwatchers site
        driver.navigate().to("https://www.weightwatchers.com");
        Thread.sleep(3000);

        ArrayList<String> zipcodes = new ArrayList<>();
        zipcodes.add("11417");
        zipcodes.add("11218");
        zipcodes.add("10022");

        for (int i = 0; i < zipcodes.size(); i++) {
            try {
                WebElement workshopButton = driver.findElement(By.xpath("//*[@class='Icon_icon__wrapper__h-IbJ']"));
                workshopButton.click();
                Thread.sleep(1000);

            } catch (Exception e) {
                //print the statement
                System.out.println("unable to locate the workshopButton" + e);
            }//end of exception

            try {
                //inspection the unlimited Button
                WebElement unlimitedwkshp= driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']"));
                unlimitedwkshp.click();

            } catch (Exception e) {
                //print the statement
                System.out.println("Unable to click unlimitedButton workshop" + e);
            }
            try {
                //inspect the studio button
                WebElement studioButton = driver.findElement(By.xpath("//span[text() = 'Studio']"));
                studioButton.click();
                Thread.sleep(1000);

            } catch (Exception e) {
                //printing
                System.out.println("Unable to click on studio" + e);
            }//end of exception

            try {
                //inspect the zipSearch bar
                WebElement zipSearch = driver.findElement(By.xpath("//*[@title='location-search']"));
                zipSearch.clear();
                zipSearch.sendKeys(zipcodes.get(i));

            } catch (Exception e) {
                //printout the statement
                System.out.println("Unable to clear and enter new zipcode" + e);
            }//end of exception
            try {
                //click on search arrow
                WebElement searchArrow = driver.findElement(By.xpath("//*[@id = 'location-search-cta']"));
                searchArrow.click();
                Thread.sleep(2000);
            } catch (Exception e) {
                //printout the statement
                System.out.println("Unable to search button " + e);
            }//end of exception


            //get list of studios and click on studio link
            try {
                ArrayList<WebElement> searchResults = new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")));
                if (i == 0) {
                    searchResults.get(1).click();
                } else if (i == 1) {
                    searchResults.get(2).click();
                } else if (i == 2) {
                    searchResults.get(0).click();
                }// end of else if

            } catch (Exception e) {
                System.out.println("Unable to see list of studio locations" + e);
            }//end of exception

            //print studio address
            try {
                String studioAddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                Thread.sleep(2000);
                System.out.println("The address for the studio is" + studioAddress);
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to print studio address" + e);
            }//end of exception
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll 0,400");

            } catch (Exception e) {
                //printing exception
                System.out.println("Unable to scroll " + e);
            }//end of exception



            //print studio schedule
            try {
                String studioSchedule = driver.findElement(By.xpath("//*[@class = 'scheduleContainerMobile-1RfmF']")).getText();
                Thread.sleep(1000);
                System.out.println("The schedule for the studio is " + studioSchedule);
            } catch (Exception e) {
                System.out.println("unable to print studio schedule " + e);
            }//end of exception

       }//end of for loop
        //quit chrome
driver.quit();

    }//end of main
}// end of class
