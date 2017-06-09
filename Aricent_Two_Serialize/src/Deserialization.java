import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by staLker on 08-06-2017.
 */
public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\staLker\\Desktop\\New Text Document (3).txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e1 = (Employee)ois.readObject();
        System.out.print(e1.id+"  "+e1.name);
    }
}
