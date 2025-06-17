package linked_list;
import java.util.*;
class Main {
    public static void main(String[] args){
        LinkedList<String> cars=new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        // Use addLast() to add the item to the end
        cars.addLast("Toyota");
        // Use removeFirst() to remove the first item
        System.out.println(cars.removeFirst());
        // Use removeLast() to remove the last item
        System.out.println(cars.removeLast());
        // Use getFirst() to get the first item
        System.out.println(cars.getFirst());
        // Use getLast() to get the last item
        System.out.println(cars.getLast());
        // Use get() to get the item at index 0
        System.out.println(cars.get(0));
    }
}
