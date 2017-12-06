/*
* [LetterFrequencies].java
* Author: [Spalding Latham]
* Submission Date: [12/01/2017]
*
* Purpose: This program searches through an array of strings and outputs the frequency of each letter.
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


//Class that implements the letterCount and initialize count methods
public class LetterFrequencies{

  /*
   * Method that searches through each character in s,
   * which is array of strings,
   * and updates the count array
   * with the correct character counts.
   */
  public static void letterCount(String[] s, int[] count){
	  
	  //if the input is null, the program continues without giving NPE
	  if(s == null || count == null){
		  return;
	  } else {
 
	  
		  
	
		for(int i = 0; i < s.length; i++){ //loops through the string array
		  if(s[i] == null || s[i] == ""){
			  count[0]++;
			  count[0]--;
		  } else {
			  
		  for(int j = 0; j < s[i].length(); j++){ //loops through the individual string
			  
			  //26 if statements to update the letter count for each instance of a lower case or capital of the same letter
			  if(s[i].charAt(j) == 'a' || s[i].charAt(j) == 'A'){
				  count[0]++;
			  }
			  if(s[i].charAt(j) == 'b' || s[i].charAt(j) == 'B'){
				count[1]++;
			  }
			  if(s[i].charAt(j) == 'c' || s[i].charAt(j) == 'C'){
					count[2]++;
				  }
			  if(s[i].charAt(j) == 'd' || s[i].charAt(j) == 'D'){
					count[3]++;
				  }
			  if(s[i].charAt(j) == 'e' || s[i].charAt(j) == 'E'){
					count[4]++;
				  }
			  if(s[i].charAt(j) == 'f' || s[i].charAt(j) == 'F'){
					count[5]++;
				  }
			  if(s[i].charAt(j) == 'G' || s[i].charAt(j) == 'g'){
					count[6]++;
				  }
			  if(s[i].charAt(j) == 'h' || s[i].charAt(j) == 'H'){
					count[7]++;
				  }
			  if(s[i].charAt(j) == 'i' || s[i].charAt(j) == 'I'){
					count[8]++;
				  }
			  if(s[i].charAt(j) == 'j' || s[i].charAt(j) == 'J'){
					count[9]++;
				  }
			  if(s[i].charAt(j) == 'k' || s[i].charAt(j) == 'K'){
					count[10]++;
				  }
			  if(s[i].charAt(j) == 'l' || s[i].charAt(j) == 'L'){
					count[11]++;
				  }
			  if(s[i].charAt(j) == 'm' || s[i].charAt(j) == 'M'){
					count[12]++;
				  }
			  if(s[i].charAt(j) == 'n' || s[i].charAt(j) == 'N'){
					count[13]++;
				  }
			  if(s[i].charAt(j) == 'o' || s[i].charAt(j) == 'O'){
					count[14]++;
				  }
			  if(s[i].charAt(j) == 'p' || s[i].charAt(j) == 'P'){
					count[15]++;
				  }
			  if(s[i].charAt(j) == 'q' || s[i].charAt(j) == 'Q'){
					count[16]++;
				  }
			  if(s[i].charAt(j) == 'r' || s[i].charAt(j) == 'R'){
					count[17]++;
				  }
			  if(s[i].charAt(j) == 's' || s[i].charAt(j) == 'S'){
					count[18]++;
				  }
			  if(s[i].charAt(j) == 't' || s[i].charAt(j) == 'T'){
					count[19]++;
				  }
			  if(s[i].charAt(j) == 'u' || s[i].charAt(j) == 'U'){
					count[20]++;
				  }
			  if(s[i].charAt(j) == 'v' || s[i].charAt(j) == 'V'){
					count[21]++;
				  }
			  if(s[i].charAt(j) == 'w' || s[i].charAt(j) == 'W'){
					count[22]++;
				  }
			  if(s[i].charAt(j) == 'x' || s[i].charAt(j) == 'X'){
					count[23]++;
				  }
			  if(s[i].charAt(j) == 'y' || s[i].charAt(j) == 'Y'){
					count[24]++;
				  }
			  if(s[i].charAt(j) == 'z' || s[i].charAt(j) == 'Z'){
					count[25]++;
				  }
		  }
		} 
	  }  
   }
}
	 
  

  //method to initialize count
  public static void initializeCount(int[] count){
  
	 
	  //if the input is null the method continues to the next command
	  if(count == null){
		  return;
		
	  }
	
	  //initializes all 26 letter counts to 0
	  count[0] = 0;
	  count[1] = 0;
	  count[2] = 0;
	  count[3] = 0;
	  count[4] = 0;
	  count[5] = 0;
	  count[6] = 0;
	  count[7] = 0;
	  count[8] = 0;
	  count[9] = 0;
	  count[10] = 0;
	  count[11] = 0;
	  count[12] = 0;
	  count[13] = 0;
	  count[14] = 0;
	  count[15] = 0;
	  count[16] = 0;
	  count[17] = 0;
	  count[18] = 0;
	  count[19] = 0;
	  count[20] = 0;
	  count[21] = 0;
	  count[22] = 0;
	  count[23] = 0;
	  count[24] = 0; 
	  count[25] = 0;

	  
	  
	  
  }

}
