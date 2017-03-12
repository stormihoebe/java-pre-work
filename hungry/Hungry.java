
public class Hungry {
  public static void main(String[] args) {

    String[] foods = {"pizza", "eggs", "noodles", "pie", "cake"};

    for (Integer i = 0; i < 2; i++) {
      System.out.println("I am eating " + foods[i] +"!");
      }
    for (Integer j = 2; j < 5; j++){
      System.out.println("I am too full, I cannot eat " + foods[j] +"!");
    }
  }
}
