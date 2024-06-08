package comparitercompareble;


import java.util.*;
import java.util.logging.Handler;

public class comparibaldemo {
    public static void main(String[] args) {


  ArrayList<dataofemp> list=new ArrayList<>();
  list.add(new dataofemp(22,"rehaan"));
  list.add(new dataofemp(11,"sufyaan"));
  list.add(new dataofemp(2,"roshni"));
        System.out.println(list);
//        Collections.sort(list);
        Collections.sort(list,new compitaldemo());
        System.out.println(list);
        HashMap<String,Integer>listnew=new HashMap<>();
//        ArrayList<dataofemp> list2_name1=new ArrayList<>(listnew.entrySet());
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(listnew.entrySet());
//        Collections.sort(list2_name,new coparitar_name121());
//        System.out.println(list2_name);
    }}
