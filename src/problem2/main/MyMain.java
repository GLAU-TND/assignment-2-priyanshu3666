package problem2.main;
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        Methods mthds = new Methods();
        for (int i = 0; i < 10; i++) {
            m.insert(m.getRoot());
        }

        // Verification of statement "root element occours first in pre-order and last in post-order  "

        mthds.printPostOrder(m.getRoot());
        mthds.printPreOrder(m.getRoot());
        System.out.println(mthds.verify_A());


        //verification of statement "Both the traversal will give same element at the mid position for odd number of nodes."

        System.out.println(mthds.verify_B());


    }

}
