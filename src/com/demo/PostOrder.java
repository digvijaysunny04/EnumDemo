package com.demo;

class Node3 {
    int  root;
    Node3 left,right;
    Node3(int key)
    {
      this.root=key;
      left=right=null;
    }
}

 class Tree3
{

  Node3 root;
  Tree3()
  {
   root=null;
  }


  public static void main(String[] args) {
      //Tree3 t3.root=new  Node3(1);


    //n3right.getOrder1();
    //System.out.printf("%d",);

  }
public void getOrder1(Node3 n)
{
  if(n== null)
  {
    return;
  }
  getOrder1(n.left);

  // traverse the root node


  // traverse the right child
  getOrder1(n.right);
  System.out.print(n.root + "->");

}


}

