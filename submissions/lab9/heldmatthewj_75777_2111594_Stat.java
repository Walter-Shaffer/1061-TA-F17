
/*
* Stat.java
* Author: Matthew Held
* Submission Date: 11-2-17
*
* Purpose:
* The purpose of this class is to perform calculations based on
* data stored in a double array.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*
* I Agree
*
*/
 
public class Stat {
      
       //***Fields***
      
       private double[] data;
      
       //***Methods***
      
       /*
       * The default constructor for Stat.
       */
       public Stat() {
             
              //Assign data Array Length & Value
              data = new double[1];
              data[0] = 0.0;
             
       }
      
       /*
       * Constructs a Stat object using the values held in d.
       */
       public Stat(double[] d) {
             
              //Assign data Array Length
              data = new double[d.length];
             
              //Populate data Array With Values from d Array
              for (int i = 0; i < d.length; i++) {
                   
                    data[i] = d[i];
                   
              }
             
       }
      
       /*
       * Used to retrieve the value of data.
       */
       public double[] getData() {
             
              //Create New Array To Send
              double[] sendArray = new double[data.length];
             
              //Populate sendArray Array With Values from data Array
              for (int i = 0; i < data.length; i++) {
                   
                    sendArray[i] = data[i];
                   
              }
             
              //Return Array
              return sendArray;
             
       }
      
       /*
       * Used to set the value of data.
       */
       public void setData(double[] d) {
             
              //Create New Array
              double[] tempArray = new double[d.length];
             
              //Populate tempArray Array With Values from d Array
              for (int i = 0; i < d.length; i++) {
                   
                    tempArray[i] = d[i];
                   
              }
             
              //Assign tempArray To data
              data = tempArray;
             
       }
      
       /*
       * Returns the boolean value true if the data objects of both
       * the callint Stat object and the passed Stat object have the
       * same values in order. Otherwise, it returns false.
       */
       public boolean equals(Stat s) {
             
              //Create Variables
              boolean isEqual = false;
             
              //Test If Array Lengths Are The Same
              if ((s.getData()).length == data.length) {
                   
                    isEqual = true;
                   
                    //Iterate Through Arrays
                    for (int i = 0; i < data.length; i++) {
                          
                           //Test If Array Values Are Not The Same
                           if ((s.getData())[i] != data[i]) {
                                 
                                  isEqual = false;
                                 
                           }
                          
                    }
                   
              }
             
              //Return Condition
              return isEqual;
             
       }
      
       /*
       * Returns the String representation of the data elements stored
       * in the Stat object.
       */
       public String toString() {
             
              //Create Empty String
              String strData = "";
             
              //Add Begining Of String
              strData = strData.concat("[");
              strData = strData.concat(String.valueOf(data[0]));
             
              if (data.length != 1) {
                   
                    strData = strData.concat(",");
                   
              }
             
              //Add Middle Of String
              for (int i = 1; i < data.length - 1; i++) {
                   
                    strData = strData.concat(" ");
                    strData = strData.concat(String.valueOf(data[i]));
                    strData = strData.concat(",");
                   
              }
             
              //Add End Of String
              if (data.length != 1) {
                   
                    strData = strData.concat(" ");
                    strData = strData.concat(String.valueOf(data[data.length - 1]));
                   
              }
              strData = strData.concat("]");
             
              //Return Value
              return strData;
             
       }
      
       /*
       * Returns the minimum of the data array.
       */
       public double min() {
             
              //Declare minValue To Largest Possible Value
              double minValue = Integer.MAX_VALUE;
             
              //Iterate Through data Array
              for (int i = 0; i < data.length; i++) {
                   
                    //If Value In data Is Less Then The Current Value Of minValue
                    //Then Set Value of minValue To The Value Of data
                    if (data[i] < minValue) {
                          
                           minValue = data[i];
                          
                    }
                   
              }
             
              //Return Minimum Value
              return minValue;
             
       }
      
       /*
       * Returns the maximum of the data array.
       */
       public double max() {
             
              //Declare maxValue To Smallest Possible Value
              double maxValue = Integer.MIN_VALUE;
             
              //Iterate Through data Array
              for (int i = 0; i < data.length; i++) {
                   
                    //If Value In data Is More Then The Current Value Of maxValue
                    //Then Set Value of maxValue To The Value Of data
                    if (data[i] > maxValue) {
                          
                           maxValue = data[i];
                          
                    }
                   
              }
             
              //Return Maximum Value
              return maxValue;
             
       }
      
       /*
       * Returns the average of the data array.
       */
       public double average() {
             
              //Initialize Value Of avg To 0.0
              double avg = 0.0;
             
              //Add Up Values In data Array
              for (int i = 0; i < data.length; i++) {
                   
                    avg = avg + data[i];
                   
              }
             
              //Divide Addition Value By The data Array Length
              avg = avg / data.length;
             
              //Return Value
              return avg;
             
       }
      
