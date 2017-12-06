//counts the frequency of letters in a string array
//initializes count array at 0
public class LetterFrequencies{
	/*
	* LetterFrequencies.java
	* Author: Taylor Hennessy
	* Submission Date: 12/1/2017
	*
	* Purpose: This program counts the frequency of letters in a 
	* 		   string array, and initializes the count array at 0.
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

	//counts the amount of each letter in each string of the array, 
	//case insensitive
  public static void letterCount(String[] s, int[] count){
	  //character for comparison later on when looping through the string
	  char current = '1';
	  //if neither is null
	  if (s != null && count != null)
	  {
		  //loop to increment through the indices of the string array
		  for (int i = 0; i < s.length; i++){


			  if (s[i] != null)
			  {
				  if (s[i].isEmpty() == false)
				  {
			      //loop to increment through the "indices" of the string
			    	for (int j = 0; j < s[i].length(); j++){
			    		//get the current character in the string
			    		current = s[i].toLowerCase().charAt(j);
			    		//add to the appropriate location in the count array
			    		//depending on what letter it is
			    		switch (current){
			    			case 'a': count[0]++;
			    			break;
			    			case 'b': count[1]++;
			    			break;
			    			case 'c': count[2]++;
			    			break;
			    			case 'd': count[3]++;
			    			break;
			    			case 'e': count[4]++;
			    			break;
			    			case 'f': count[5]++;
			    			break;
			    			case 'g': count[6]++;
			    			break;
			    			case 'h': count[7]++;
			    			break;
			    			case 'i': count[8]++;
			    			break;
			    			case 'j': count[9]++;
			    			break;
			    			case 'k': count[10]++;
			    			break;
			    			case 'l': count[11]++;
			    			break;
			    			case 'm': count[12]++;
			    			break;
			    			case 'n': count[13]++;
			    			break;
			    			case 'o': count[14]++;
			    			break;
			    			case 'p': count[15]++;
			    			break;
			    			case 'q': count[16]++;
			    			break;
			    			case 'r': count[17]++;
			    			break;
			    			case 's': count[18]++;
			    			break;
			    			case 't': count[19]++;
			    			break;
			    			case 'u': count[20]++;
			    			break;
			    			case 'v': count[21]++;
			    			break;
			    			case 'w': count[22]++;
			    			break;
			    			case 'x': count[23]++;
			    			break;
			    			case 'y': count[24]++;
			    			break;
			    			case 'z': count[25]++;
			    			break;
			    		}
			    	}
			         }
			  }

	    	
	    }
		  
	  }
  }

//initialize each value in the count array to 0
  public static void initializeCount(int[] count){
	  //if it's not null
	  if (count != null)
	  	{
		  //loop through count array
		  for (int i = 0; i < count.length; i++)
		  	{
			  //set equal to 0
			  count[i] = 0;
		  	}
	  	}
  }

}
