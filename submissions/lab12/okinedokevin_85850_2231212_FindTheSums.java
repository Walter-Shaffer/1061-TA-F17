/*
* LinearSearch.java
* Author: Kevin Okinedo
* Submission Date: 11/28/17
*
* Purpose: A brief paragraph description of the
* program. What does it do? Finds horizontal and vertical sums in a 2D input array of integers that equal some input integer value.
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
*/


public class FindTheSums {
    public static String arrayToString(int[][] a) //returns a String that is a neat representation of the values in a
    {
        String output="";
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                output += a[i][j];
                if(j < a[0].length-1)
                    output += " ";
            }
            if(i< a.length-1)
                output += "\n";
        }
        
        return output;
    }
    public static int[][] horizontalSums(int[][] a,int sumToFind)//creates a new output array called b that has the same dimensions as a.
    {
        int[][] b = new int[a.length][a[0].length];
        boolean[][] visited = new boolean[a.length][a[0].length];
        for(int i=0;i<a.length;i++){ //Looks at the first row of the array
            int j=0;
            int check_start = 0;
            int sum = 0;
            while(j<a[0].length)
            {
                if(sum < sumToFind)
                {
                    sum = sum+a[i][j];
                    j++;
                }
                
                if(sum > sumToFind) 
                {
                    check_start++;
                    j = check_start;
                    sum = 0;
                }
                
                if(sum == sumToFind)
                {
                    for(int k=check_start;k<j;k++)
                        visited[i][k]=true;
                    check_start++;
                    j = check_start;
                    sum = 0;
                    
                }
               
        }
        }
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(visited[i][j])
                    b[i][j] = a[i][j];
                else
                    b[i][j] = 0;
            }
        }
        
        return b;
    }

   public static int[][] verticalSums(int[][] a,int sumToFind)//creates a new output array called b that has the same dimensions as a.
   {
       int b[][] = new int[a.length][a[0].length];
       boolean visited[][] = new boolean[a.length][a[0].length];
       for(int j=0;j<a[0].length;j++)
       {
           int i = 0;
           int check_start = 0;
           int sum = 0;
           while(i<a.length)
           {
               if(sum<sumToFind)
               {
                   sum = sum+a[i][j];
                   i++;
               }
               if(sum > sumToFind)
               {
                   check_start++;
                   i=check_start;
                   sum=0;
               }
               if(sum == sumToFind)
               {
                   for(int k=check_start;k<i;k++)
                       visited[k][j] = true;
                   check_start++;
                   i=check_start;
                   sum=0;
               }
           }
       }
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a[0].length;j++)
           {
               if(visited[i][j])
                   b[i][j] = a[i][j];
               else
                  b[i][j] = 0;
           }
       }
       return b;
   }
}