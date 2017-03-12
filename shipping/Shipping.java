
import java.io.Console;

public class Shipping {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How Heavy is the Package?");
    String packageWeightString = myConsole.readLine();
    Integer packageWeight = Integer.valueOf(packageWeightString);
    System.out.println("How many miles are we shipping the Package?");
    String packageDistanceString = myConsole.readLine();
    Integer packageDistance = Integer.valueOf(packageDistanceString);

    Integer priceModifier = 3;
    System.out.println("Where are you shipping the Package?");
    String packageLocation = myConsole.readLine();
    Integer packageCost = ( packageWeight / 10 ) + ( packageDistance / 5 ) * priceModifier;

    System.out.println("Your package will cost $" + packageCost + " to ship to " + packageLocation + ".");
  }
}
