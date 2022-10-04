package com.demo.Mediator;

public class Transaltor implements ITransaltor  {

  @Override
  public String transalte(String language, String message) {
        if(language.equalsIgnoreCase("spanish")) return "hola";
    if(language.equalsIgnoreCase("english")) return "hello";
    return "Unable to translate ";
  }
}
