
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
      int timesToRun;
      try (Scanner input = new Scanner(System.in)) {
          System.out.println("How many times do you want to flip a coin?");
          timesToRun = input.nextInt();
      }
  coinFlipper2 run1 = new coinFlipper2(timesToRun);
  run1.flipper();
}
}