package comparitercompareble;
//public class dataofemp implements Comparable<dataofemp>{
public class dataofemp {
private int id;
    private String name;
//    @Override
//    public int compareTo(dataofemp o) {
//        return this.id-o.id;
//    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public dataofemp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "dataofemp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
