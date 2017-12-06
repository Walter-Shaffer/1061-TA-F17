/*
* FindTheSums.java
* Author: Mark Blasko
* Submission Date: 12/1/17
* Purpose: The purpose of the program is to find the sums of consecutive numbers in an array
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
public class FindTheSums {


    public static String arrayToString(int [][] a) {
      String sums = "";
      for (int x = 0; x < a.length; x++) {
        for (int i = 0; i < a[0].length; i++) {
          sums += a[x][i];
          if (i < a[0].length - 1) {
            sums += " ";
          }
        }
          if (x < a.length - 1) {
            sums += "\n";
           }
        }
        return sums;
      }

    public static int[][] horizontalSums(int [][] a, int sumToFind) {
        int [][] b = new int[a.length][a[0].length];
        int sequence = 0; //numbers in a sequence

       for (sequence = 0; sequence < a[0].length; sequence++) {

          for (int x = 0; x < a.length; x++) {
          int total = 0;
            for (int y = sequence; y < a[x].length; y++) {
            total += a[x][y];

             if (a[x][y] == sumToFind) { //Check later
                b[x][y] = a[x][y];
              //  total = 0;
            }

              if (total == sumToFind) {
                for(int i = sequence; i <= y; i++) {
                  b[x][i] = a[x][i];
                //  total = 0;
           }
          }
         }
        }
        //sequence++;
       }

    //    System.out.println(b[0][0] + " " + b[0][1] + " " + b[0][2] + " " + b[0][3] + " " + b[0][4]);
        return b;
    }


    public static int[][] verticalSums(int [][] a, int sumToFind) {
      int [][] b = new int[a.length][a[0].length];
      int sequence = 0;

      for (sequence = 0; sequence < a[0].length; sequence++) {

          for (int x = 0; x < a.length; x++) {
          int total = 0;
            for (int y = sequence; y < a.length; y++) {
            total += a[y][x];

          /*   if (a[x][y] == sumToFind) { //Check later
                b[x][y] = a[x][y];
              //  total = 0;
            }*/

              if (total == sumToFind) {
                for(int i = sequence; i <= y; i++) {
                  b[i][x] = a[i][x];
                //  total = 0;
           }
          }
         }
        }
        //sequence++;
       }
      return b;

    }

}
