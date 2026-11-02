import java.util.Scanner;

public class PolyClip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vertices count: ");
        int n = sc.nextInt();

        System.out.println("Enter vertices (x y):");
        for (int i = 0; i < n; i++) {
            int x = Math.max(10, Math.min(sc.nextInt(), 100));
            int y = Math.max(10, Math.min(sc.nextInt(), 100));
            System.out.println("Clipped: (" + x + "," + y + ")");
        }
    }
}
