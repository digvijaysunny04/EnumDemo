package com.demo.Factory;

public class Main {

  public static void main(String[] args) {
    FActory1 ff=new FActory1();
    Notification1 n=ff.get1("SMS");
    n.notify1();
  }
}
