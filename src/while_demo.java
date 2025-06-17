public class while_demo {
    public static void a(){

        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(i));
        }

    }
    public static void b() {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
    }
    public static void main(String[] args){
        a();
        b();
    }
}
