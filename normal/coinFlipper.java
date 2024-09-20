public class coinFlipper {

  private long timesRan;
  private int currentHeads;
  private final int sequentialHeadsGoal;

  public coinFlipper(int a) {
    sequentialHeadsGoal = a;
    currentHeads = 0;
  }

  public void flipper() {
    while (currentHeads < sequentialHeadsGoal) {
      flipCoin();
    }
    System.out.println(
      "Flipped a total of " + timesRan + " times to get " + sequentialHeadsGoal + " heads in a row."
    );
  }

  public void flipCoin() {
    timesRan++;
    //System.out.println(timesRan);
    checker((int) (Math.random() * 2) + 1); // Simulating a coin flip: 1 is heads, 2 is tails
  }

  public void checker(int b) {
    if (b == 1) {
      currentHeads++; // If heads, increment count
    } else {
      currentHeads = 0; // Reset count on tails
    }
  }
}