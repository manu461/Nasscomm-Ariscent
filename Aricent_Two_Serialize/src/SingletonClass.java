/**
 * Created by staLker on 14-06-2017.
 */
public class SingletonClass {
    static SingletonClass  singletonClass;
    static int constructorCount = 0;
    private SingletonClass(){
        constructorCount++;
    }
    public static SingletonClass getSingletonClass(){
        if(singletonClass==null){
            singletonClass = new SingletonClass();
            return singletonClass;
        }
        else {
            return singletonClass;
        }
    }
}
