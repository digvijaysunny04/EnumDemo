package com.demo.Strategy;

public class HexaConvertor implements ConvertingStrategy{

  @Override
  public String convert(int number) {
    return Integer.toHexString(number);
  }
}
