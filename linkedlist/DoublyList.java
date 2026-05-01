class Movie {
    String title;
    Movie next, prev;

    Movie(String t) {
        title = t;
    }
}

public class DoublyList {
    static Movie head = null;

    static void add(String t) {
        Movie newNode = new Movie(t);

        if (head == null) {
            head = newNode;
            return;
        }

        Movie temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    static void display() {
        Movie temp = head;
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        add("Movie1");
        add("Movie2");
        display();
    }
}