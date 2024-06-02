class parent1{
    int a;
    parent1(){
//        this(10);
        System.out.println("i am first counstracter of parent");
    }

     parent1(int i) {
        System.out.println("this value "+i+" i am second constructer of parent");

    }
    void gg(){
    }
}
class child extends parent1{
    child(){
//super(5);

//        super.a=12;
    }
    child(int b){

super(66);
        System.out.println("i am child contructer");
    }
    void gg(){

    }

}
public class this_super_use {
    public static void main(String[] args) {
        child ch=new child(77);

    }
}
