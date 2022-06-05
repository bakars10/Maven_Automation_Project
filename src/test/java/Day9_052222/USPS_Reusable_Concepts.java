package Day9_052222;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

public class USPS_Reusable_Concepts {

    public static void main(String[] args) {

        //setting the local driver to resuable setDriver method

        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //hovering to the quick tools
        Reusable_Actions.mouseHover(driver,"//*[text()='Quick Tools']", "Quick Tools");

        //hover to send tab
        Reusable_Actions.mouseHover(driver,"//*[@id='mail-ship-width']", "Send Tab");

        //click on calculate price
        Reusable_Actions.clickAction(driver,"//*[@class='tool-calc']", "Calculate a price");


        //print out header info
        String result= Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']","Header Info");
        System.out.println("My header info is " + result);



        //enter the zip code
        Reusable_Actions.sendKeysAction(driver,"//*[@id='Origin']", "11218", "Zip Code");




    }// end of main
} // end of class