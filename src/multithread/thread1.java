package multithread;


public class thread1 extends Thread{
   public void run(){
        for (int a=0;a<5;a++){
            System.out.println("rehaan");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        thread1 th=new thread1();
        th.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(th.getName());
        Thread.currentThread().setName("the rehaan");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(th.getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        for (int a=0;a<5;a++){
            System.out.println("sufyaan");
        }
    }
}
