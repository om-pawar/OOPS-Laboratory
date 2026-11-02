public class Transform2D {
    double x, y;

    Transform2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void translate(double tx, double ty) {
        System.out.printf("Translated: (%.1f, %.1f)%n", (x + tx), (y + ty));
    }

    void scale(double sx, double sy) {
        System.out.printf("Scaled: (%.1f, %.1f)%n", (x * sx), (y * sy));
    }

    void rotate(double angleDeg) {
        double rad = Math.toRadians(angleDeg);
        double xr = x * Math.cos(rad) - y * Math.sin(rad);
        double yr = x * Math.sin(rad) + y * Math.cos(rad);
        System.out.printf("Rotated (%.0f deg): (%.1f, %.1f)%n", angleDeg, xr, yr);
    }

    void shear(double shx, double shy) {
        System.out.printf("Sheared: (%.1f, %.1f)%n", (x + shx * y), (y + shy * x));
    }

    public static void main(String[] args) {
        Transform2D pt = new Transform2D(10, 20);
        pt.translate(5, 5);
        pt.scale(2, 2);
        pt.rotate(90);
        pt.shear(1, 0);
    }
}
