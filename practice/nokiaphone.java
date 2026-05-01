import java.util.*;

public class nokiaphone {

    public static void main(String[] args) {

        String input = "67";
        String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder curAns = new StringBuilder();
        List<String> result = new ArrayList<>();

        solve(input, keypad, 0, curAns, result);

        System.out.println(result);
    }

    public static void solve(String input, String[] keypad, int index,
                             StringBuilder curAns, List<String> result) {

        // Base case
        if (index == input.length()) {
            result.add(curAns.toString());
            return;
        }

        String word = keypad[input.charAt(index) - '0'];

        for (int i = 0; i < word.length(); i++) {
            curAns.append(word.charAt(i));             
            solve(input, keypad, index + 1, curAns, result);
            curAns.deleteCharAt(curAns.length() - 1);     
        }
    }
}
