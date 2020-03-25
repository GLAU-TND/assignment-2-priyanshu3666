package problem1.main;



import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree m = new MyBinarySearchTree();
        m.setRoot(new Scanner(System.in).nextInt());
        System.out.println("root set" + m.getRoot().getData());
        for (int i = 0; i < 10; i++) {
            m.insert(m.getRoot());
        }
        m.printLeftChildren();


    }
}
