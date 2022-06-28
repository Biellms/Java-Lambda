package thread;

public class hello1 {
    public static void main(String[] args) {

        // Lambda
        new Thread(() -> System.out.println(" Hello World Lambda!")).run();

        // Without Lambda
        new Thread (new Runnable() {
            public void run() {
                System.out.println(" Hello World!");
            }
        }).run();
    }
}
