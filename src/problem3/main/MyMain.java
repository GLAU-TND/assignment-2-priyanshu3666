package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Student;


// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue m = new MyPriorityQueue();
        Student newstudent;
        for (int i = 0; i < 4; i++) {
            newstudent = new Student();
            m.enqueue(newstudent);
        }
        m.dequeue();


    }
}
