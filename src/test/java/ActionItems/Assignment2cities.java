package ActionItems;

import java.util.ArrayList;

public class Assignment2cities {

    public static void main(String[] args) {
//using array loop and conditions with the following array values, cities=brooklyn, queens, etc

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhatten");
        cities.add("Staten island");

        //using for loop to execute a series of statments multiple times
        for (int i= 0; i < cities.size(); i++){
            //with if conditions
//city should be either brooklyn or manhatten
            if (cities.get(i) == "Brooklyn"){
                System.out.println(" My city is " + cities.get(i));
            } else if (cities.get(i) == "Manhatten"){
                System.out.println(" My city is "+ cities.get(i));

            }
        }// end of for loop

    }// end of main
}// end of java class

