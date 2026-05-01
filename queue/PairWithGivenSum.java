import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int need = target - num;

            if (set.contains(need)) {
                System.out.println("Pair found: " + need + " " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("Pair not found");
    }
}