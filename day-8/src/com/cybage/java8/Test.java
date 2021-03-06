package com.cybage.java8;

 

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

 

public class Test {
    public static void main(String[] args) {
        
        Function<Integer, Integer> cal = (t) -> t++;            
        System.out.println(cal.apply(10));
        
        BiFunction<Integer, Integer, Integer> biFun =  (t, u) -> t+u;            
        System.out.println(biFun.apply(10, 20));
        
        //want to check age is greater than 18
        Predicate<Integer> checkingAge = (age) ->  age > 18;            
        System.out.println(checkingAge.test(35));        
        
        //consumer
        Consumer<String> printer = (t) -> System.out.println("we are just printing value... "+ t);
        printer.accept("dm jadhav");
        
        //get random number
        Supplier<Double> numGenerator = () -> Math.random(); 
        System.out.println(numGenerator.get());
        
        DoubleSupplier  numGenerator1 = () -> Math.random(); 
        System.out.println(numGenerator1.getAsDouble());
    }
}