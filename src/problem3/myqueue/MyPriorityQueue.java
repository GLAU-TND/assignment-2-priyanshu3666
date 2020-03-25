package problem3.myqueue;

import problem3.node.Student;
//Student is the node for priority queue linked list

public class MyPriorityQueue {

    Student tmp, front, end;
    int i = 0;


    //inserting  new student into into queue  and priority is set by roll number
    public void enqueue(Student newStudent) {

        if (front == null || newStudent.getRoll() < front.getRoll()) {
            newStudent.setNext(front);
            front = newStudent;
        } else {
            Student temp = front;

            while (temp.getNext() != null && temp.getNext().getRoll() <= newStudent.getRoll()) {
                temp = temp.getNext();
            }
            newStudent.setNext(temp.getNext());
            temp.setNext(newStudent);
        }
    }

    // printing queue
    public void dequeue() {
        if (front == null) {
            System.out.println("No entry found");
            return;
        }
        do {
            System.out.println(i++);
            System.out.print(front.getName() + ":");
            System.out.println(front.getRoll());
            front = front.getNext();
        }
        while (front != null);
    }
}