package myapp.core;

public class RemoteControl {

  private Controllable control;

  public RemoteControl(Controllable c) {
    this.control = c;
  }

  public void start() {
    this.start();
  }

  public void stop() {
    this.control.stop();
  }
}
