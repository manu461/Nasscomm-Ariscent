/**
 * Created by staLker on 14-06-2017.
 */
public class SingleMain {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        System.out.println(SingletonClass.constructorCount);
        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();
        System.out.println(SingletonClass.constructorCount);

    }
}
