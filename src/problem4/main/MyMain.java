
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MyBinarySearchTree m=new MyBinarySearchTree();
        MyQueue q=new MyQueue();
        //setting up the root
        m.setRoot(sc.nextInt());
        //inserting into the tree
        for (int i = 0; i <5 ; i++)
        {
         m.insert(m.getRoot());
        }
        //method to print preorder Successor of
        //Answer
        System.out.println("Enter value of which you want to find preorder Successor");
         q.printSuccessor(sc.nextInt());
    }
}
