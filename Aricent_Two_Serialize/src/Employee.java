import java.io.Serializable;
import java.util.UUID;

/**
 * Created by staLker on 08-06-2017.
 */
public class Employee implements Serializable,Cloneable {
    int id;
    String name;
    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public Employee(){

    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
