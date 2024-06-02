package multithread;
class m1 extends Thread{
    Thread t1;
    m1(Thread t1){
        this.t1=t1;
    }
    public void run(){
        for (int a=0;a<5;a++){
            try {
               t1.join();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("thread m1 hu");
        }
    }
}
class m2 extends Thread{
    public void run(){
        for (int a=0;a<5;a++){
            System.out.println("thread m2 hu");
//            try {
//               Thread.sleep(1000);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
    }
}}
public class join3 {
    public static void main(String[] args) throws InterruptedException {

        m2 m2=new m2();
        m1 m1=new m1(m2);
        m1.start();
        m2.start();
//      m1.interrupt();
//        m2.interrupt();
        for (int a=0;a<5;a++) {
            System.out.println("main  hu");
        }
    }
}

