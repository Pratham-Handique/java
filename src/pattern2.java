public class pattern2 {
    /* 
        #
        ##
        ###
        ####
        #####
    */
    public static void cas(int n){
        String var="";
        for (int i=0;i<n;i++){
            var+="#";
            System.out.println(var);
        }
    }
    /* 
        #####
        ####
        ###
        ##
        #
    */
    public static void cas1(int n) {
        System.out.println("");
        System.out.println("The reverse is ");
        System.out.println("");
        for (int i = n; i > 0; i--) {
            String var = "";
            for (int j = 0; j < i; j++) {
                var += "#";
            }
            System.out.println(var);
            }
        }
    /* 
        #####
        ####
        ###
        ##
        #
        using while loop

    */
    public static void cas2(int n) {
    System.out.println("");
    System.out.println("The reverse is ");
    System.out.println("");
    while (n > 0) {
        String var = "";
        int j = 0;
        while (j < n) {
            var += "#";
            j++;
        }
        System.out.println(var);
        n--;
    }
}

    public static void main(String[] args){
        cas(5);
        cas1(5);
        cas2(5);
    }
}
