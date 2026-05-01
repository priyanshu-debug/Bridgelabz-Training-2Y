import java.util.*;

public class SortStack {
    static void insertSorted(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insertSorted(st, x);
        st.push(temp);
    }

    static void sort(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int x = st.pop();
        sort(st);
        insertSorted(st, x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(10);
        st.push(40);
        st.push(20);

        sort(st);

        System.out.println(st);
    }
}