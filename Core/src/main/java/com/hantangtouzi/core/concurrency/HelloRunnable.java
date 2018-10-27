package com.hantangtouzi.core.concurrency;

/**
 * @Author: WilliamChang.
 * @DateTime: 2018-03-17 13:50:34
 */

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
        //(new HelloRunnable()).run();
    }
}
