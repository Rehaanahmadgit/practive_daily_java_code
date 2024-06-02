package thorowfile;

public class throw2 extends RuntimeException{
    throw2 (String name){
        super(name);
    }
    public static void main(String[] args) {
        int age=3;
     if (4<age){
         throw new throw2("this is grater");
     }else
     {
         System.out.println("not grateer value");
     }
    }
}
