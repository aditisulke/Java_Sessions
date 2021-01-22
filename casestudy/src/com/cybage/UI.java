package com.cybage;

 

import java.io.IOException;

 

import com.cybage.exception.EmployeeException;
import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

 

public class UI {
    public static void main(String[] args) {
        System.out.println("employee demo...");
        
        EmployeeService empService = new EmployeeServiceImpl();
        
        try {
            //add one regular employee
            empService.add("reg101", "reg address", 123, "REG");            
        }catch(EmployeeException | IOException ee) {
            System.err.println(ee.getLocalizedMessage());
        }
        
        try {
            //add one retired employee
            empService.add(null, "ret address", 789, "RET");            
        }catch(EmployeeException | IOException ee) {
            System.err.println(ee.getLocalizedMessage());
        }
        
        try {
            empService.displayAll();    
        }catch (EmployeeException | IOException ee) {
            System.err.println(ee.getLocalizedMessage());
        }
    }
}