       /*
       * Returns the value in the data array that occurs most often.
       * If no such value exists then the value Double.NaN is returned.
       */
       public double mode() {
             
              double currentValue = 0;
              int currentOccurs = 0;
              double mostValue = 0;
              int mostOccurs = 0;
             
              //If data Only Has One Value Then That Is The Mode
              if (data.length == 1) {
                   
                    mostValue = data[0];
                   
              } else if (data.length == 2) {
                   
                    mostValue = Double.NaN;
                   
              } else {
                   
                    //Get The Max Number Of Times A Number Repeats (Stored In mostValue)
                    for (int i = 0; i < data.length; i++) {
                          
                           currentValue = data[i];
                           currentOccurs = 0;
                          
                           for (int j = 0; j < data.length; j++) {
                                 
                                  if (currentValue == data[j]) {
                                        
                                         currentOccurs++;
                                        
                                  }
                                 
                           }
                          
                           if (currentOccurs > mostOccurs) {
                                 
                                  mostOccurs = currentOccurs;
                                  mostValue = currentValue;
                                 
                           }
                          
                    }
                   
                    int mostTies = 0;
                   
                    //Check If More Than One Value Has The Max Times A Number Repeats
                    for (int i = 0; i < data.length; i++) {
                          
                           currentValue = data[i];
                           currentOccurs = 0;
                   
                           for (int j = 0; j < data.length; j++) {
                                 
                                  if (currentValue == data[j]) {
                                        
                                         currentOccurs++;
                                        
                                  }
                                 
                           }
                          
                           if ((currentOccurs == mostOccurs) && (currentValue != mostValue)) {
                                 
                                  mostTies++;
                                        
                           }
                          
                    }
                   
                    if (mostTies > 1) {
                          
                           mostValue = Double.NaN;
                          
                    }
                   
              }
             
              return mostValue;
             
       }
      
       //***Main Method***
      
       public static void main(String[] args) {
             
             
              //Example 1
              /*
              double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
              double[] data2 = {100.34, 50.01, 50.01, -8};
              Stat stat1 = new Stat();
             
              System.out.println("stat1 data = " + stat1.toString());
             
              stat1 = new Stat(data);
             
              System.out.println("stat1 has been altered.");
              System.out.println("stat1 data = " + stat1.toString());
             
              System.out.println("stat1 min = " + stat1.min());
              System.out.println("stat1 max = " + stat1.max());
              System.out.println("stat1 average = " + stat1.average());
              System.out.println("stat1 mode = " + stat1.mode() + "\n");
             
              Stat stat2 = new Stat();
              stat2.setData(data2);
              Stat stat3 = new Stat(stat1.getData());
             
              System.out.println("stat2 data = " + stat2.toString());
              System.out.println("stat3 data = " + stat3.toString());
              System.out.println();
              System.out.println("stat1 is equal to stat2 using \"equals()\"? " + stat1.equals(stat2));
              System.out.println("stat1 is equal to stat3 using \"equals()\"? " + stat1.equals(stat3));
              System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
              */
             
              //Example 2
              /*
              double[] data = {10.0, 20.0, 30.0};
              Stat stat1 = new Stat(data);
             
              data[0] = 100.0;
              data[1] = 200.0;
              data[2] = 300.0;
             
              Stat stat2 = new Stat(data);
             
              System.out.println(stat1.toString());
              System.out.println(stat2.toString());
              */
             
              //Example 3
              /*
              double[] data1 = {10.0, 20.0, 30.0};
              Stat stat1 = new Stat(data1);
             
              double[] data2 = stat1.getData();
             
              System.out.println(data1 == data2);
              */
             
              //Example 4
              /*
              double[] data1 = {10.0, 20.0, 30.0};
              Stat stat1 = new Stat();
              stat1.setData(data1);
              Stat stat2 = new Stat(data1);
              double[] data2 = stat1.getData();
             
              System.out.println(data1 == data2);
              System.out.println(stat2.equals(stat1));
              System.out.println(stat1.equals(stat2));
              */
             
              //Example 5
              /*
              Stat stat1 = new Stat();
              System.out.println(stat1.toString());
              System.out.println(stat1.min());
              System.out.println(stat1.max());
              System.out.println(stat1.average());
              System.out.println(stat1.mode());
              System.out.println(stat1.toString());
              */
             
              //Example 6
              /*
              double[] data = {1, 2, 2, 3, 3, 4};
              Stat stat1 = new Stat(data);
             
              System.out.println(stat1.toString());
              System.out.println(stat1.min());
              System.out.println(stat1.max());
              System.out.println(stat1.average());
              System.out.println(stat1.mode());
              System.out.println(stat1.toString());
              */
             
              //Other Tests
             
              double[] data = {4, 3, 3, 1, 2, 1};
              Stat stat1 = new Stat(data);
             
              System.out.println(stat1.toString());
              System.out.println(stat1.min());
              System.out.println(stat1.max());
              System.out.println(stat1.average());
              System.out.println(stat1.mode());
              System.out.println(stat1.toString());
             
       }
 
}