package com.demo;

public enum Day {

  SUNDAY(), MONDAY, TUESDAY(2), WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

  int value;

  private Day(int value) {
    System.out.println("arg cons");
    this.value = value;
  }

  private Day() {
    System.out.println("no arg cons");
  }

  public static void main(String args[]) {

  }

}