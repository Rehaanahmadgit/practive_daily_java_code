
//public class dataofemp implements Comparable<dataofemp>{
public class data implements Comparable<data> {
    private int num;
    private String key;

    @Override
    public int compareTo(data o) {
        return this.num - o.num;
    }

    @Override
    public String toString() {
        return "data{" +
                "num=" + num +
                ", key='" + key + '\'' +
                '}';
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setKey(String key) {
        this.key = key;    }

    public int getNum() {
        return num;
    }

    public String getKey() {
        return key;
    }

    public data(String key,int num) {
        this.num = num;
        this.key = key;
    }
}