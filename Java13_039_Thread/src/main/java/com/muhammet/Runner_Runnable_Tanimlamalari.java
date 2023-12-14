package com.muhammet;

public class Runner_Runnable_Tanimlamalari {
    public static void main(String[] args) {
        /**
         * Kullanım 1 Lambda ile
         */
        new Thread(()-> System.out.println("Thread Merhaba Dünya")).start();
        new Thread(()->{
            System.out.println("Thread { Merhaba Dünya");
            System.out.println("Thread { Merhaba Dünya");
        }).start();

        /**
         * Kullanım 2
         */
        Runnable runnable = ()-> System.out.println("Runnable Merhaba Dünya");
        Runnable runnable1 = ()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnable { Merhaba Dünya");
            System.out.println("Runnable { Merhaba Dünya");
        };
        runnable.run();
        runnable1.run();
        runnable.run();

        new Thread(runnable).start();
        new Thread(runnable1).start();
        new Thread(runnable).start();

    }
}
