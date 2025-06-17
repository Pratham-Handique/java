package hash_map;
import java.util.*;
public class Main {
    public static void main(String[] args){
        HashMap<String,String> cars=new HashMap<String,String>();
        cars.put("Volvo","XC60");
        cars.put("BMW","X5");
        cars.put("Ford","Mustang");
        System.out.println(cars);
        System.out.println(cars.get("Volvo"));
        System.out.println("");
        //loop through a hash map keys only
        System.out.println("Keys only");
        System.out.println("");
        for (String i: cars.keySet()){
            System.out.println(i);
        }
        //loop through a hash map values only
        System.out.println("Values only");
        System.out.println("");
        for (String i: cars.values()){
            System.out.println(i);
        }
        //loop through a hash map key and value
        System.out.println("Key and Value");
        System.out.println("");
        for (String i:cars.keySet()){
            System.out.println(i + " " + cars.get(i));
        }
        // The following loop is invalid because HashMap keys are Strings, not integers.
        // If you want to print all values, use the loop above or iterate over entrySet if you want both keys and values.
        // Example using entrySet:
        /*
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        */
    }
}
