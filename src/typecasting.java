public class typecasting {
    public static void main(String[] args){
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int x=9;
        double y=x;
        System.out.println("the int value is "+x);
        System.out.println("the type casted values is "+y);

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        float v=7.92f;
        int c=(int) v;
        System.out.println("\n");
        System.out.println("float value is " + v);
        System.out.println("type casted value is "+c);
        System.out.println("\n");
        double a=2.23f;
        int b= (int) a;
        System.out.println("double value is " +a);
        System.out.println("type casted value is " +b);
        System.out.println("\n");
    }
}



