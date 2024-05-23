package com.springProject.FirstStpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Start program");
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringFirst.xml");
        Employee Emp =(Employee)context.getBean("Emp");
        System.out.println(Emp);
        System.out.println("Done your String code");
    }
}
