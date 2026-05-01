public class WordSearch {
    static char[][] grid = {
            {'C', 'A', 'T', 'S'},
            {'O', 'R', 'E', 'A'},
            {'D', 'E', 'A', 'M'},
            {'E', 'L', 'L', 'S'}
    };

    static String word = "DREAM";
    static boolean[][] visited = new boolean[4][4];

    static int[] rowMove = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] colMove = {-1, 0, 1, -1, 1, -1, 0, 1};

    static boolean search(int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= 4 || col < 0 || col >= 4) {
            return false;
        }

        if (visited[row][col]) {
            return false;
        }

        if (grid[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        for (int i = 0; i < 8; i++) {
            int newRow = row + rowMove[i];
            int newCol = col + colMove[i];

            if (search(newRow, newCol, index + 1)) {
                return true;
            }
        }

        visited[row][col] = false; 
        return false;
    }

    public static void main(String[] args) {
        boolean found = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (search(i, j, 0)) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Word DREAM found");
        } else {
            System.out.println("Word DREAM not found");
        }
    }
}