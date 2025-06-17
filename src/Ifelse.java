import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give the number: ");
        int N = in.nextInt();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5)
                System.out.println("Not Weird");
            else if (N <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }

        in.close();

        //shorthand if 
        int i =2;
        Boolean result=(i<3) ? true :false;
        System.out.println(result);
    }
}
