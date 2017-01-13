package com.naveenjetty.miscellaneous;

import sun.awt.windows.ThemeReader;

/**
 * Created by naveenjetty on 1/13/17.
 */
class TS implements Runnable {
    private Thread t;
    private String threadName;

    TS(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class ThreadSample{

    public static void main(String[] args) {
        TS threadSample = new TS("Thread1");
        threadSample.start();
        TS ts = new TS("Thread2");
        ts.start();
    }
}
