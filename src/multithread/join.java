package multithread;
class tes extends Thread{
    public void run(){

        for (int a=0;a<4;a++){
            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
public class join {
    public static void main(String[] args) throws InterruptedException {
        tes t=new tes();
        t.start();
        t.join();// phala ya complete hoga
        for (int a=0;a<4;a++) {
            System.out.println("main thread");
        }

    }
}
