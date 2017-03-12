public class Potluck {
  public static void main(String[] args) {
    String[] potluckGuests = {"Em", "Jeannie", "James", "Katie Brady"};
    String[] potluckFoods = {"Burritos", "Potatoes", "Pizza", "Beer"};

    for (String guest : potluckGuests) {
        System.out.println("Hey, " + guest + ", please bring pizza and beer.");
    }
  }
}
