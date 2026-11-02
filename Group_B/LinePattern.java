public class LinePattern {
    // (a) DDA Line Drawing Algorithm
    static void dda(int x1, int y1, int x2, int y2, String style) {
        int dx = x2 - x1, dy = y2 - y1;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));
        float xInc = dx / (float) steps, yInc = dy / (float) steps;
        float x = x1, y = y1;
        System.out.print("DDA (" + style + "): ");
        for (int i = 0; i <= steps; i++) {
            if (style.equals("Thick") || (style.equals("Dotted") && i % 2 == 0))
                System.out.print("(" + Math.round(x) + "," + Math.round(y) + ") ");
            x += xInc; y += yInc;
        }
        System.out.println();
    }

    // (b) Bresenham Line Drawing Algorithm
    static void bresenham(int x1, int y1, int x2, int y2, String style) {
        int dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);
        int p = 2 * dy - dx, x = x1, y = y1;
        System.out.print("Bresenham (" + style + "): ");
        for (int i = 0; i <= dx; i++) {
            if (style.equals("Solid") || (style.equals("Dashed") && i % 3 != 0))
                System.out.print("(" + x + "," + y + ") ");
            x++;
            if (p < 0) p += 2 * dy;
            else { y++; p += 2 * (dy - dx); }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("--- Line Pattern Generator ---");
        // Rectangles with Dotted and Thick line styles
        dda(0, 0, 4, 0, "Dotted");       // Outer Rectangle edge
        dda(1, 1, 3, 1, "Thick");        // Inner Rectangle edge
        
        // Diamond with Dashed and Solid line styles
        bresenham(0, 2, 2, 4, "Dashed"); // Diamond edge 1
        bresenham(2, 0, 4, 2, "Solid");  // Diamond edge 2
    }
}
