package com.kalyan;

import com.kalyan.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-Config.xml");
        Employee employee = (Employee) applicationContext.getBean("Employee");
        employee.getEmployDetails();
    }
}