class Rectangle {
    private int x1, y1; // top-left
    private int x2, y2; // bottom-right

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = Math.min(x1, x2);
        this.y1 = Math.min(y1, y2);
        this.x2 = Math.max(x1, x2);
        this.y2 = Math.max(y1, y2);
    }

    public Rectangle(Rectangle other) {
        this.x1 = other.x1;
        this.y1 = other.y1;
        this.x2 = other.x2;
        this.y2 = other.y2;
    }

    public Rectangle enclosing(Rectangle other) {
        int newX1 = Math.min(this.x1, other.x1);
        int newY1 = Math.min(this.y1, other.y1);
        int newX2 = Math.max(this.x2, other.x2);
        int newY2 = Math.max(this.y2, other.y2);
        return new Rectangle(newX1, newY1, newX2, newY2);
    }

    public void display() {
        System.out.println("Top-left: (" + x1 + ", " + y1 + "), Bottom-right: (" + x2 + ", " + y2 + ")");
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, 4, 4);
        Rectangle r2 = new Rectangle(2, 3, 6, 6);
        Rectangle r3 = new Rectangle(0, 2, 3, 5);
        Rectangle r4 = new Rectangle(5, 0, 7, 3);

        Rectangle r12 = r1.enclosing(r2);
        Rectangle r123 = r12.enclosing(r3);
        Rectangle r1234 = r123.enclosing(r4);

        System.out.println("Rectangle 1:");
        r1.display();
        System.out.println("Rectangle 2:");
        r2.display();
        System.out.println("Rectangle 3:");
        r3.display();
        System.out.println("Rectangle 4:");
        r4.display();
        System.out.println("Rectangle enclosing all (R1234):");
        r1234.display();
    }
}