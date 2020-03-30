/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyCircularQueue myCircularQueue=new MyCircularQueue();
        System.out.println("Enter size of student list");
        int size = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[size];
        int count =0;
        for (int i = 0; i <size ; i++) {
            System.out.println("enter student name: ");
            String name = sc.nextLine();
            System.out.println("enter the no. of backlogs: ");
            int b = sc.nextInt();
            Student student = new Student(b,name);
            myCircularQueue.enqueue(student);
            sc.nextLine();
        }

        System.out.println("original no of students : "+ myCircularQueue.getSize());
        System.out.println("no of students deleted: "+ myCircularQueue.remove());
        System.out.println("remaining no of students : "+ (myCircularQueue.getSize() - myCircularQueue.remove()));
    }
}
