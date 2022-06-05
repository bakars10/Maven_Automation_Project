package Day12_060422;

import ReusableClasses.Reusable_Actions_Loggers;
import ReusableClasses.Reusable_Annotations_Class;
import ReusableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import static ReusableClasses.Reusable_Annotations_Class.driver;

public class Boolean_With_Google_Checkbox extends Reusable_Annotations_Class {

    @Test(priority = 1)
    public void Yahoo_Stay_Signed_in_Checkbox_Verification() {
        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com");
        //click on sign in
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Sign in']", logger, "Sign in");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        if (elementState == true) {
            logger.log(LogStatus.PASS, "Checkbox is selected as expected");
        } else {
            logger.log(LogStatus.FAIL, "Checkbox is not selected");
        }
    }//end of test



    @Test(priority = 2)
    public void NavigatetoYahooHome(){
        //navigate to homepage
        logger.log(LogStatus.INFO, "Navigate to home page");
        driver.navigate().to("https://www.yahoo.com");
    }// end of test


}// end of class

