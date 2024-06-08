package multithread;

import java.util.Vector;

public class VectorThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        final Vector<Integer> vector = new Vector<>();

        // Thread that adds elements to the vector
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    vector.add(i);
                }
            }
        });

        // Thread that adds elements to the vector
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i < 19; i++) {
                    vector.add(i);
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the size of the vector
        System.out.println("Vector size: " + vector.size());
    }
}
