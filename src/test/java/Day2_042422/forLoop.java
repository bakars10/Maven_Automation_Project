package Day2_042422;

import java.util.ArrayList;

public class forLoop {

    public static void main(String[] args) {
        //create an array list for cities and loop/ iterating through all the values using for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Long Island");
        cities.add("Staten Island");

        for (int i= 0; i < cities.size(); i++){
            System.out.println(" i is now " + i);
            System.out.println("My city is " + cities.get(i));
          // we use cities. get(i) because..
            // i=i+2, means it will skip every 2, however this is not commonly used
// we use cities.size- to give a count of the list you have at the time

    }// end of for loop

        //while loop is like a conditional, vs for loop that is straightforward



}//end of main

}//end of java class
