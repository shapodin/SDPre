import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter a number: ");
    int userNum = keyboard.nextInt();

    if(userNum == 0) {
      System.out.println(userNum + " is 0. ");
    }
    else if(userNum < 0) {
      System.out.println("The number is negative");
    }
    else if(userNum > 0) {
      System.out.println("The number is positive");
    }
  }
}