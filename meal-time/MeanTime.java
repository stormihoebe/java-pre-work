
import java.io.Console;

public class MeanTime {
  public static void main(String[] args) {
    Console myConsole = System.console();

    askWhatYouAteFor("breakfast");
    askWhatYouAteFor("lunch");
    askWhatYouAteFor("dinner");
  }

  public static void askWhatYouAteFor(String meal) {
    Console myConsole = System.console();
    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = myConsole.readLine();
    System.out.println("You had " + yourMeal + " for " + meal + ".");
  }
}
