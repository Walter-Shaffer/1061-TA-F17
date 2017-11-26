import java.lang.Object;

public class LinearSearch {

    /*
     * LinearSearch.java
     * Author: Taylor Hennessy
     * Submission Date: 11/17/2017
     *
     * Purpose:
     *
     * Statement of Academic Honesty:
     *
     * The following code represents my own work. I have neither
     * recieved nor given inappropriate assistance. I have not copied
     * or modified code from any source other than the course webpage
     * or the course textbook. I recognize that any unauthorized
     * assistance or plagiarism will be handled in accordance
     * with the policies at Clemson University and the
     * policies of this course. I recognize that my work is based
     * on an assignment created by the School of Computing
     * at Clemson University. Any publishing or posting
     * of source code for this project is strictly prohibited
     * unless you have written consent from the instructor.
     */

    //main method
    public static void main(String[] args){


    	String type = args[0];
        int index = -1;
        
        //if the user denotes string
        if (type.equals("-s")){
            String[] argsString = new String[args.length - 3];
            for (int i = 3; i < args.length; i++){
                argsString[i - 3] = args[i];
            }

            index = getFirstIndex(args[1].toString(), argsString);
        }
        else if (type.equals("-d")) {
            double[] argsDoub = new double[args.length - 3];
            for (int i = 3; i < args.length; i++){
                argsDoub[i - 3] = Double.parseDouble(args[i]);
            }
            index = getFirstIndex(Double.parseDouble(args[1]), argsDoub);
    }

        //check if it was found
        if (index != -1){
            System.out.println(args[1] + " found in x at index " + index);
        }
        else {
            System.out.println(args[1] + " not found in x");
        }
}




    //if the item is in the array x, then return the first index
    //i of x where x[i] is equal to item. Otherwise, return -1 if the
    //item is not in the array x
    public static int getFirstIndex(double item, double[] x){

        for (int i = 0; i < x.length; i++){
            if (x[i] == item){
                return i;
            }
}
        return -1;

    }

    //If the item is in the array x then return the first index i of x
    //where x[i] is equal to (case sensitive) item. Otherwise, return -1
    //if the item is not in the array x
    public static int getFirstIndex(String item, String[] x){

        for (int i = 0; i < x.length; i++){
            if (x[i].equals(item)){
                return i;
            }
        }

        return -1;

    }


}
