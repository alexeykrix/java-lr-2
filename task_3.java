// Task 3 Kryvosheienko Oleksii

public class Task3 {
  public static void main(String args[]) {
    int firstNum = 1;
    int max = 10;

    for (; firstNum <= max ;) {
      for (int secondNum = 1; secondNum <= max; secondNum++) {
        System.out.println(firstNum + " x " + secondNum + " = " + firstNum * secondNum);
      }
      firstNum++;
      System.out.println("\n");
    } 
  }
}