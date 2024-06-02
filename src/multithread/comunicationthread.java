package multithread;
class threaddemo extends Thread{
    int sum=0;
    @Override
    public void run() {
       synchronized (this){
           System.out.println("child thread start ");
        for (int a=0;a<5;a++){
            sum+=a;
        }
           System.out.println("child give notify");
//        this.notify();
           this.notifyAll();
    }}
}
public class comunicationthread {
    public static void main(String[] args) throws InterruptedException {
        threaddemo t1=new threaddemo();
        t1.start();
        synchronized (t1){
            System.out.println("main thread waiting for t1 ");
            t1.wait();
            System.out.println("main thread notification");
            System.out.println(t1.sum);
        }
    }
}
