import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by staLker on 19-06-2017.
 */
public class MainCollectionClass {
    public static void main(String[] args) {
        ArrayList<CollectionClass> collectionClasses = new ArrayList<>();
        collectionClasses.add(new CollectionClass(12,"yash","xyz.com"));
        collectionClasses.add(new CollectionClass(13,"manu","pqr.com"));
        collectionClasses.add(new CollectionClass(14,"boss","lmn.com"));
        collectionClasses.add(new CollectionClass(15,"hack","abc.com"));
        Collections.sort(collectionClasses);
        for (CollectionClass collectionClass:collectionClasses){
            System.out.print(collectionClass.age+"\n");
        }
    }
}
