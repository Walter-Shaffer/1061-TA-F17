/*
* LetterFrequencies.java
* Author: Timothy Morse
* Submission Date: 30 November 2017
*
* Purpose: Searches through an array of Strings and counts 
* how frequently each letter appears.
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
      if(s!=null){
      char c = 0;
      String[] sHack = new String[s.length];
      sHack = s;
      int[] countHack = new int[count.length];
      int countLength = count.length;
      int sLength = s.length;
      countHack = count;
      if(sLength>0){
      for(int i=0; i<sLength;i++){
	  String temp = sHack[i];
	  if(temp!=null&&temp.equals("")!=true){
	      int tempLength = temp.length();
	      for(int j=0;j<tempLength;j++){
	      c = temp.charAt(j);
	      if(c<91&&c>64){
		  c+=32;
	      }
	      c-=97;
	      if(c>-1&&c<26){
		  countHack[c]++;
	      }
	      
	      }
	  }
        }
      }
    }   
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
      if(count!=null){
      int[] countHack = new int[count.length];
      countHack = count;
      for(int i=0;i<count.length;i++){
	  count[i]=0;
      }
    }
  }
}
