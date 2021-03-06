package com.cybage.executor;

 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 

public class Test {
    public static void main(String[] args) {
        System.out.println(" no of cpu core: "+ Runtime.getRuntime().availableProcessors());
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        //it will create thread pool of 3 threads
        //now 3 threads are ready for execution
        threadPool.execute(new Task());        //1
        threadPool.execute(new Task());        //2
        threadPool.execute(new Task());        //3
        threadPool.execute(new Task());        //4
        threadPool.execute(new Task());        //5
        threadPool.execute(new Task());        //1
        threadPool.execute(new Task());        //2
        threadPool.execute(new Task());        //3
        threadPool.execute(new Task());        //4
        //now 3 threads are ready for execution
        threadPool.execute(new Task());        //1
        threadPool.execute(new Task());        //2
        threadPool.execute(new Task());        //3
        threadPool.execute(new Task());        //4
        threadPool.execute(new Task());        //5
        threadPool.execute(new Task());        //1
        threadPool.execute(new Task());        //2
        threadPool.execute(new Task());        //3
        threadPool.execute(new Task());        //4
        
        threadPool.shutdown();
    }
}
 