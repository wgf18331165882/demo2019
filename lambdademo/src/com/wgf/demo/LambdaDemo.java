package com.wgf.demo;

public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("开启了新的线程"+Thread.currentThread().getName());
        }
        ).start();
    }
}
