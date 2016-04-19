package com.example.osman.restaurantmsandroid.domain.Employee;

import com.example.osman.restaurantmsandroid.domain.Employee.Employee;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class POS_Cashier extends Employee implements Serializable {
    private Long id;
    private String userName;
    private String password;

    public POS_Cashier() {
    }

    public POS_Cashier(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getJobDescription() {
        return "Cashier is responsible for recording all transactions and ensuring accurate stock take";
    }

    @Override
    public void setNextStep(Employee nextStep) {
        super.setNextStep(nextStep);
    }

    public POS_Cashier(Builder builder)
    {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
    }

    public static class Builder{
        private Long id;
        private String userName;
        private String password;

        public Builder id(Long value)
        {
            this.id = value;
            return this;

        }

        public Builder userName(String value)
        {
            this.userName = value;
            return this;

        }

        public Builder password(String value)
        {
            this.password = value;
            return this;

        }

        public Builder copy(POS_Cashier value)
        {
            this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            return this;
        }

        public POS_Cashier build() {return new POS_Cashier(this);}


    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        POS_Cashier that = (POS_Cashier) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() { return id.hashCode();}
}
