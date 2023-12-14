package com.muhammet;

public class Runner_Kavramlar {
    /**
     * CPU -> İşlemci
     * 1x Çekirdek -> 5.5GHZ
     * 10X Çekirdek -> 2.7GHZ
     * 1 çekirdek -> 20X biter
     * 10 Çekirdek -> 3-4X bitmez
     *
     */
    public static void main(String[] args) {
        System.out.println("Uygulama Başladı");
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        myThread.start();
        thread.start();
        System.out.println("UYULAMA BİTTİ.");
    }
}

/**
 * Thread sınıfını miras almak
 * DİKKAT!!!!!
 * Java miras alma extents tek seferlik bir işlemdir. Bu nedenle bir sınıf için Thread sınıfını miras alarak
 * bu hakkı kullanmak anlamsız dır.
 */
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread çalıştı");
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThread bitti.");
    }
}

class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable çalıştı");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyRunnable bitti.");
    }
}