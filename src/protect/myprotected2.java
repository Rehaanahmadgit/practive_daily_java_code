package protect;

public class myprotected2 extends myprotect {
   void name(){
       display();
       System.out.println(val);

}
    public static void main(String[] args) {

        myprotected2 myprotected2=new myprotected2();
        myprotected2.name();
    }
}
