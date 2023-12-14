package com.muhammet;

public class Runner_Sleep {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        final var mainThread = Thread.currentThread(); // Üzerinde çalıştığınız. Run dediğiniz thread

        new Thread(()->{
           for (int i=0;i<=100;i++){
               System.out.println("Thread çalışıyor");
               try{
                   Thread.sleep(500);
                      if(i==10){
                          mainThread.interrupt();
                     }
               }catch (Exception e){
                   System.out.println("Hata oluştu Thread...: "+ e.getMessage());
               }
           }
        }).start();

        for(long i=0L; i<1_000_000_000_000L;i++){
            System.out.println("Main Thread çalışıyor");
            try{
                Thread.sleep(1_000);

            }catch (Exception e){
                 System.out.println("Hata oluştu Main Thread....: "+ e.getMessage());
            }
        }
    }
}
