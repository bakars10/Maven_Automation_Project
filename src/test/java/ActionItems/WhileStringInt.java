package ActionItems;

public class WhileStringInt {
    public static void main(String[] args) {

        //establish string regions and int area codes
        String[] region = new String[]{"New York", "Barcelona", "Sylhet","Pampas"};
        int[] areacode= new int[]{718,777,888,999};

        //initialize your starting point before calling while loop
        int i = 0;
        //establish while loop and define the end point in while loop
        while (i< region.length){
            System.out.println("My region is " + region[i] + " my area code is " + areacode[i]);
            // incrementing
            i=i+1;

        }// end of while loop
    }// end of main method
}//end of java class
