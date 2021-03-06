package com.cybage.threading;

 

public class Demo {
    //main thread will be started....
    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome to XYZ project...(manager)");
        System.out.println("information about thread...");
        System.out.println("name: "+ Thread.currentThread().getName());
        System.out.println("id: "+ Thread.currentThread().getId());
        
        Developer d1 = new Developer();        
        
        Tester t1 = new Tester();        
        
        Deployment dp = new Deployment();
        
        d1.setName("developer");
        t1.setName("tester");
        dp.setName("deployment");
        
        d1.setPriority(1);
        t1.setPriority(2);
        dp.setPriority(3);
        
        d1.setDaemon(true);        //d1 will be background thread(daemon)
        
        dp.start();
        d1.start();            //it will give a call to run method
        t1.start();
        System.out.println(d1.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(dp.getPriority());
        
        
        //we need to wait till the execution of all the threads...
        d1.join();
        t1.join();
        dp.join();
        
        System.out.println("4. we have finish project...");    
    }
}