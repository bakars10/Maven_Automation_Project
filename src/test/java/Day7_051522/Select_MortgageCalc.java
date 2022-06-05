package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class Select_MortgageCalc {
    public static void main(String[] args) throws InterruptedException {

        //set up your chrome driver with webdriver manager
        WebDriverManager.chromedriver().setup();;
        //ser chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver= new ChromeDriver(options);

       //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //select start month from the drop down **one way od selecting month**
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //define select command
        //Select dropDown = new Select(startMonth);
        //select by visible text
       //dropDown.selectByVisibleText("Jun");

        //clicking on drop down and its value if the dropdown tag is not under select tag **second way**
        startMonth.click();
        //click on value of the start month
        driver.findElement(By.xpath("//*[text()='Jun']")).click();



        //select loan type from the drop down
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));
        //define select command
        Select loanTypeDropdown = new Select(loanType);
        //select by visible text
        loanTypeDropdown.selectByVisibleText("FHA");

    }//end of main

}//end of class
