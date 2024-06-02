package multithread;

public class methodprevent extends Thread {
    public void run() {
        Thread.yield();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        for (int a=0;a<5;a++){
            System.out.println("threaad job");
        }

    }
    public static void main(String[] args) {
methodprevent ma=new methodprevent();
ma.start();
        for (int a=0;a<5;a++){
            System.out.println(" main job");
        }
    }
}
