public class static_main3 {
    public static int nextID = 1;

    public static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {

        System.out.println("Generate ID: " + static_main3.generateID());
        System.out.println("Generate ID: " + static_main3.generateID());
        System.out.println("Generate ID: " + static_main3.generateID());
    }
}
