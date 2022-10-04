package com.demo;
/*

class Test
{
  static
  {
    System.out.println("Why I am not executing ");
  }
  public static final int param=20;
}

public class Demo
{
  public static void main(String[] args)
  {
    new Demo();
    System.out.println(Test.param);

  }
  {
    System.out.println("Why I am not executing 1323333 ");
  }
  static
  {
    System.out.println("Why I am not executing 13 ");
  }

  public Demo()
  {
    System.out.println("Constructor ");
  }


}*/
class Test
{
  static
  {
    System.out.println("Executing Static Block.");
  }
  public  int param=21;

  public int getParam(int param){

    return param=param;
  }
}

public class Demo
{
  public static void main(String[] args)
  {

    System.out.println(new Test().getParam(1));
    int i=1;
    for (;i<4;) i++;  System.out.println(i);
    /*  for(int j = 0; j<5; )
    {
      System.out.println("Hello");
    }*/


  }
}

/*

  String a = new String("Examveda");
  String b = new String("Examveda");
  String c = "Examveda";
  String d = "Examveda";
*/

  // 3