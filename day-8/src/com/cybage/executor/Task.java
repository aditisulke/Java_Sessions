package com.cybage.executor;

 

import java.util.Iterator;

public class Task extends Thread{
    @Override
    public void run() {
        System.out.println("i am performing large task " + Thread.currentThread().getName() +"  " +  Thread.currentThread().getId());
        for(int i = 0; i< 100000000; i++) {
            int sum = i+ 10;
        }        
    }
}
 