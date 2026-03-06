public class Shape_Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4.9,6.7);

        double area = rectangle.getArea();

        System.out.printf("The area of the rectangle is: %.2f", area);
    }
}
