class Vehicle {
  protected String brand = "Ford";
//private String modelName = "Mustang"; //wrong method because it is private and cannot be accessed in the subclass
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}
class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();

    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
