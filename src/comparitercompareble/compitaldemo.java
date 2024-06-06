package comparitercompareble;

import java.util.Comparator;

public class compitaldemo implements Comparator<dataofemp> {


    @Override
    public int compare(dataofemp o1, dataofemp o2) {
        return o1.getId()-o2.getId();
    }

}
