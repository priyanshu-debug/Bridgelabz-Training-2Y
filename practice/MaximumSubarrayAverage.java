public class MaximumSubarrayAverage {

      public static double findAverage(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        System.out.println("Nirvi Mathur");
        double avg = findAverage(new int[] { 2, 1, 5, 1, 3, 2 }, 3);
        System.out.println("Maximum average of subarrays of size K: " + avg);
    }
  
}
