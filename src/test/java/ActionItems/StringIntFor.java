package ActionItems;

import java.util.ArrayList;

public class StringIntFor {
    public static void main(String[] args) {
        //declare array list for countries <>

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("Bangladesh");
        countries.add("Argentina");

//declare int for country codes using <> since it is string

        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(+1);
        countryCode.add(+9);
        countryCode.add(+88);
        countryCode.add(+12);

//establish for loop

        for (int i=0; i<countries.size();i++){
            System.out.println(" My country is " + countries.get(i)+ " and my country code is " + countryCode.get(i));

        }// end of for loop



    }//end of main method

}// end of java class

