package com.demo.Mediator;

public class DesignPattern {

  public static void main(String[] args) {
    User spanishUser= new User("spain","spanish","hola");
    User english= new User("eng","english","hello");
    System.out.println(spanishUser.trannslate());
    System.out.println(english.trannslate());
  }
}
