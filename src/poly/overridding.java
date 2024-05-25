package poly;
class jungal{
    protected void makesound(){
        System.out.println("jungal sound");
    }
}
class cat extends jungal{
    public void makesound(){
        System.out.println("meaow");
    }
}
public class overridding {
    public static void main(String[] args) {
        jungal ob=new cat();
        ob.makesound();
    }
}
