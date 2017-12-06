/*
 * LetterFrequencies.java
 * Author: Lydia Shealy
 * Submission Date: 11/30/17
 *
 * Purpose: counts the frequencies of letters in a 
 * array of strings.
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
public class LetterFrequencies{

  /*
   * Search through each character in s,
   * which is array of strings,
   * and update the count array
   * with the correct character counts.
   * Note: check the examples to see
   * if the counts should be case
   * sensitive or case insensitive.
   */
  public static void letterCount(String[] s, int[] count){
    //Implement this function
      if(count != null){//only performs code if there isnt a null input
    	  if(s != null){

	      //System.out.println("letterCount called.");
	      /**converts each String in s[] toLowerCase/removes dashs and whitespace*/
    		  for(int i = 0; i < s.length; i++){
    			  if(s[i] != null){//if a null string isnt in the s[] continue
		      
    				  s[i] = s[i].toLowerCase();
    				  s[i] = s[i].replaceAll("-",""); 
    				  s[i] = s[i].trim();
    				  // System.out.println(s[i]);
    			  }
    		  }
	      
    		  for(int i = 0; i< s.length; i++){//steps through each entry in s[]
    			  //char[] charArray = new char[s[i].length()]; 
    			  if(s[i] != null){//makes sure no nulls are evaluated
		      
    				  for(int j = 0; j < s[i].length(); j++){//steps through each letter in the strings
    					  char whatChar;
    					  whatChar = s[i].charAt(j); 
    					  //charArray[j] = s[i].charAt(j); //not sure if i'll need this...
    					  //counts up depending on what the character is
    					  if(whatChar == 'a'){
    						  count[0]++;
    					  }
    					  else if(whatChar == 'b'){
    						  count[1]++;
    					  }
    					  else if(whatChar == 'c'){
    						  count[2]++;
    					  }
    					  else if(whatChar == 'd'){
    						  count[3]++;
    					  }
    					  else if(whatChar == 'e'){
    						  count[4]++;
    					  }
    					  else if(whatChar == 'f'){
    						  count[5]++;
    					  }
    					  else if(whatChar == 'g'){
    						  count[6]++;
    					  }
    					  else if(whatChar == 'h'){
    						  count[7]++;
    					  }
    					  else if(whatChar == 'i'){
    						  count[8]++;
    					  }
    					  else if(whatChar == 'j'){
    						  count[9]++;
    					  }
    					  else if(whatChar == 'k'){
    						  count[10]++;
    					  }
    					  else if(whatChar == 'l'){
    						  count[11]++;
    					  }
    					  else if(whatChar == 'm'){
    						  count[12]++;
    					  }
    					  else if(whatChar == 'n'){
    						  count[13]++;
    					  }
    					  else if(whatChar == 'o'){
    						  count[14]++;
    					  }
    					  else if(whatChar == 'p'){
    						  count[15]++;
    					  }
    					  else if(whatChar == 'q'){
    						  count[16]++;
    					  }
    					  else if(whatChar == 'r'){
    						  count[17]++;
    					  }
    					  else if(whatChar == 's'){
    						  count[18]++;
    					  }
    					  else if(whatChar == 't'){
    						  count[19]++;
    					  }
    					  else if(whatChar == 'u'){
    						  count[20]++;
    					  }
    					  else if(whatChar == 'v'){
    						  count[21]++;
    					  }
    					  else if(whatChar == 'w'){
    						  count[22]++;
    					  }	
    					  else if(whatChar == 'x'){
    						  count[23]++;
    					  }
    					  else if(whatChar == 'y'){
    						  count[24]++;
    					  }
    					  else if(whatChar == 'z'){
    						  count[25]++;
    					  }
    					  else{
    						  //doesnt do anything if a non-letter is there
    					  }               
    				  }
    			  }         

    		  }
    	  }
    	  else{
    		  // System.out.println("im crying but less now.");
    	  }
      }
      else{
	  // System.out.println("im crying."); 
      }
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
    //Implement this function
      if(count != null){//resets count if a non-null input is used

    	  for(int i = 0; i < count.length; i++){//sets each entry to zero
    		  count[i] = 0;
    		  // System.out.println(count[i]);
    	  }
      }
      // System.out.println("initializeCount called."); 
  }

}
