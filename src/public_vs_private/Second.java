package public_vs_private;

class Second {
  public static void main(String[] args) {
    Main myObj = new Main(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
