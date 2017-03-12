import java.io.Console;

public class DrinkingAge {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Please Enter your age.");
    String ageString = myConsole.readLine();
    Integer age = Integer.parseInt(ageString);
    if (age >= 21) {
      System.out.println("You are old enough to drink Alcohol!");
    } else {
      System.out.println("You are under 21, you cannot drink Alcohol.");
    };
  }
}
