public class StringTest {
    public static void main(String[] args) {

        String str = "hello";

        // StringBuilder
        long start1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 1000000; i++) {
            sb.append(str);
        }

        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end1 - start1) + " ms");


        // StringBuffer
        long start2 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();
        for(int i = 0; i < 1000000; i++) {
            sbf.append(str);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end2 - start2) + " ms");
    }
}