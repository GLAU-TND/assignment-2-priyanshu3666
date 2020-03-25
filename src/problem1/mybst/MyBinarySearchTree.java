
package problem1.mybst;


import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// to implement BinarySearchTree
public class MyBinarySearchTree {


    TreeNode newnode, root, tmp;
    int ctr;
    Queue<Integer> queue;

    public MyBinarySearchTree() {
        tmp = null;
        root = null;
        ctr = 0;
        queue = new LinkedList<>();
    }

    //node generation
    private void generateNode(int data)
    {
        newnode=new TreeNode();
        newnode.setData(data);
        newnode.setLeft(null);
        newnode.setRight(null);
    }
    //seeting root node
    public void setRoot(int data)
    {
        generateNode(data);
        if(root==null)
        {
            root=newnode;
            tmp=root;
            newnode=null;

        }
    }
    public TreeNode getRoot() {
        return root;
    }
//setting binary tree
    public void insert(TreeNode tmproot) {
        if (newnode == null) {
            generateNode(new Scanner(System.in).nextInt());
            System.out.println("Node generated");
        }
        try {
            if (newnode.getData() <= tmproot.getData()) {
                System.out.println("left traversal...");
                if (tmproot.getLeft() == null) {
                    tmproot.setLeft(newnode);
                    System.out.println("node inserted left");
                    queue.add(newnode.getData());
                    ctr--;
                    newnode = null;
                    return;
                } else {
                    System.out.println("left not empty changing tmproot ");
                    insert(tmproot.getLeft());
                }
            }
        }catch(NullPointerException ignore){}
        try {
            if (newnode.getData() > tmproot.getData()) {
                System.out.println("Right traversal...");
                if (tmproot.getRight() == null) {
                    tmproot.setRight(newnode);
                    System.out.println("Node inserted right");
                    ctr++;
                    newnode = null;
                } else {
                    System.out.println("Right not empty changing tmproot");
                    insert(tmproot.getRight());
                }
            }
        } catch (NullPointerException ignore) {
        }
    }

    //Answer to questions
    public void printLeftChildren() {
        System.out.println("The left children of inserted nodes of Binary search tree are :");
        System.out.println(queue.toString());
        System.out.println("Number of Nodes not having left children" + ctr);
    }

}


