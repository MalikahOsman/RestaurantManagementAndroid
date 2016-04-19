package com.example.osman.restaurantmsandroid.domain.Employee;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Osman on 2016-04-19.
 */
public class EmployeeContact implements Serializable{
    private Long id;
    private String contactTypeId;
    private String contactValue;
    private String status;
    private Date date;
    private String state;

    private EmployeeContact(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(String contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EmployeeContact(Builder builder)
    {
        this.id = builder.id;
        this.contactTypeId= builder.contactTypeId;
        this.contactValue = builder.contactValue;
        this.date = builder.date;
        this.state = builder.state;
        this.status = builder.status;

    }

    public static class Builder{
        private Long id;
        private String contactTypeId;
        private String contactValue;
        private String status;
        private Date date;
        private String state;

        public Builder id(Long value){
            this.id =value;
            return this;
        }

        public Builder date(Date value){
            this.date =value;
            return this;
        }

        public Builder contactTypeId(String value){
            this.contactTypeId =value;
            return this;
        }

        public Builder contactValue(String value){
            this.contactValue =value;
            return this;
        }

        public Builder status(String value){
            this.status =value;
            return this;
        }

        public Builder state(String value){
            this.state =value;
            return this;
        }

        public Builder copy(EmployeeContact value){
            this.id = value.id;
            this.contactTypeId= value.contactTypeId;
            this.contactValue=value.contactValue;
            this.state=value.state;
            this.date=value.date;
            this.status=value.status;
            return  this;
        }

        public EmployeeContact build(){
            return new EmployeeContact(this);
        }
    }



}
