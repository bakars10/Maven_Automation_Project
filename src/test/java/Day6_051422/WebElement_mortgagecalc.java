package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_mortgagecalc {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //ser chrome options arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver= new ChromeDriver(options);


        //navigate to mortagecalc site
        driver.navigate().to("http://mortgagecalculator.org");
        Thread.sleep(3000);

        //click, clear and enter new value on Home value field
        //we are performing 3 actions
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.click();
        homeValue.clear();
        Thread.sleep(1500);
        homeValue.sendKeys("450000");



        //click on % radio button
        driver.findElement(By.xpath("//*[@id='downpayment']"));

        //click, clear and enter new data on down payment field
        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downPayment.click();
        downPayment.clear();
        Thread.sleep(1500);
        downPayment.sendKeys("5");

        // click, clear and enter new data for interest rate
        WebElement interestRate = driver.findElement(By.xpath("//*[@id='intrstsrate']"));
        interestRate.click();
        interestRate.clear();
        Thread.sleep(1500);
       interestRate.sendKeys("4.2");



    }//end of main
}// end of class
