package com.demo.Strategy;

public class BinaryConvertor  implements  ConvertingStrategy{

  @Override
  public String convert(int number) {
    return Integer.toBinaryString(number);
  }
}
