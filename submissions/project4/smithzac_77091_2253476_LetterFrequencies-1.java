/*LetterFrequencies.java
 * Zachary Smith
 * 12-1-17
 * This program searches through an array of strings to check
 * the frequency in which the letters of the alphabet appear in that
 * string. It can also handle instances of null and "".
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
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
	  if(s == null)//checks to see if the array contains a null value
	  {
		  System.out.print("");
	  }
	  else
	  {
		  for(int i = 0; i < s.length; i++)// if there is no null, then the array will be scrolled though
		  {
			  if(s[i] == null)//if there is a null in the array, then nothing happens
			  {
				  count[0] = count[0];
			  }
			  else if(s[i].equals(""))//if nothing is entered, then nothing happens
			  {
				  count[0] = count[0];
			  }
			  else
			  {
				  char[] stringToChar = s[i].toCharArray();//changes the strings inside the array to a char array for each individual string
				  for(int j = 0; j < stringToChar.length; j++)//scrolls through the string checking for the frequency of each letter, and updates its count
				  {
					  if(stringToChar[j] ==('a') || stringToChar[j] ==('A'))
					  {
						  count[0]++;
					  }
					  else if(stringToChar[j] ==('b') || stringToChar[j] ==('B'))
					  {
						  count[1]++;
					  }
					  else if(stringToChar[j] ==('c') || stringToChar[j] ==('C'))
					  {
						  count[2]++;
					  }
					  else if(stringToChar[j] ==('d') || stringToChar[j] ==('D'))
					  {
						  count[3]++;
					  }
					  else if(stringToChar[j] ==('e') || stringToChar[j] ==('E'))
					  {
						  count[4]++;
					  }
					  else if(stringToChar[j] ==('f') || stringToChar[j] ==('F'))
					  {
						  count[5]++;
					  }
					  else if(stringToChar[j] ==('g') || stringToChar[j] ==('G'))
					  {
						  count[6]++;
					  }
					  else if(stringToChar[j] ==('h') || stringToChar[j] ==('H'))
					  {
						  count[7]++;
					  }
					  else if(stringToChar[j] ==('i') || stringToChar[j] ==('I'))
					  {
						  count[8]++;
					  }
					  else if(stringToChar[j] ==('j') || stringToChar[j] ==('J'))
					  {
						  count[9]++;
					  }
					  else if(stringToChar[j] ==('k') || stringToChar[j] ==('K'))
					  {
						  count[10]++;
					  }
					  else if(stringToChar[j] ==('l') || stringToChar[j] ==('L'))
					  {
						  count[11]++;
					  }
					  else if(stringToChar[j] ==('m') || stringToChar[j] ==('M'))
					  {
						  count[12]++;
					  }
					  else if(stringToChar[j] ==('n') || stringToChar[j] ==('N'))
					  {
						  count[13]++;
					  }
					  else if(stringToChar[j] ==('o') || stringToChar[j] ==('O'))
					  {
						  count[14]++;
					  }
					  else if(stringToChar[j] ==('p') || stringToChar[j] ==('P'))
					  {
						  count[15]++;
					  }
					  else if(stringToChar[j] ==('q') || stringToChar[j] ==('Q'))
					  {
						  count[16]++;
					  }
					  else if(stringToChar[j] ==('r') || stringToChar[j] ==('R'))
					  {
						  count[17]++;
					  }
					  else if(stringToChar[j] ==('s') || stringToChar[j] ==('S'))
					  {
						  count[18]++;
					  }
					  else if(stringToChar[j] ==('t') || stringToChar[j] ==('T'))
					  {
						  count[19]++;
					  }
					  else if(stringToChar[j] ==('u') || stringToChar[j] ==('U'))
					  {
						  count[20]++;
					  }
					  else if(stringToChar[j] ==('v') || stringToChar[j] ==('V'))
					  {
						  count[21]++;
					  }
					  else if(stringToChar[j] ==('w') || stringToChar[j] ==('W'))
					  {
						  count[22]++;
					  }
					  else if(stringToChar[j] ==('x') || stringToChar[j] ==('X'))
					  {
						  count[23]++;
					  }
					  else if(stringToChar[j] ==('y') || stringToChar[j] ==('Y'))
					  {
						  count[24]++;
					  }
					  else if(stringToChar[j] ==('z') || stringToChar[j] ==('Z'))
					  {
						  count[25]++;
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
    //Implement this function
	  if(count == null)//if count is null, then nothing happens
	  {
		  System.out.print("");
	  }
	  else//sets the initials values of count to zero for all letters
	  {
		  for(int i = 0; i < 26; i++)
		  {
			  count[i] = 0;
		  }
	  }
  }

}
