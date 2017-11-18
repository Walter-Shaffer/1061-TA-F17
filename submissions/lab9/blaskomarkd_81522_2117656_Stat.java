/*
* Stat.java
* Author: Mark Blasko
* Submission Date: 11/2/17
* Purpose: The purpose of the program is to print statistics about numbers. 
* Statement of Academic Dishonesty: 
* I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
public class Stat {

  public double[] data;

  public Stat() {
    this.data = new double[1];
    this.data[0] = 0.0;
  }

  public Stat(double[] d) {
    this.data = new double[d.length];
    for (int i = 0; i < d.length; i++) {
    this.data[i] = d[i];
    }
  }

  public double[] getData() {
    double[] d = this.data;
    return d;
  }

  public void setData(double[] d) {
    this.data = new double[d.length];
    for (int i = 0; i < d.length; i++) {
    this.data[i] = d[i];
  }
}

  public boolean equals(Stat s) {
    boolean statement = true;

    for (int i = 0; i < data.length; i++) {
      if (this.data.length != s.data.length) {
        statement = false;
      }
      else if (this.data[i] != s.data[i]) {
      statement = false;
      }
    }
    return statement;
  }

  public String toString() {
    String stringMethod = "[";
    for (int x = 0; x < this.data.length; x++) {
      if (x < this.data.length - 1) {
      stringMethod = stringMethod + this.data[x] + ",";
      }
      else {
        stringMethod = stringMethod + this.data[x];
      }
    }
    stringMethod = stringMethod + "]";
    return stringMethod;
  }

  public double min() {
    double min = data[0];
    for (int i = 0; i < this.data.length; i++) {
      if (min > this.data[i]) {
        min = this.data[i];
      }
    }
    return min;
  }

  public double max() {
    double max = data[0];
    for (int i = 0; i < this.data.length; i++) {
      if (max < this.data[i]) {
          max = this.data[i];
      }
    }
    return max;
  }

  public double average() {
    int i;
    double x = 0;
    for (i = 0; i < this.data.length; i++) {
      x += this.data[i];
    }
    x = x / this.data.length;
    return x;
  }

  public double mode() {
    double number = 1;
  //  double newMode = 0;
    double previousAmount = 1;
    double currentAmount;

    double arrayForMode = this.data[0];
    for (int i = 0; i < this.data.length; i++) {
      currentAmount = 0;
    //  number = this.data[i];

      for (int x = 0; x < this.data.length; x++) {
        if (this.data[x] == this.data[i]) {
          currentAmount++; //increases value that represents the amount of times the number occurs

        }
    }
    if (currentAmount > previousAmount) {
    //  newMode = number; //sets newMode equal to number if the number of times the number occured in the array is greater than the number at the previous index
      arrayForMode = this.data[i];
      number = 1;
      previousAmount = currentAmount; //finalAmount remains unchanged unless condition is met
    }
    else if (currentAmount == previousAmount && this.data[i] != arrayForMode) {
      number++;
    }
  }
      if (number > 1) {
        return Double.NaN;
      }
      return arrayForMode;
    }

    }

