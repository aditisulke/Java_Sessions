package com.cybage.threading;

 

public class Deployment extends Thread{
    @Override
    public void run() {
        try {
            sleep(3 *1000);    
        }catch(InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("3. i am deploying and maintain project..." + getName());
    }
}
 