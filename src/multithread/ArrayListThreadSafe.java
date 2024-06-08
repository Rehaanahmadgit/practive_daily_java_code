package multithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // Thread that adds elements to the list
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
            }
        });

        // Thread that adds elements to the list
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    list.add(i);
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the size of the list
        System.out.println("List size: " + list.size());
    }
}
