/**
 * Created by staLker on 14-06-2017.
 */
public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Java");
        for(int i=0;i<1000000;i++){
            stringBuffer.append("TPoint");
        }
        System.out.println("Time taken by string Buffer : "+(System.currentTimeMillis()-startTime)+"\n");
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Java");
        for(int i=0;i<1000000;i++){
            stringBuilder.append("TPoint");
        }
        System.out.println("Time taken by string Builder : "+(System.currentTimeMillis()-startTime)+"\n");
    }
}
