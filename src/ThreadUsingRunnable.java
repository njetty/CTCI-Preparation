/**
 * Created by naveenjetty on 12/26/16.
 */
class ThreadDemo implements Runnable{
    String val;

    ThreadDemo(String val){
        this.val = val;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(val);
        }
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        ThreadDemo mt = new ThreadDemo("A");
        Thread t = new Thread(mt);
        t.start();
    }
}