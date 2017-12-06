/*
* [LetterFrequencies].java
* Author: [Thomas Griffith]
* Submission Date: [November, 28 2017]
*
* Purpose: The purpose of the LetterFrequencies
*  is to determine the frequencies of letters in 
*  an string array either predetermined or inputed by user
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
	
	
private static int errorCount = 0;
  /*
   * Search through each character in s,
   * which is array of strings,
   * and update the count array
   * with the correct character counts.
   * 
   */
  public static void letterCount(String[] s, int[] count){
    //Implement this function
//to see if there is a null in either arrays if so it will not run
	 if (s == null || count == null){
	 
	 }else{
	
	 
	 
	  
	  
	  // ints for each letter in the alphabet array
	  int counta = 0;
	  int countb = 0;
	  int countc = 0;
	  int countd = 0;
	  int counte = 0;
	  int countf = 0;
	  int countg = 0;
	  int counth = 0;
	  int counti = 0;
	  int countj = 0;
	  int countk = 0;
	  int countl = 0;
	  int countm = 0;
	  int countn = 0;
	  int counto = 0;
	  int countp = 0;
	  int countq = 0;
	  int countr = 0;
	  int counts = 0;
	  int countt = 0;
	  int countu = 0;
	  int countv = 0;
	  int countw = 0;
	  int countx = 0;
	  int county = 0;
	  int countz = 0;
	  
	
	  
	  for(int i = 0; i < s.length; i++){ //for loop for array
		
		  if (s[i] == null){//if the string array had an null within it
	
		  }
		  else{
		  
			 
			  
		  for (int j = 0; j < s[i].length(); j++){// for loop for each string
		
			  
			  
			 String letter =  s[i].substring(j, j+1); // gets each letter value
			 
			 if (letter.equalsIgnoreCase("a")){
				 	counta++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("b")){
				 	countb++;
				 	
	
			 }
			 
			 if (letter.equalsIgnoreCase("c")){
				 	countc++;

			 }
			 
			 if (letter.equalsIgnoreCase("d")){
				 	countd++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("e")){
				 	counte++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("f")){
				 	countf++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("g")){
				 	countg++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("h")){
				 	counth++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("i")){
				 	counti++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("j")){
				 	countj++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("k")){
				 	countk++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("l")){
				 	countl++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("m")){
				 	countm++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("n")){
				 	countn++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("o")){
				 	counto++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("p")){
				 	countp++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("q")){
				 	countq++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("r")){
				 	countr++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("s")){
				 	counts++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("t")){
				 	countt++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("u")){
				 	countu++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("v")){
				 	countv++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("w")){
				 	countw++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("x")){
				 	countx++;
				 	
			
			 }
			
			 if (letter.equalsIgnoreCase("y")){
				 	county++;
				 	
	
			 }
			 if (letter.equalsIgnoreCase("z")){
				 	countz++;
				 	
			
			 }
			
			
			 
			 
			 
			 
		  }
		  
	  }
	  }
	  //updates each value count
	  count[0] = counta;
	  count[1] = countb;
	  count[2] = countc;
	  count[3] = countd;
	  count[4] = counte;
	  count[5] = countf;
	  count[6] = countg;
	  count[7] = counth;
	  count[8] = counti;
	  count[9] = countj;
	  count[10] = countk;
	  count[11] = countl;
	  count[12] = countm;
	  count[13] = countn;
	  count[14] = counto;
	  count[15] = countp;
	  count[16] = countq;
	  count[17] = countr;
	  count[18] = counts;
	  count[19] = countt;
	  count[20] = countu;
	  count[21] = countv;
	  count[22] = countw;
	  count[23] = countx;
	  count[24] = county;
	  count[25] = countz;
	
	 
  }
    
	  
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
    //Implement this function
	  //checks to see if if count is null
	  if (count == null) {
		  
	  }
	  // see if count is fit for an alphabet
	  else {
   if (count.length != 25){
	   errorCount = 1;
   }
   //sets all count to zero
	  for (int i = 0; i < count.length; i++){
		  count[i] = 0;
	  }
	  
	 
	}

  }
  

}
