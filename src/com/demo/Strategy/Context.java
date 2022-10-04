package com.demo.Strategy;

public class Context {
      ConvertingStrategy convertingstrategy;
      public Context(ConvertingStrategy convertingstrategy)
      {
        this.convertingstrategy=convertingstrategy;
      }
      public String convert1(int number)
      {
        return convertingstrategy.convert(number);
      }

}
