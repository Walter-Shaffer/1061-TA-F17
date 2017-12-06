/*
 * LetterFrequencies.java
 * Author: Christopher Hicks
 * Submission Date 11/29/2017
 * 
 * Purpose: To create a class that can count the letters in a string
 * and print the output.
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

import java.util.*;

public class LetterFrequencies{
	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz"; 
	private int numLetters; 

  public static void letterCount(String[] s, int[] count){// this checks for the input of a string = null
    if(s == null)
    	return;
    if(count ==null)
    	return;
    else{//start of else statement 1
    	boolean checkNull = true;
    	
    	while(checkNull){
    		if(s.length == 0)
    			checkNull = false;
    		else{//start of else statment 2
    			for(int d = 0; d< s.length; d++){// start of for loop 1
    				if(s[d] == null)
    					s[d] = " ";
    				else if (s[s.length-1] != null)
    					checkNull = false;
    				else
    					;
    			}//end for loop 1
    		}//end else statment 2
    	}// end while loop
    	for(int a = 0; a < s.length; a++){//start of for loop 2
    		for(int b = 0; b < s[a].length(); b++){
    			char c = s[a].charAt(b);
    			switch (c){
    			case ' ':					// Spaces
    				break;
    			case 'a':					// Lower case letters
    				count[0] += 1;
    				break;
    			case 'b':
    				count[1] += 1;
    				break;
    			case 'c':
    				count[2] += 1;
    				break;
    			case 'd':
    				count[3] += 1;
    				break;
    			case 'e':
    				count[4] += 1;
    				break;
    			case 'f':
    				count[5] += 1;
    				break;
    			case 'g':
    				count[6] += 1;
    				break;
    			case 'h':
    				count[7] += 1;
    				break;
    			case 'i':
    				count[8] += 1;
    				break;
    			case 'j':
    				count[9] += 1;
    				break;
    			case 'k':
    				count[10] += 1;
    				break;
    			case 'l':
    				count[11] += 1;
    				break;
    			case 'm':
    				count[12] += 1;
    				break;
    			case 'n':
    				count[13] += 1;
    				break;
    			case 'o':
    				count[14] += 1;
    				break;
    			case 'p':
    				count[15] += 1;
    				break;
    			case 'q':
    				count[16] += 1;
    				break;
    			case 'r':
    				count[17] += 1;
    				break;
    			case 's':
    				count[18] += 1;
    				break;
    			case 't':
    				count[19] += 1;
    				break;
    			case 'u':
    				count[20] += 1;
    				break;
    			case 'v':
    				count[21] += 1;
    				break;
    			case 'w':
    				count[22] += 1;
    				break;
    			case 'x':
    				count[23] += 1;
    				break;
    			case 'y':
    				count[24] += 1;
    				break;
    			case 'z':
    				count[25] += 1;
    				break;
    			case 'A':				//Capital Letters
    				count[0] += 1;
    				break;
    			case 'B':
    				count[1] += 1;
    				break;
    			case 'C':
    				count[2] += 1;
    				break;
    			case 'D':
    				count[3] += 1;
    				break;
    			case 'E':
    				count[4] += 1;
    				break;
    			case 'F':
    				count[5] += 1;
    				break;
    			case 'G':
    				count[6] += 1;
    				break;
    			case 'H':
    				count[7] += 1;
    				break;
    			case 'I':
    				count[8] += 1;
    				break;
    			case 'J':
    				count[9] += 1;
    				break;
    			case 'K':
    				count[10] += 1;
    				break;
    			case 'L':
    				count[11] += 1;
    				break;
    			case 'M':
    				count[12] += 1;
    				break;
    			case 'N':
    				count[13] += 1;
    				break;
    			case 'O':
    				count[14] += 1;
    				break;
    			case 'P':
    				count[15] += 1;
    				break;
    			case 'Q':
    				count[16] += 1;
    				break;
    			case 'R':
    				count[17] += 1;
    				break;
    			case 'S':
    				count[18] += 1;
    				break;
    			case 'T':
    				count[19] += 1;
    				break;
    			case 'U':
    				count[20] += 1;
    				break;
    			case 'V':
    				count[21] += 1;
    				break;
    			case 'W':
    				count[22] += 1;
    				break;
    			case 'X':
    				count[23] += 1;
    				break;
    			case 'Y':
    				count[24] += 1;
    				break;
    			case 'Z':
    				count[25] += 1;
    				break;
    			}// end switch
    		}//end loop 3
    	}//end loop 2
    }//end else statment
  }//end letter counter 
  
  //intialize count method - sets all values to zero
  public static void initializeCount(int[] count){// start method
	  if(count == null)
		  return;
	  else{
		  for(int a = 0; a <count.length; a++){
			  count[a] = 0;
		  }// end else
	  }//end if
  }//end method

}