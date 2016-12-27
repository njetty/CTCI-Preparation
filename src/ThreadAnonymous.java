/**
 * Created by naveenjetty on 12/26/16.
 */
public class ThreadAnonymous {
    public static void main(String[] args) {
        String val = "A";
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++){
                    System.out.println(val);
                }
            }
        });
        t.start();

    }
}
