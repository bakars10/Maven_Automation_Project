package AppleBankAutomation;

import ReusableLibraries.Reusable_Actions;
import ReusableClasses.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppleBankTestCases {
    //declare the local driver outside so that it can be reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }//end of before suite annotation


    @Test(priority = 1)
    public void requestinformation(){
        logger = reports.startTest("Click on Invest");
        driver.navigate().to("https://www.applebank.com");
        //click on invest tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[@aria-label='Invest']", logger,"Invest Tab");
        //click on request information
        Reusable_Actions_Loggers.clickAction(driver, "//*[@title='Request Information']", logger, "Request info tab");
        //click on first name tab
        Reusable_Actions_Loggers.clickAction(driver,"//input[@id='ctl00_Main_CMSPagePlaceholder2_lt_zoneMain_BizForm_viewBiz_TextBoxControl_html5input']", logger, "First name field");
       //type in first name
        Reusable_Actions_Loggers.sendKeysAction(driver,"//input[@id='ctl00_Main_CMSPagePlaceholder2_lt_zoneMain_BizForm_viewBiz_TextBoxControl_html5input']", "Sabina", logger,"First name entry");
        //type in last name
        Reusable_Actions_Loggers.sendKeysAction(driver, "//input[@id='ctl00_Main_CMSPagePlaceholder2_lt_zoneMain_BizForm_viewBiz_TextBoxControl_1_html5input']", "Bakar", logger, "Last name entry");
        //type in address
        Reusable_Actions_Loggers.sendKeysAction(driver, "//input[@autocomplete='street-address']", "7607", logger, "Address entry");
        //type in city
        Reusable_Actions_Loggers.sendKeysAction(driver, "//input[@autocomplete='address-level2']", "Ozone Park", logger, "City entry");
        // select state from drop down
       WebElement stateselect = driver.findElement(By.xpath("//*[@id='ctl00_Main_CMSPagePlaceholder2_lt_zoneMain_BizForm_viewBiz_DropDownListControl_dropDownList']"));
        Select stateDropdown = new Select(stateselect);
        //select by visible text
        stateDropdown.selectByVisibleText("Alabama");
        //enter zipcode
        Reusable_Actions_Loggers.sendKeysAction(driver, "//input[@name='ctl00$Main$CMSPagePlaceholder2$lt$zoneMain$BizForm$viewBiz$uszipcode$txtZIPCode']", "11417", logger, "zipcode");
        //enter email
        Reusable_Actions_Loggers.sendKeysAction(driver, "//input[@type='email']", "sabina.bakar@gmail.com", logger, "email");
        //enter phone #
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='ctl00_Main_CMSPagePlaceholder2_lt_zoneMain_BizForm_viewBiz_TextBoxControl_6_html5input']", "2122223456", logger, "phone number");
        //decide where to call, click on home option
        Reusable_Actions_Loggers.clickAction(driver,"//input[@value='Home']", logger, "home field");
        Reusable_Actions_Loggers.submitAction(driver, "//*[@type='submit']", logger, "Submit");

        //end the logger per test
        reports.endTest(logger);
    }//end of test 1

    @Test(priority = 2)
    public void brokercheck() {
        logger = reports.startTest("broker check");
        driver.navigate().to("https://www.applebank.com");
        //click on invest tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Invest']", logger, "Invest Tab");
        //click on broker check tool
        Reusable_Actions_Loggers.clickAction(driver, "//*[@title='brokercheck tool']", logger, "Broker check");
        //get text of message pop up
        Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='modal-body']", logger, "You are leaving Apple Bank Message");
        //if select yes, new window should open
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='sbModalSubmit']", logger, "Broker Check tool button");
        //if select no, pop up closes
        Reusable_Actions_Loggers.clickAction(driver, "//button[@aria-label='Cancel - Close the off site link notice popup']", logger, "Broker Check tool button");
        //get tabs count since two pages open up
        //end logger
        reports.endTest(logger);
    }

        @Test(priority=3)
        public void financialcons(){
            logger = reports.startTest("Click on financial consultants");
            driver.navigate().to("https://www.applebank.com");
            //click on invest tab
            Reusable_Actions_Loggers.clickAction(driver,"//*[@aria-label='Invest']", logger,"Invest Tab");
            //scroll into the financial consultants button
            //try scroll here
            //click on financial consultants link
            Reusable_Actions_Loggers.clickAction(driver, "//*[@href='/Invest/Services/Financial-Consultants']", logger, "Financial Consultant button");
            //when i try this i get an error message "Error 502, Bad Gateway"
            //end logger
            reports.endTest(logger);
        }


        @Test(priority = 4)
        public void getAQuote() {
        logger= reports.startTest("Get a Quote");
            driver.navigate().to("https://www.applebank.com");
            //click on invest tab
            Reusable_Actions_Loggers.clickAction(driver,"//*[@aria-label='Invest']", logger,"Invest Tab");
            //click on get a quote
            Reusable_Actions_Loggers.clickAction(driver,"//*[@title='Get a Life Insurance Quote']", logger, "Get a Quote Button");
            //click on continue
            Reusable_Actions_Loggers.mouseHover(driver,"//*[@tabindex='0']", logger, "Continue");

            //Reusable_Actions_Loggers.clickAction(driver,"//*[@tabindex='0']", logger, "Continue");
            //click on cancel
            //Reusable_Actions_Loggers.clickAction(driver,"//*[@aria-label='Cancel - Close the off site link notice popup']", logger, "Cancel");


            //end logger
            reports.endTest(logger);
        }


    @Test(priority = 5)
    public void LifeInsurance() {
        logger= reports.startTest("Life Insurance");
        driver.navigate().to("https://www.applebank.com");
        //click on invest tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Life Insurance']", logger, "Life insurance");
        //click on life insurance
        Reusable_Actions_Loggers.clickAction(driver,"//*[@aria-label='Cancel - Close the off site link notice popup']", logger, "Cancel");
        //use a get text to capture pop up message

        //end logger
        reports.endTest(logger);
    }

    @AfterSuite
    public void quitSession() {
        driver.quit();
        reports.flush();
    }//end of after suite
}//

