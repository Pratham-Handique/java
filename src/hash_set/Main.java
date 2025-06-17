package hash_set;

import java.util.*;
public class Main {
    public static void main(String[] args){
        HashSet<String> cars=new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); //duplicate
        cars.add("BMW"); //duplicate
        System.out.println(cars);
        System.out.println("");
        //loop through a hash set
        for (String i: cars){
            System.out.println(i);
        }
        System.out.println(cars.contains("Volvo"));
        // The following code is invalid for HashSet as it does not support get(index)
        // for (int i=0;i<cars.size();i++){
        //     System.out.println(cars.get(i));
        // }
        // the correct way to loop through a HashSet is using a for-each loop
        // or using an iterator
        // using an iterator
    }
}
