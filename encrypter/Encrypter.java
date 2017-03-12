import java.io.Console;

public class Encrypter {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Please type a message you would like to have encrypted");
    String originalMessage = myConsole.readLine();
    String newMessage = originalMessage.replaceAll("e", "WOWOWOWOW");
    newMessage = newMessage.replaceAll("a", "EEE");

    System.out.println(newMessage);
  }
}
