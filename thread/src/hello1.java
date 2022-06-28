public class hello1 {

    public static void main(String[] args) {

        // Antigo Thread
        new Thread (new Runnable() {
            public void run() {
                System.out.println(" Hello World!");
            }
        }).run();

        // New Thread with Lambda
        new Thread(() -> System.out.println(" Hello World Lambda!")).run();
    }

}
