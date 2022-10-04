package com.demo;

class Tree1 {
    Node1 root;
  Tree1()
  {
    root=null;

  }

  public static void main(String[] args) {


    Tree1 tt=new Tree1();
    tt.root= new Node1(1);
    tt.root.left= new Node1(2);
    tt.root.right= new Node1(2);

    // create child nodes of left child
    tt.root.left.left = new Node1(5);
    tt.root.left.right = new Node1(6);

    System.out.println("In Order traversal");
    tt.getOrder(tt.root);
  }


  public void getOrder(Node1 n)
  {
    if(n == null)
    {
      return;
    }

    System.out.printf("%d" ,n.root);
    getOrder(n.left);
    getOrder(n.right);

  }

}
class Node1
{
  int root;
  Node1 left,right;
  Node1(int key)
  {
    this.root=key;
    left=right=null;
  }

}
