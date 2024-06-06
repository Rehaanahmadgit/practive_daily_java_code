package comparitercompareble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
        ArrayList<dataofemp> list2_name=new ArrayList<>(list);
        Collections.sort(list2_name,new coparitar_name121());
        System.out.println(list2_name);
    }}
