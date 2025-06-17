package Abstract_demo;
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}

/*
Can only be used in an abstract class, and can only be used on methods. 
The method does not have a body, for example abstract void run();. The body
is provided by the subclass (inherited from).
An abstract method belongs to an abstract class, and it does not have a body. 
The body is provided by the subclass
*/