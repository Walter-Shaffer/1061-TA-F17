/*
LinearSearch.java
Author: Lydia Shealy
Submission Date: 11/16/17

Purpose: To search an array for a certain item specified with command line arguments. 

Statement of Academic Honesty: 

The following code represents my own work. I have neither received nor given 
inappropriate assistance. I have not copied or modified code from any source other than the course webpage or the course textbook. I recognize that any unauthorized assisatnce or plagiarism will be handled in accordance with the policies at Clemson University and the policies of the course. I recognize that my work is based on an assignment created by the School of Computing at Clemson University. Any publishing or posting of source code for this project is strictly prohibted unless you have written consent from the instructor. */
public class LinearSearch{
    public static void main(String[] args){
	
	String strSearch; //search variable used when its a string
        double dblSearch; //search variable used when its a double
        double[] dblArrayX; //array for doubles
        String[] strArrayX; // array for strings

        boolean isValid = true; //if a valid first input is used
        boolean isString; //if the first input is for string or double

	//determines what kind of variable we re searching for 
        if(args[0].equals("-s")){ 
            strSearch = args[1]; 
            isString = true;  
            strArrayX = new String[args.length - 3];

            //to get compiler to shut up
            dblSearch = 0; 
            dblArrayX = new double[0];

	    //starts at the input after the -x in args[]
            for(int i =3, j = 0; i < args.length; i++, j++){
                strArrayX[j] = args[i]; 
            }
        }
        else if(args[0].equals("-d")){
            isString = false; 
            dblSearch = Double.parseDouble(args[1]);          
            dblArrayX = new double[args.length - 3]; 

            //to get compiler to shut up
            strSearch = "";
            strArrayX = new String[0]; 

            for(int i = 3, j = 0; i < args.length; i++, j++){
                dblArrayX[j] = Double.parseDouble(args[i]);
            }

        } 
        else{//this shouldnt happen if correct inputs are given tbh
            isValid = false; 
            isString = false; 
            dblSearch = 0; 
            strSearch = ""; 
            strArrayX = new String[0];
            dblArrayX = new double[0];
            System.out.println("you did something wrong joomFACE.");
            System.exit(0); 
        }   

	//based on if a String was selected or not, called the correct function (through parameters) and gets the index, if any
        if(isString){
            int index = getFirstIndex(strSearch, strArrayX);
            if(index < 0){//if the index is -1 then it wasnt found
                System.out.println(strSearch + " not found in x"); 
            }
            else{
                System.out.println(strSearch + " found in x at index " + index);
            }
        }
        else{
            int index = getFirstIndex(dblSearch, dblArrayX); 
            if(index < 0){
                System.out.println(dblSearch + " not found in x");
            }
            else{
                System.out.println(dblSearch + " found in x at index " + index);
            }
        }
	
    
    }

    //finds the index of the searched item in an array of strings 
    public static int getFirstIndex(String item, String[] x){
        boolean indexFound = false; 
        int index = -1; 
        int i = 0; 

        while(!indexFound && i < x.length){
            if(item.equals(x[i])){
                indexFound = true; 
                index = i; 
            }
            else{
                i++; 
            }
        }
        
        return index; 
    }
    
    //finds the index of the searched item in an array of doubles 
    public static int getFirstIndex(double item, double[] x){
        boolean indexFound = false; 
        int index = -1; 
        int i = 0; 

        while(!indexFound && i < x.length){
            if(item == x[i]){
                indexFound = true; 
                index = i; 
            }
            else{
                i++; 
	    }
        }
    
        return index; 
    }

}
