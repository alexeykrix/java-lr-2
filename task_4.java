// Task 4 Kryvosheienko Oleksii

import java.util.Scanner;

public class Task4 {
  public static void main(String args[]) {
    int min = 1;
    int targetNum = 0;
    int res = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    for (; targetNum < 1 ;) {
      System.out.print("Enter your number (bigger than 0): ");
      targetNum = scanner.nextInt();
    }
    
    System.out.print(targetNum);
    
    for (; min <= targetNum; min++) {
      res += min;
    }
    
    System.out.println("\n" + res); 
  }
}