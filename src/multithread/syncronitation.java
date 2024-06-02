package multithread;
class syn {
//    public  synchronized void m1(){
public   void m1(){
for (int a=0;a<2;a++){
    System.out.println(
            "excited by "+Thread.currentThread().getName()
    );
    synchronized (syn.class){
        System.out.println("i am syncronide method");
    }
    System.out.println("hello rehaan");
    try {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getPriority());
    }catch (Exception e){
        e.printStackTrace();
    }
    System.out.println("byyy  "+Thread.currentThread().getName());
}
        }}
class  syn2 extends Thread{
    syn m1;
    syn2(syn m1){
        this.m1=m1;
    }
    public void run(){
        this.m1.m1();
    }
}

public class syncronitation {
    public static void main(String[] args) {
syn m1=new syn();
syn2 t1=new syn2(m1);
syn2 t2=new syn2(m1);
 t1.start();
t2.start();
t1.setName("m1 parent and i am t1 obj");
t2.setName("m1 parent and i am t2 obj");
    }}
