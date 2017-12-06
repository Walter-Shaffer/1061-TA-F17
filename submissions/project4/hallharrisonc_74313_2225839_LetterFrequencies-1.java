/*                                                                                                                                                                                                                 
 * LetterFrequencies.java                                                                                                                                                                                          
 * Author: Harrison Hall                                                                                                                                                                                           
 * Submission Date: November 27, 2017                                                                                                                                                                              
 *                                                                                                                                                                                                                 
 * Purpose: This program sorts through the string s and                                                                                                                                                            
 * returns the number of times each letter is used via an                                                                                                                                                          
 * int array count, which can be set to zero.                                                                                                                                                                      
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
            //if count is null, then fixed
    		if (count == null){
                count = new int[26];
            }
            //if null, then fixed                                                                                                                                                                                           
            if (s == null){
                s = new String[1];
                s[0] = "";
            }
            for (int i = 0; i< s.length; i++){ //This writes correct letters to count via char value placement
                if (s[i] == null){
                }else{
                for (int strings = 0; strings < s[i].length(); strings++){
                    char character = s[i].charAt(strings);
                    if ((int)character >= 97 && (int)character <= 122){ //Splits for caps
                        count[(int)character - 97]++;
                    }else if ((int)character >= 65 && (int)character <=90){
                        count[(int)character - 65]++;
                    }
                }
                }
            }
            /**for (int i = 0; i< count.length; i++){ //This was for testing purposes
                char thisChar = (char)(97 + i);
                //System.out.print("\n"+ thisChar +": " + count[i]);                                                                                                                                                   
            }*/
        }
    	
    	
    	/*                                                                                                                                                                                                             
         * Initialize each value in the                                                                                                                                                                                
         * count array to zero.                                                                                                                                                                                        
         */
        public static void initializeCount(int[] count){ 
            if (count == null){ // Checks null
                count = new int[26];
            } else if (count.length == 26){ //Sets every integer in count to 0
                for (int i = 0; i < count.length; i++){
                    count[i] = 0;
                }
            }
        }

    }


