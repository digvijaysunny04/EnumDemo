package com.demo.Strategy;

public class Main {

  public static void main(String[] args) {
    Context cc=new Context(new HexaConvertor());
    System.out.println(cc.convert1(123));
  }
}
