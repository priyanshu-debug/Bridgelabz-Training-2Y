import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {12, 15, 10, 14, 12};
        int max = 18;

        int count[] = new int[max + 1];

        for(int num : arr)
            count[num]++;

        int index = 0;

        for(int i = 0; i <= max; i++) {
            while(count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}