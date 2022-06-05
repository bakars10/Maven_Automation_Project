package ActionItems;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class UHC_AI {

    public static void main(String[] args) {

        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to UHC website
        driver.navigate().to("https://www.uhc.com");

        //verify the homepage title contains Health insurance plans
        Reusable_Actions.getTitleAction(driver, "//*[@class='lg-show']","Get Title");


        //click on 'find a doctor link'
        Reusable_Actions.clickAction(driver,"//*[text()='Find a doctor']", "Find a Doctor");


        //click on sign in
        Reusable_Actions.clickAction(driver,"//*[@class='mr-4']", "Sign In");

        //click on 'medicare plan'
        Reusable_Actions.clickAction(driver,"//*[@data-index='1']", "Medicare Plan");

        //switch tabs and click on register now
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //register
        Reusable_Actions.clickAction(driver,"//*[@class='uhc-tempo-link uhc-tempo-link--medium linkBtn at-element-click-tracking']", "Register");
        //enter below fields: name, last name, birth month,

        //create array list for first name, last name, birth month, day, year, zip & id
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Sabina");
        firstName.add("Rumena");
        firstName.add("Hannah");

        ArrayList<String> lastName= new ArrayList<>();
        lastName.add("Bakar");
        lastName.add("Ferdous");
        lastName.add("Rahman");

        ArrayList<String> birthmonth= new ArrayList<>();
        birthmonth.add("September");
        birthmonth.add("May");
        birthmonth.add("February");

        ArrayList<String> day= new ArrayList<>();
        day.add("1");
        day.add("7");
        day.add("4");

        ArrayList<String> year= new ArrayList<>();
        year.add("1994");
        year.add("1989");
        year.add("1956");

        ArrayList<String> zipcode= new ArrayList<>();
        zipcode.add("11417");
        zipcode.add("11416");
        zipcode.add("11218");

        ArrayList<String> memberID= new ArrayList<>();
        memberID.add("9123453");
        memberID.add("9238492");
        memberID.add("9212389");

       //click on submit
        Reusable_Actions.clickAction(driver, "//*[@id='submitBtn']", "Continue button");


        //switch back
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(0));



        //enter first name
        Reusable_Actions.sendKeysAction(driver,"//*[@id='firstName']","Sabina","First Name");
        //enter last name
        Reusable_Actions.sendKeysAction(driver,"//*[@id='lastName']","Bakar","Last Name");

        //select birth month
        Reusable_Actions.selectByText(driver,"//*[@id='dob_month_input']", "September", "Select month");
        //Reusable_Actions.mouseHover(driver,"//*[@class='SelectInput_SelectInputElement__NR82U ']","Select Birth Month");
        Reusable_Actions.clickByIndexAction(driver,"//*[@class='SelectInput_SelectInputElement__NR82U ']",0,"Click on Birth month");
        Reusable_Actions.mouseHover(driver,"//[text()='September']","Hover over Birth Month");
        Reusable_Actions.clickAction(driver,"//[text()='September']","Select Birth Month");

        //enter birthday
        Reusable_Actions.sendKeysAction(driver,"//*[@autocomplete='bday-day']","10","Enter Birthday");

        //enter birth year
        Reusable_Actions.sendKeysAction(driver,"//*[@autocomplete='bday-year']","1994","Enter Birth Year");

        //enter zipcode
        Reusable_Actions.sendKeysAction(driver,"//*[@placeholder='12345']","11417","Enter Zipcode");

        //enter member ID
        Reusable_Actions.sendKeysAction(driver,"//*[@autocomplete='off']","923456232","Enter Member ID");

        //click on 'Continue' button

        Reusable_Actions.mouseHover(driver,"//*[text()='Continue']","Click on 'Continue' button");

        //catch the error message that pops up
        //store reusable method on string variable and print out variable for error message
        Reusable_Actions.selectByText(driver, "//*[@id='plainText_error']", "", "text error");
        System.out.println("Unfortunatley we are still having trouble finding you");


driver.quit();
        }
    }//end of main

