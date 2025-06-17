package arraylist;
// Sort an ArrayList of Integers:
import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }

    System.out.println("to insert a new element at index 2");
    myNumbers.add(2,0);
    for (int i : myNumbers) {
      System.out.println(i);
    }
    System.out.println("to remove the element at index 2");
    myNumbers.remove(2);
    for (int i : myNumbers) {
      System.out.println(i);
    }
    
    // System.out.println("to change the element at index 0");
    // myNumbers.set(0, 100);
    // for (int i : myNumbers) {
    //   System.out.println(i);
    // }

  }
}