class Item {
    int id;
    int qty;
    int price;
    Item next;

    Item(int id, int q, int p) {
        this.id = id;
        qty = q;
        price = p;
    }
}

public class Inventory {
    static Item head = null;

    static void add(int id, int q, int p) {
        Item newNode = new Item(id, q, p);

        if (head == null) {
            head = newNode;
            return;
        }

        Item temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
    }

    static void totalValue() {
        Item temp = head;
        int sum = 0;

        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }

        System.out.println("Total = " + sum);
    }

    public static void main(String[] args) {
        add(1, 2, 50);
        add(2, 3, 30);
        totalValue();
    }
}