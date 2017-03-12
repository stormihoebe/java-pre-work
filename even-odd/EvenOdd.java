import java.io.Console;
public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number");
    String stringNumber = console.readLine();
    Integer integerNumber = Integer.parseInt(stringNumber);

    System.out.println("I'll count even and odd");

    for (Integer number = 1; number <= integerNumber; number++) {
      if(number % 2 == 0) {
        System.out.println("EVEN");
      } else {
        System.out.println("ODD");
      }
    }
  }
}
