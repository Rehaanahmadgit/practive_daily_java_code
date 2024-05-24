class parent{
    String name;
    void detail(){
        System.out.println(name.toUpperCase());
    }
}
public class super_key extends parent {
    String name;
    public void detail(){
        super.name="parent";
        name="child";
        System.out.println(super.name+"and"+name);
        super.detail();
    }
    public static void main(String[] args) {
        super_key ob1=new super_key();
        ob1.detail();
    }
}
