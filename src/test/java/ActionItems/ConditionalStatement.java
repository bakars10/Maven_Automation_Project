package ActionItems;

public class ConditionalStatement {

    public static void main(String[] args) {
//declare 1 integer values for grade
        int grade = 82;

//declare ranges for grades
        if (grade >= 90 && grade <= 100) {
            System.out.println(" print grade is a");
            //declare else for other grade range values
        } else if (grade>=80 && grade<90) {
            System.out.println("print grade is b");

        } else if (grade>=70 && grade <80) {
            System.out.println("print grade is c");

        } else if (grade>=60 && grade<70) {
            System.out.println("print grade is d");

        }else if (grade>=0 && grade<60)
            System.out.println("print grade is f");




    }// end of main
    }// end of class

