package com.demo;

interface A {
    void m1();
}
 class B implements A {
     public void m1(){
    System.out.println("One");
  }

   public static void main(String[] args) {
     System.out.println("hi");
     B b=new B();
     b.m1();
   }
}