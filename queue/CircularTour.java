public class CircularTour {
    public static void main(String[] args) {
        int petrol[] = {4, 6, 7, 4};
        int distance[] = {6, 5, 3, 5};

        int start = 0;
        int balance = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            balance = balance + petrol[i] - distance[i];

            if (balance < 0) {
                start = i + 1;
                deficit = deficit + balance;
                balance = 0;
            }
        }

        if (balance + deficit >= 0) {
            System.out.println("Start index = " + start);
        } else {
            System.out.println("Tour not possible");
        }
    }
}