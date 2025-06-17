package packages_classes;
import java.util.Scanner; // import the Scanner class 

class Scanner_demo {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   //nextLine() reads the entire line including spaces
       
    System.out.println("Username is: " + userName);   
    myObj.close();     
  }
}

