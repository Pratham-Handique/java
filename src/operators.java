public class operators {
    public static void main(String[] args){
        //comparison operators

        int x=2,y=2;
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println(x*=y);
        System.out.println(x&=1);

        int z = 4;
        //z &= 1;
        System.out.println( z &= 1);


        // x = 4 = 0100
        // 1     = 0001
        // --------------
        // &     = 0000 => 0

        //logical operators
        //&&
        int a1=2;
        int b1=3;
        System.out.println(a1>1 && b1<5);
        //&&
        System.out.println(a1>1 || a1>3);
        //!
        System.out.println(!(a1>1));

    }
}
