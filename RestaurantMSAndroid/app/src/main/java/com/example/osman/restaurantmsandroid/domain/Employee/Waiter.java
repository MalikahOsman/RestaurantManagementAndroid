package com.example.osman.restaurantmsandroid.domain.Employee;

import com.example.osman.restaurantmsandroid.domain.Employee.Employee;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class Waiter extends Employee implements Serializable {
    private Long id;
    private String userName;
    private String password;

    public Waiter() {
    }

    public Waiter(Long id, String userName, String password) {
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
        return "Serve designated tables, ensure customers are well taken care of";
    }



    @Override
    public void setNextStep(Employee nextStep) {
        super.setNextStep(nextStep);
    }

    public Waiter(Builder builder)
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

        public Builder copy(Waiter value)
        {
            this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            return this;
        }

        public Waiter build() {return new Waiter(this);}


    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Waiter that = (Waiter) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() { return id.hashCode();}

}
