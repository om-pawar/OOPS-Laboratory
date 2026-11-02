import java.util.Scanner;

public class CircleDrawing {
    static void drawCircle(int r, int choice, String style) {
        int x = 0, y = r, step = 0;
        int d = (choice == 2) ? (3 - 2 * r) : (1 - r); // Bresenham vs Midpoint
        System.out.print(style + " Circle Points (Octant 1): ");
        
        while (x <= y) {
            if (style.equals("Solid") || (style.equals("Dotted") && step % 2 == 0) || (style.equals("Dashed") && step % 3 != 0))
                System.out.print("(" + x + "," + y + ") ");
            
            if (choice == 1) { // DDA approximation
                x++; y = (int) Math.round(Math.sqrt(r * r - x * x));
            } else if (choice == 2) { // Bresenham
                if (d < 0) d += 4 * x + 6;
                else { d += 4 * (x - y) + 10; y--; }
                x++;
            } else { // Midpoint
                if (d < 0) d += 2 * x + 3;
                else { d += 2 * (x - y) + 5; y--; }
                x++;
            }
            step++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Circle Drawing Menu ---");
        System.out.print("1. DDA  2. Bresenham  3. Midpoint | Enter choice: ");
        int ch = sc.nextInt();
        
        drawCircle(5, ch, "Solid");
        drawCircle(5, ch, "Dotted");
        drawCircle(5, ch, "Dashed");
    }
}
