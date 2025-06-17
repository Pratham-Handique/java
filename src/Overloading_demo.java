// public class Overloading_demo{

//     // Method with 2 int parameters
//     static int add(int a, int b) {
//         return a + b;
//     }

//     // Method with 3 int parameters
//     static int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String [] args){
//         System.out.println(add(2,3));
//         System.out.println(add(2,3,4));
//     }

// }
public class Overloading_demo{

    // Method with 2 int parameters
    public  int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    public  int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String [] args){
        Overloading_demo obj = new Overloading_demo();
        // Creating an object of the class
        // and calling the methods
        System.out.println(obj.add(2,3));       
        System.out.println(obj.add(5,9));
    }

}

