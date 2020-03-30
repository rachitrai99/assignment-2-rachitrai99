/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem2.bst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue=new MyQueue();
        MyQueue postQueue=new MyQueue();
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree(preQueue,postQueue);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(55);
        myBinarySearchTree.insert(60);
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println("Pre Order: ");
        preQueue.show();
        System.out.println("Post order : ");
        postQueue.show();
        System.out.println();
    }
}
