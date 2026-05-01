import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[price.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < price.length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
}