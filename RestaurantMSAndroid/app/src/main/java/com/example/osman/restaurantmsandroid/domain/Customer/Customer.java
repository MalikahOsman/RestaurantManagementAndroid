package com.example.osman.restaurantmsandroid.domain.Customer;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class Customer implements Serializable {
    private Long id;
    private String custName;
    private String custNum;

    public Customer() {
    }

    public Customer(String custName, String custNum) {
        this.custName = custName;
        this.custNum = custNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                ", custNum='" + custNum + '\'' +
                '}';
    }

}
