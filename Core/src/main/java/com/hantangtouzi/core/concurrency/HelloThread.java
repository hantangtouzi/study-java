package com.hantangtouzi.core.concurrency;

/**
 * @Author: WilliamChang.
 * @DateTime: 2018-03-17 13:54:27
 */

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new HelloThread()).start();
    }
}
