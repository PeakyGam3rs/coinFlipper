 import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      int timesToRun;
      try (Scanner input = new Scanner(System.in)) {
          System.out.println("How many sequential heads do you want?");
          timesToRun = input.nextInt();
      }
  coinFlipper run1 = new coinFlipper(timesToRun);
  run1.flipper();
}
}