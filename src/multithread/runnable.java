package multithread;

public class runnable implements Runnable{
    public static void main(String[] args) {
        runnable runnable=new runnable();
        Thread thread=new Thread(runnable);
        thread.start();
        runnable runnable1=new runnable();
        Thread thread1=new Thread(runnable);
        thread1.start();
    }

    @Override
    public void run() {
        synchronized (this){
        for (int a=0;a<12;a++){
            System.out.println(a);
        }}
    }
}
