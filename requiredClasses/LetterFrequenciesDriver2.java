/*
 * This class is used to test the methods in 
 *  the LetterFrequencies class
 */
public class LetterFrequenciesDriver2{

  /*
   * The count array stores the count of each letter (a-z),
   *  where count[0] = # of a's, count[1] = # of b's,
   *  count[2] = # of c's, ..., count[25] = # of z's.
   */
  private static int[] count = new int[26];

  private static String[] s1 = {"abba", "dabba"};

  private static int test1(){
    int points = 60;
    boolean wrongCountOnallOtherCharFlag = false;
    for(int i = 0; i < 26; i++){
      int countVal = count[i];
      if( i == 0 ){
        if(countVal != 4){
          System.out.println("Your count for a is " + countVal + ":\tShould be 4");
          points -= 15;
        }
      } else if ( i ==  1){
        if( countVal != 4){
          System.out.println("Your count for b is " + countVal + ":\tShould be 4");
          points -= 15;
        }
      } else if ( i == 3){
        if( countVal != 1){ 
          System.out.println("Your count for d is " + countVal + ":\tShould be 1");
          points -=15;
        }
      } else if ( countVal != 0 && !wrongCountOnallOtherCharFlag ){
        wrongCountOnallOtherCharFlag = true;
        char curChar = (char)(97 + i);
        System.out.println("Your count for " + curChar + " is " + countVal + ":\tShould be 0");
        points -= 15; 
      }
    }
    return points;
  }

  private static int test2(){
    int points = 20;
    boolean wrongCountOnallOtherCharFlag = false;
    for(int i = 0; i < 26; i ++){
      int countVal = count[i];
      if ( countVal != 0 && !wrongCountOnallOtherCharFlag ){
          wrongCountOnallOtherCharFlag = true;
          char curChar = (char)(97 + i);
          System.out.println("Your count for " + curChar + " is " + countVal + ":\tShould be 0");
          points -= 15; 
      }
    }
    return points;
  }

  /*
   *  Test initializeCount and letterCount methods
   */
  public static void main(String[] args){
    int grade = 20;

    try {
      LetterFrequencies.initializeCount(count);
      LetterFrequencies.letterCount(s1, count);
      printCount(1);
      grade += test1();
    } catch (Exception e) {
      System.out.println("Error in test1():\n\t" + e);
    }
    System.out.println();

    try {
      LetterFrequencies.initializeCount(count);
      printCount(2);
      grade += test2();
    } catch (Exception e) {
      System.out.println("Error in test2():\n\t" + e);
    }
    System.out.println();


    System.out.println("\nGrade= " + grade);

  }

  /*
   * Print the testNum and values in count.
   */
  public static void printCount(int testNum){
    char c = 'a';
    System.out.printf("===Test %d===\n", testNum);
    for(int i = 0; i < 26; i++, c++){
      System.out.printf("%c count = %d\n", c, count[i]);
    }
    System.out.println();
  }

}
