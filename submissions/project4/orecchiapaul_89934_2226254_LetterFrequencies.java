/* 
 * 
 * LetterFrequencies.java 
 * Author:  Paul Orecchia  
 * Submission Date:  11/27/17 
 * 
 * Purpose: The purpose of this project if to find out the amount of times a letter appears in the String array.
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
	
	public static void letterCount(String[] s, int[] count){ //searches each letter in a string array and add one to the count of each letter
		if(s==null){// checks if s is null
		}else if(count==null){ //checks if count is null
		}else{
			for (int i=0; i<s.length;i++){//loop for each string in the array
				if(s[i]==null){ //checks if a value inside s is null
				}else{
					for (int j=0;j<s[i].length();j++){ //loop for each letter inside the string
						char letter= s[i].charAt(j);
						if (letter=='A'||letter=='a'){ //the if statements add 1 to the letter count
							count[0]=count[0]+1;
						}else if (letter=='B'||letter=='b'){
							count[1]=count[1]+1;
						}else if (letter=='C'||letter=='c'){
							count[2]=count[2]+1;
						}else if (letter=='D'||letter=='d'){
							count[3]=count[3]+1;
						}else if (letter=='E'||letter=='e'){
							count[4]=count[4]+1;
						}else if (letter=='F'||letter=='f'){
							count[5]=count[5]+1;
						}else if (letter=='G'||letter=='g'){
							count[6]=count[6]+1;
						}else if (letter=='H'||letter=='h'){
							count[7]=count[7]+1;
						}else if (letter=='I'||letter=='i'){
							count[8]=count[8]+1;
						}else if (letter=='J'||letter=='j'){
							count[9]=count[9]+1;
						}else if (letter=='K'||letter=='k'){
							count[10]=count[10]+1;
						}else if (letter=='L'||letter=='l'){
							count[11]=count[11]+1;
						}else if (letter=='M'||letter=='m'){
							count[12]=count[12]+1;
						}else if (letter=='N'||letter=='n'){
							count[13]=count[13]+1;
						}else if (letter=='O'||letter=='o'){
							count[14]=count[14]+1;
						}else if (letter=='P'||letter=='p'){
							count[15]=count[15]+1;
						}else if (letter=='Q'||letter=='q'){
							count[16]=count[16]+1;
						}else if (letter=='R'||letter=='r'){
							count[17]=count[17]+1;
						}else if (letter=='S'||letter=='s'){
							count[18]=count[18]+1;
						}else if (letter=='T'||letter=='t'){
							count[19]=count[19]+1;
						}else if (letter=='U'||letter=='u'){
							count[20]=count[20]+1;
						}else if (letter=='V'||letter=='v'){
							count[21]=count[21]+1;
						}else if (letter=='W'||letter=='w'){
							count[22]=count[22]+1;
						}else if (letter=='X'||letter=='x'){
							count[23]=count[23]+1;
						}else if (letter=='Y'||letter=='y'){
							count[24]=count[24]+1;
						}else if (letter=='Z'||letter=='z'){
							count[25]=count[25]+1;
						}else{
						}
					}	
				}
			}
		}
	}	
	public static void initializeCount(int[] count){ //sets count to 0 for all variables
		if (count==null){ // checks if count is null 	
		}else{
			for (int i=0;i<count.length;i++){ //loop that sets each variable to 0
				count[i]=0;
			}
		}	
	}
}


