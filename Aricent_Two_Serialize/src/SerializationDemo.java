import java.io.*;

/**
 * Created by staLker on 08-06-2017.
 */
public class SerializationDemo{


    public static void main(String[] args) throws IOException {
        Employee em1 = new Employee(1234,"Manu");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\staLker\\Desktop\\New Text Document (3).txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(em1);
        oos.flush();
        System.out.print("Serialized OK\n");

    }
}
