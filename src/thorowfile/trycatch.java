package thorowfile;

public class trycatch {
    static void condition()
    {int []n=new int[2];
        try{
try {
    n[9]=9;
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println(e.toString());
    System.out.println("array problem");
} System.out.println(10/0);
        } catch (ArithmeticException f){
//            System.exit(0);
            try {
                n[7]=44;
//                throw IllegalCallerException("")
            }catch (Exception e) {
                System.out.println(e.toString());
            }
            System.out.println(f.getMessage());
        }
         catch (Exception e){
            e.printStackTrace();
        }finally {
            System.exit(0);
            System.out.println("i am finally");
        }
        System.out.println("after the try block");
    }
    public static void main(String[] args) {
        condition();
    }
}
