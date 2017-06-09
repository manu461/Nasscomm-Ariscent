/**
 * Created by staLker on 08-06-2017.
 */
public class CloneDemoClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(23142,"DeltaOne");
        Employee e2 = new Employee();
        e2 = (Employee)e1.clone();
        System.out.print(e2.id+" "+e2.name);
    }
}
