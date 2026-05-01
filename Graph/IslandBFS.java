import java.util.*;

public class IslandBFS {
    public static void main(String[] args) {
        int grid[][] = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 1}
        };

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int dr[] = {1, -1, 0, 0};
        int dc[] = {0, 0, 1, -1};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;

                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {
                        int cell[] = q.poll();

                        for (int k = 0; k < 4; k++) {
                            int nr = cell[0] + dr[k];
                            int nc = cell[1] + dc[k];

                            if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1) {
                                grid[nr][nc] = 0;
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Islands = " + count);
    }
}