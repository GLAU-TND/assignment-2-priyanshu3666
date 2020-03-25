
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyQueue
{

        MyBinarySearchTree m;
        TreeNode front;
        TreeNode end;
        TreeNode tmp;


    public MyQueue() {
        m=new MyBinarySearchTree();
        end=tmp=front = null;

    }


        public void preOrder(TreeNode node)
        {
            if(node==null)
            {
                return;
            }
            enqueue(node);
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }

        private void enqueue(TreeNode node)
        {
            if(front==null)
            {
                tmp=front=end=node;
            }
            else
            {
                while(tmp.getNext()!=null)
                {
                    tmp=tmp.getNext();
                }
                tmp.setNext(node);
            }
        }


        //root id =1;
        public void printSuccessor(int data)
        {
            preOrder(m.getRoot());
            tmp=front;
            while(tmp.getData()!=data && tmp!=null)
            {
                tmp=tmp.getNext();
            }
            try {
                System.out.println(tmp.getNext().getData());
            }catch(NullPointerException ignore)
            {
                System.out.println("No preorder Successor found");
            }

            }
        }




