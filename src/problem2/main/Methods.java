package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Methods {
    MyBinarySearchTree m;
    Queue<Integer> pre, post;
    Iterator<Integer> itrPre, itrPost;
    int ctr;

    public Methods() {
        this.m = new MyBinarySearchTree();
        pre = new LinkedList<>();
        post = new LinkedList<>();
        itrPre = pre.iterator();
        itrPost = post.iterator();
        ctr = 0;
    }


    //preorder
    public void printPreOrder(TreeNode node) {
        if (node == null)
            return;

        System.out.println(node.getData());
        pre.add(node.getData());
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
    }

    //postorder
    public void printPostOrder(TreeNode node) {
        if (node == null)
            return;

        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.println(node.getData());
        post.add(node.getData());
    }

    // Verification of statement "root element occours first in pre-order and last in post-order"

    public boolean verify_A() throws NullPointerException {
        try {
            return m.getRoot().getData() == pre.poll() && m.getRoot().getData() == post.poll();
        } catch (NullPointerException ignore) {
        }
        return false;
    }


    //verification of statement "Both the traversal will give same element at the mid position for odd number of nodes."

    public boolean verify_B() {
        int size = pre.size() % 2;
        int flagPre = 0;
        int flagPost = 0;
        if (pre.size() % 2 == 1 && post.size() % 2 == 1) {
            //last element of this while loop is middle element of pre-order traversal queue
            while (itrPre.hasNext() && ctr < size) {
                flagPre = itrPre.next();
                ctr++;
            }
            while (itrPre.hasNext() && ctr < size) {
                flagPost = itrPost.next();
                ctr++;
            }
            return flagPost == flagPre;
        } else {
            System.out.println("Number of elements in tree are even");
            return false;
        }
    }
}
