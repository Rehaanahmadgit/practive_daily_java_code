class teacher{
    void display(){
        System.out.println("i am teacher");
    }
}
class student extends teacher {
    void display() {
        System.out.println("i am student");
    }
}public class casting {


    public static void main(String[] args) {
        teacher t=(teacher) new teacher();
       t.display();
          t=new student();
             t.display();
student c=(student) t;
c.display();
t=new teacher();
t.display();
        }
        }
