/*
 LetterFrequencies.java
 Author: Hunter Singletary
 Submission Date: 11/30/2017

 Purpose: Counts the amount of time each
 letter of the alphabet appears in a string array.

 Statement of Academic Honesty:

 The following code represents my own work. I have neither
 received nor given inappropriate assistance. I have not copied
 or modified code from any source other than the course webpage
 or the course textbook. I recognize that any unauthorized
 assistance or plagiarism will be handled in accordance
 with the policies at Clemson University and the
 policies of this course. I recognize that my work is based
 on an assignment created by the School of Computing
 at Clemson University. Any publishing or posting
 of source code for this project is strictly prohibited
 unless you have written consent from the instructor.
*/
public class LetterFrequencies{
	/**  Search through each character in s,
	 **  which is array of strings,
	 **  and update the count array
	 **  with the correct character counts.
	 **  Note: check the examples to see
	 **  if the counts should be case
	 **  sensitive or case insensitive.
	 **/
	public static void letterCount(String[] s, int[] count){
		if(s == null || count == null){
			
			return;
		}
		for(int i = 0; i < s.length; i++){
			
			
			
			if (s[i] == null){
				s[i] = "";
			}
			
			s[i] = s[i].toLowerCase();
			
		}
		
		int temp = 'a';
		for(int k = 0; k <= 26; k++){
				for(int i = 0; i < s.length; i++){
					
						
					
					for(int j = 0; j < s[i].length(); j++){
						if(s[i].charAt(j) == temp){
							count[k]++;
						}
					}
			
			
		}
		temp++;
				
	}

}
			 
		
		
	
		/**  Initialize each value in the*  count array to zero.
		 * */
		 
		public static void initializeCount(int[] count){
			if(count == null){
				
				int[] temp = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				count = temp;
			}
			for (int i = 0; i < 26; i++){
			count[i] = 0;
			}
		}
			
}
	
