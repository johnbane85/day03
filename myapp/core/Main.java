package myapp.core;

public class Main {
  
  public static void main(String[] args) {
    // Instantiate a car
    Car myCar = new Car();
    myCar.setColour("red");
    // myCar.colour = "red";
    // myCar.make = "honda";
    // myCar.engineCapacity = 2000;

    myCar.start();

    System.out.printf("The colour of my car is %s\n", myCar.getColour());

    myCar.setColour("blue");
    System.out.printf("I have changed colour of my car to %s\n", myCar.getColour());

    // Instantiate another car
    Car myOtherCar = new Car();
    // myOtherCar.colour = "silver";
    // myOtherCar.make = "subaru";
    // myOtherCar.engineCapacity = 2500;

    System.out.printf("The engine capacity of my car is %d\n", myOtherCar.getEngineCapacity());

    myOtherCar.stop();

    Car myThirdCar = new Car ("silver", "subaru");
    myThirdCar.make("subaru");

    // Honda
    
  }
}
