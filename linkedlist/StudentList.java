class Student {
    int roll;
    String name;
    Student next;

    Student(int r, String n) {
        roll = r;
        name = n;
    }
}

public class StudentList {
    static Student head = null;

    static void add(int r, String n) {
        Student newNode = new Student(r, n);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        add(1, "A");
        add(2, "B");
        display();
    }
}