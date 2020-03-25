
package problem3.node;

import java.util.Scanner;

// to store student information and properties
public class Student {
    String name;
    int roll;
    Student next;

    public Student() {
        System.out.print("Name : ");
        name = new Scanner(System.in).next();
        System.out.print("roll no.: ");
        roll = new Scanner(System.in).nextInt();
        next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}
