public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = {"ice Cream", "hot sauce", "pickles"};
    Integer[] groceryItemPrices = {3, 6, 4};

    for (String groceryItem : myGroceryList) {
      System.out.println(groceryItem);
    }
    Integer total = 0;
    for (Integer price : groceryItemPrices) {
      total += price;
    }
    System.out.println("Your total for this shopping trip will be: $" + total);
  }
}
