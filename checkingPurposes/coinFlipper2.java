
public class coinFlipper2 {

    private long timesRan;
    private int currentHeads;
    private final int timesToRun;
  
    public coinFlipper2(int a) {
      timesToRun = a;
      timesRan = 0;
    }
  
    public void flipper() {
      while (timesRan < timesToRun) {
        flipCoin();
      }
      System.out.println(
        "Flipped a total of " + timesRan + " times to get " + currentHeads + " and " + (timesRan-currentHeads) + " tails."
      );
      System.out.println("When a coin is flipped, there is a " + (((int)((currentHeads/(double)timesToRun)*100000.0))/1000.0) + "% chance the result will be heads");
    }
  
    public void flipCoin() {
      timesRan++;
      //System.out.println(timesRan);
      checker((int) (Math.random() * 2)); // Simulating a coin flip: 0 is heads, 1 is tails
    }
  
    public void checker(int b) {
      if (b == 0) {
        currentHeads++; // If heads, increment count
      }
    }
  }