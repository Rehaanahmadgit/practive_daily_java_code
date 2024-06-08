package multithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class array_thread_mentain {
    public static void main(String[] args) {
        List<String>name= Collections.synchronizedList(new ArrayList<String>());
        name.add("rehaan");
        name.add("sufyaan");
        name.add("monu");
        System.out.println(name);
       synchronized (name){
           Iterator<String>newname=name.iterator();
           while (newname.hasNext()){
               System.out.println(newname.next());
           }
       }


    }
}
