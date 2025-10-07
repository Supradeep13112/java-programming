import java.util.Scanner;
class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getXY() {
        return new int[]{x, y};
    }
    public double distance(int otherX, int otherY) {
        int deltaX = this.x - otherX;
        int deltaY = this.y - otherY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
public class TestMyPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x for Point 1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y for Point 1: ");
        int y1 = scanner.nextInt();
        MyPoint point1 = new MyPoint(x1, y1);
        System.out.println("Point 1: " + point1.toString());
        System.out.println("Enter x for Point 2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y for Point 2: ");
        int y2 = scanner.nextInt();
        MyPoint point2 = new MyPoint(x2, y2);
        System.out.println("Point 2: " + point2.toString());
        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2.getXY()[0], point2.getXY()[1]));
        System.out.println("Enter new x for Point 1: ");
        int newX = scanner.nextInt();
        System.out.println("Enter new y for Point 1: ");
        int newY = scanner.nextInt();
        point1.setXY(newX, newY);
        System.out.println("Point 1 after setXY(" + newX + ", " + newY + "): " + point1.toString());
        int[] coordinates = point2.getXY();
        System.out.println("Coordinates of Point 2: (" + coordinates[0] + ", " + coordinates[1] + ")");
        double distance = point1.distance(point2.getXY()[0], point2.getXY()[1]);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
        scanner.close();
    }
}