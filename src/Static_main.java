public class Static_main {

    static int initialValue;

    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);

    }

    public static void main(String[] args) {
        System.out.println("Before creating an instance: initialValue = " + Static_main.initialValue);

        Static_main initializer = new Static_main();
        System.out.println("After creating an instance: initialValue = " + Static_main.initialValue);
    }
}
