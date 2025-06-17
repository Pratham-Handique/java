package encapsulation_demo;

public class Main {
    //correct method 
    public static void main(String[] args){
        Person my_obj= new Person();
        my_obj.setName("John");
        System.out.println(my_obj.getName());
    }
    //incorrect method 
    /*
    public static void main(String[] args){
        Person my_obj= new Person();
        my_obj.name="John"; //error
        System.out.println(my_obj.name); //error
    }
    
    The above code will not compile because the name field is 
    private and cannot be accessed directly from outside the Person class.
    
    */
    
}
