package thorowfile;

class testing {
    void m1(){
        System.out.println("this is m1 ");
        try {
            m2();
        }catch (Exception e){
            System.out.println("fullay error");
        }

    }


    void m2(){
        System.out.println("this is m2 ");
        m3();
    }

    void m3() {
        System.out.println("this is m3 ");
        System.out.println(10/0);
    }
}

public class throw1 {

//    static void  readfile() throws FileNotFoundException {
//        FileInputStream file=new FileInputStream("rehaan");
//
//    }
//   static void savefile() throws FileNotFoundException{
//        FileOutputStream fileout=new FileOutputStream("rehaan");
//    }
    public static void main(String[] args)   {
//     try {
//         readfile();
//     }catch (FileNotFoundException e){
//         System.out.println(e.getMessage());
//         System.out.println("check the data" );
//     }
//     savefile();

testing ob1=new testing();
//try {
//    ob1.m1();
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}
        ob1.m1();

    }
}
