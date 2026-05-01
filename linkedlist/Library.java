class Book {
    int id;
    Book next, prev;

    Book(int id) {
        this.id = id;
    }
}

public class Library {
    static Book head = null;

    static void add(int id) {
        Book newNode = new Book(id);

        if (head == null) {
            head = newNode;
            return;
        }

        Book temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    static void count() {
        Book temp = head;
        int c = 0;

        while (temp != null) {
            c++;
            temp = temp.next;
        }

        System.out.println("Total books = " + c);
    }

    public static void main(String[] args) {
        add(101);
        add(102);
        count();
    }
}