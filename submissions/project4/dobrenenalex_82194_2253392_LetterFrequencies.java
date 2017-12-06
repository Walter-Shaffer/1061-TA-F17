/*
* LetterFrequencies.java
* Author: Alex Dobrenen
* Submission Date: December 1
*
* Purpose: A brief paragraph description of the
* program. What does it do? count the number of letters in each string 
* given
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
	public static void letterCount(String[] s, int[] count)
	{
		boolean nonNull = true;
		if(s == null){
			//System.out.println("Null");
			nonNull = false;
		}
		
		
		
		if(nonNull)
		{
			for(int y = 0; y < s.length; y++)
			{	
				if(s[y] != null)
				{
				for(int x = 0; x < s[y].length(); x++)
				{
					if((s[y].charAt(x) == 'a') || (s[y].charAt(x) == 'A'))
						count[0]++;
					if((s[y].charAt(x) == 'b') || (s[y].charAt(x) == 'B'))
						count[1]++;
					if((s[y].charAt(x) == 'c') || (s[y].charAt(x) == 'C'))
						count[2]++;
					if((s[y].charAt(x) == 'd') || (s[y].charAt(x) == 'D'))
						count[3]++;
					if((s[y].charAt(x) == 'e') || (s[y].charAt(x) == 'E'))
						count[4]++;
					if((s[y].charAt(x) == 'f') || (s[y].charAt(x) == 'F'))
						count[5]++;
					if((s[y].charAt(x) == 'g') || (s[y].charAt(x) == 'G'))
						count[6]++;
					if((s[y].charAt(x) == 'h') || (s[y].charAt(x) == 'H'))
						count[7]++;
					if((s[y].charAt(x) == 'i') || (s[y].charAt(x) == 'I'))
						count[8]++;
					if((s[y].charAt(x) == 'j') || (s[y].charAt(x) == 'J'))
						count[9]++;
					if((s[y].charAt(x) == 'k') || (s[y].charAt(x) == 'K'))
						count[10]++;
					if((s[y].charAt(x) == 'l') || (s[y].charAt(x) == 'L'))
						count[11]++;
					if((s[y].charAt(x) == 'm') || (s[y].charAt(x) == 'M'))
						count[12]++;
					if((s[y].charAt(x) == 'n') || (s[y].charAt(x) == 'N'))
						count[13]++;
					if((s[y].charAt(x) == 'o') || (s[y].charAt(x) == 'O'))
						count[14]++;
					if((s[y].charAt(x) == 'p') || (s[y].charAt(x) == 'P'))
						count[15]++;
					if((s[y].charAt(x) == 'q') || (s[y].charAt(x) == 'Q'))
						count[16]++;
					if((s[y].charAt(x) == 'r') || (s[y].charAt(x) == 'R'))
						count[17]++;
					if((s[y].charAt(x) == 's') || (s[y].charAt(x) == 'S'))
						count[18]++;
					if((s[y].charAt(x) == 't') || (s[y].charAt(x) == 'T'))
						count[19]++;
					if((s[y].charAt(x) == 'u') || (s[y].charAt(x) == 'U'))
						count[20]++;
					if((s[y].charAt(x) == 'v') || (s[y].charAt(x) == 'V'))
						count[21]++;
					if((s[y].charAt(x) == 'w') || (s[y].charAt(x) == 'W'))
						count[22]++;
					if((s[y].charAt(x) == 'x') || (s[y].charAt(x) == 'X'))
						count[23]++;
					if((s[y].charAt(x) == 'y') || (s[y].charAt(x) == 'Y'))
						count[24]++;
					if((s[y].charAt(x) == 'z') || (s[y].charAt(x) == 'Z'))
						count[25]++;
				}
				}
			}
		}
	}

  /*
   * Initialize each value in the
   * count array to zero.
   */
	public static void initializeCount(int[] count)
	{
		if(count != null)
		{
			for(int x = 0; x < count.length; x++)
			{
				count[x] = 0;
			}
		}
	}
}
