/**
 * Created by staLker on 19-06-2017.
 */
public class CollectionClass implements Comparable<CollectionClass> {
    int age;
    String name;
    String url;

    public CollectionClass(int age, String name, String url) {
        this.age = age;
        this.name = name;
        this.url = url;
    }

    @Override
    public int compareTo(CollectionClass o) {
        if(this.age == o.age){
            return 0;
        }
        else if(this.age > o.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}
