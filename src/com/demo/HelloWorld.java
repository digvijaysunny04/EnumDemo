package com.demo;

enum RGB {


  RED("Red");
  {
    System.out.println("block in enum");
  }
  static
  {
    System.out.println("static in enum hello 123");
  }
  public static final String PREFIX = "color ";

  public String getRGBString() {
    return PREFIX + color;
  }

  String color;

  RGB(String color) {
    this.color = color;
    System.out.println("hello in RGB");
  }
}

public class HelloWorld {
  static int i=0;
  static
  {
    i=1;
    System.out.println("hello");
  }
  public static void main(String[] args) {
    String c = RGB.RED.getRGBString();
    System.out.print("Hello " + c + " ");
    System.out.println("--> "+i);
  }


}