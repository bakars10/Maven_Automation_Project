package Day10_052822;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Example {

    //set webdriver/declare outside so it is global and is resubale with other annotation methods
    WebDriver driver;

//before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field
    @Test(priority = 1)
    public void SearchforKeyword(){
        driver.navigate().to("https://www.google.com");
        //enter a keyword in search field
        Reusable_Actions.sendKeysAction(driver, "//*[@name='q']", "BMW", "Search Field");
        Reusable_Actions.submitAction(driver, "//*[@name='btnK']", "Search button");
    }//end of test 1

    /*
    dependsOnMethods used when  following @Test is dependent on previous @Test method. Then If the first test fails,
    the dependent test will get skipped
     */

    @Test(dependsOnMethods = "SearchforKeyword")
            //use depends on methods since both test cases correlate
            //test 2 will only execute as long as test 1 passes
    public void CaptureSearchNumber(){
        //capture search result
       String result = Reusable_Actions.getTextAction(driver, "//*[@id='result-stats']", "Search Result Text");
       //split the result by single space and print out search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite


}
