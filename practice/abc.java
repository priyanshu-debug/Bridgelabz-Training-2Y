import java.util.Scanner;

public class abc {

    public static boolean isvowel(char ch) {
        return ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine(); 

        for(int i = 0; i < testCase; i++){
            String str = sc.nextLine().toUpperCase();

            int[] freq = new int[26];
            int vowel = 0;
            int consonent = 0;

            for(char ch : str.toCharArray()){
                if(ch >= 'A' && ch <= 'Z') {  
                    freq[ch - 'A']++;

                    if(isvowel(ch)){
                        vowel++;
                    } else {
                        consonent++;
                    }
                }
            }

            int ans = Integer.MAX_VALUE;

            for(char j = 'A'; j <= 'Z'; j++){
                int count = freq[j - 'A'];
                int cost;

                if(isvowel(j)){
                    cost = consonent + (vowel - count) * 2;
                } else {
                    cost = vowel + (consonent - count) * 2;
                }

                ans = Math.min(ans, cost);
            }

            System.out.println("Case #" + (i + 1) + ": " + ans);
        }

        sc.close();
    }
}
