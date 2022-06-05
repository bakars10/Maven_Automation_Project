package Day11_052922;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Boolean_With_Checkbox {

    //set webdriver/declare outside so it is global and is resubale with other annotation methods
    WebDriver driver;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation

    @Test()
    public void Yahoo_Stay_Signed_in_Checkbox_Verification() throws InterruptedException {
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on sign in
        Reusable_Actions.clickAction(driver, "//*[text()='Sign in']", "Sign in");
        Thread.sleep(2500);
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        System.out.println(" is element checked? " + elementState);


    }//end of test

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }// end of after suit
}

