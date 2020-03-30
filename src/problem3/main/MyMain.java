/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of students you want to enter");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the Student name: ");
            String name = sc.nextLine();
            System.out.println("enter the roll number of this student: ");
            int rollNo = sc.nextInt();

            Student student = new Student(name,rollNo);
            queue.enqueue(student);
            sc.nextLine();
        }
        queue.show();
    }

}
