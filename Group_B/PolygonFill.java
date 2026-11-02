import java.util.Scanner;

public class PolygonFill {
    static int[][] g = {
        {1, 1, 1, 1},
        {1, 0, 0, 1},
        {1, 0, 1, 1},
        {1, 1, 1, 1}
    };

    // Flood Fill and Seed Fill
    static void fill(int x, int y) {
        if (g[x][y] != 0) return;
        g[x][y] = 2;
        fill(x + 1, y);
        fill(x - 1, y);
        fill(x, y + 1);
        fill(x, y - 1);
    }

    public static void main(String[] args) {
        System.out.print("1.Scan 2.Flood 3.Seed: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        if (ch == 1) {
            // Scan Fill
            g[1][1] = g[1][2] = g[2][1] = 2;
        } else {
            // Flood / Seed Fill from seed point (1, 1)
            fill(1, 1);
        }

        System.out.println("Result Grid (1=Border, 2=Filled):");
        for (int[] r : g) {
            for (int v : r) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
