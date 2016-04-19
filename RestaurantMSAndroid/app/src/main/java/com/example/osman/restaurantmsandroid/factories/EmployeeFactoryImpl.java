package com.example.osman.restaurantmsandroid.factories;

import com.example.osman.restaurantmsandroid.domain.Employee.Employee;

/**
 * Created by Osman on 2016-04-18.
 */
public class EmployeeFactoryImpl  {

    private static EmployeeFactoryImpl factory =null;

    private EmployeeFactoryImpl()
    {}

    public static EmployeeFactoryImpl getInstance(){
        if(factory == null)
            factory = new EmployeeFactoryImpl();
        return factory;
    }

    public Employee createEmployee(String empNum, String empName, String address, String telephone) {
        Employee employee = new Employee
                .Builder()
                .empNum(empNum)
                .empName(empName)
                .address(address)
                .telephone(telephone)
                .build();
        return employee;
    }

}
