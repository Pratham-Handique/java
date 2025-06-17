package arraylist;

//Sort an ArrayList of Strings:
import java.util.*;


public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    // for (String i : cars) {
    //   System.out.println(i);
    // }
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}