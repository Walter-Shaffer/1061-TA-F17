/*
* Player.java
* Author: Mark Blasko
* Submission Date: 11/2/17
* Purpose: The purpose of the program is to use to allow the user to input their information 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
import java.util.Scanner;

public class Player {

  Scanner keyboard = new Scanner(System.in);
  private String name;
  private int fastestWin;
  private int gamesCompleted;

  public String askForGuess() { //asks user for number during game

    System.out.print("Enter your guess: ");
    String guess = keyboard.next();
    return guess;
  }

  public void setName(String name) { //sets the name of the user

    this.name = name;
  }

  public String getName() { //returns the name of the user

    return this.name;
  }

  public int getFastestWin() { //returns the fastest win by the user

    return this.fastestWin;
  }


  public void updateStats(int fastestWin, int gamesCompleted) { //sets values of fastestWin and gamesCompleted
    this.fastestWin = fastestWin;
    this.gamesCompleted = gamesCompleted;

  }

  public int getGamesCompleted() { //returns gamesCompleted

    return this.gamesCompleted;


  }

}
