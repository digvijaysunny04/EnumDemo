package com.demo;

abstract class Demo1 {
  String value;
  public Demo1( String value ) {
    this.value = value;
  }
  public String getValue()
  {
    return value;
  }
}
public class Test123 extends Demo1 {
  public Test123() {
    super("CoreJava");
  }
}