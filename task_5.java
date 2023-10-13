// Task 5 Kryvosheienko Oleksii

import java.util.Scanner;

public class Task5 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    for (; true ;) {
      int firstNum;
      int secondNum;
      
      System.out.print("Enter first num: ");
      firstNum = scanner.nextInt();
      
      System.out.print("Enter second num: ");
      secondNum = scanner.nextInt();
      
      System.out.println("\n" + firstNum + " + " + secondNum + " = " + firstNum * secondNum);

      System.out.print("Do you want to exit? Type 1 to accept. Type any if don't \n");
      int exitNum = scanner.nextInt();
      
      if (exitNum == 1) break;
      
      System.out.print("\n \n");
    }
  }
}