package list_sorting;
import java.util.*;
public class string {
    public static void main(String[] argss){
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("byd");
        cars.add("audi");
        Collections.sort(cars);
        System.out.println("Sorted list of cars: " + cars);
    }
}
