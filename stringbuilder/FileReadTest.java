import java.io.*;

public class FileReadTest {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; // apni file ka path

        // FileReader
        try {
            long start1 = System.currentTimeMillis();

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int wordCount = 0;
            String line;

            while((line = br.readLine()) != null) {
                String words[] = line.split("\\s+");
                wordCount += words.length;
            }

            br.close();

            long end1 = System.currentTimeMillis();
            System.out.println("FileReader Words: " + wordCount);
            System.out.println("FileReader Time: " + (end1 - start1) + " ms");

        } catch(Exception e) {
            System.out.println(e);
        }


        // InputStreamReader
        try {
            long start2 = System.currentTimeMillis();

            BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath))
            );

            int wordCount = 0;
            String line;

            while((line = br.readLine()) != null) {
                String words[] = line.split("\\s+");
                wordCount += words.length;
            }

            br.close();

            long end2 = System.currentTimeMillis();
            System.out.println("InputStreamReader Words: " + wordCount);
            System.out.println("InputStreamReader Time: " + (end2 - start2) + " ms");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}