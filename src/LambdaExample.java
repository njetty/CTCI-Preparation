import java.util.function.Function;

import static com.sun.tools.doclint.Entity.lambda;
import static java.lang.StrictMath.abs;
import static java.lang.Thread.sleep;

/**
 * Created by naveenjetty on 12/27/16.
 */
public class LambdaExample {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("Line 1");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Line 2");
        };

        r1.run();
        System.out.println("Outside");

        int k = 6;
        int n = 5;
        int[] a = {1,2,3,4,5};
        for (int i =0; i<n;i++){
            int t = (i+k)%n;
            System.out.println(a[t]);
        }

    }
}
