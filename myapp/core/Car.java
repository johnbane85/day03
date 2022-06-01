package myapp.core;

public class Car {
  
  // properties, members
  String colour;
  String make;
  Integer engineCapacity;
  Boolean started = false;
  Long startedSince;

  // Default constructor
  public car() {
    System.out.println("** Instantiating Car pbject");
    this.colour = "red";
  }

  public car(Integer capacity) {
    this.engineCapacity = capacity;
  }

  public String getColour() {
    return colour;
  }

  // getter and setter for colour
  public void setColour(String colour) {
    this.colour = colour;
  }

  public long getDrivingDuration() {
    if(this.isStarted()) {
      // Convert to ms -> sec
      return (System.currentTimeMillis() - this.startedSince) / 1000;
    }
    return (long)-1;
  }


  // behaviour - methods
  public void start() {
    if (this.started) {
      System.out.println("Your car is running");
    } else {
      System.out.println("Vroom.....");
      this.started = true;
      // Since 0000 Jan 1 1970
      this.startedSince = System.currentTimeMillis();
    }
    

  }

  public void stop(){
    if (!this.started) {
      System.out.println("Your car is not running");
    } else {
      System.out.println();
    }
  }
}
