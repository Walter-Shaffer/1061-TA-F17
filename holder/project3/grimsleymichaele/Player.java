/*
* Player.java
* Author: Michael Grimsley
* Submission Date: 11/3/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
import java.util.Scanner;
public class Player {
String name; //instance variable that hold the users name
int fastestWin = -1; //instance variable that holds the fastest win defaulted to -1 so an if statement will know if there is no fastest win yet
int gamesCompleted = 0; //holds the games completed
Scanner keyboard = new Scanner(System.in); //takes in keyboard input

//takes an int input form user returns it as a string
public String askForGuess(){
return Integer.toString(keyboard.nextInt());
}
//returns instance variable player name
public String getName(){
return this.name;
}
//returns instance variable holding the fastest win
public int getFastestWin(){
return this.fastestWin;
}
//returns instance variable holding games completed
public int getGamesCompleted(){
return this.gamesCompleted;
}
//sets instance variable player name
public void setName(String name){
this.name = name;
}
//updates the status of games played after a sucsufful win and checks to see if it was the fastest win if yes then updates fastest win as well
public void updateStatus(int status){
this.gamesCompleted++;
if (this.fastestWin == -1){
this.fastestWin = status;
}else if (this.gamesCompleted < this.fastestWin){
this.fastestWin = status; 	
}
}
}

