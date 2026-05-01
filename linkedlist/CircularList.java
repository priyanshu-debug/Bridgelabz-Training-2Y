class Task {
    int id;
    Task next;

    Task(int id) {
        this.id = id;
    }
}

public class CircularList {
    static Task head = null;

    static void add(int id) {
        Task newNode = new Task(id);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    static void display() {
        Task temp = head;
        do {
            System.out.print(temp.id + " -> ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        display();
    }
}