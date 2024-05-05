public class hw9_1test {
    public static void main(String[] args) {

        hw9_1 rectangle1 = new hw9_1(4, 40);
        hw9_1 rectangle2 = new hw9_1(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}