package com.muhammet;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Runner_GorevZamanlama {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Başladı.....: "+ start);
        Runnable job1 = ()->{
            System.out.println("1. Görev Çalıştı.....: "+ (System.currentTimeMillis()-start));
        };
        Runnable job2 = ()->{
            System.out.println("2. Görev Çalıştı.....: "+ (System.currentTimeMillis()-start));
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.schedule(job1,3, TimeUnit.SECONDS);
        service.schedule(job2,8, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(job1, 10, 5, TimeUnit.SECONDS);


    }
}
