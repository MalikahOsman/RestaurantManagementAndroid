package com.example.osman.restaurantmsandroid.domain;

import java.io.Serializable;

/**
 * Created by Osman on 2016-04-18.
 */
public class Order implements Serializable{
    private Long id;
    private int orderNum;
    private String orderDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }


    public Order() {
    }

    public Order(Builder builder) {
        this.orderNum = builder.orderNum;
        this.orderDate = builder.orderDate;
    }

    public static class Builder {
        private int orderNum;
        private String orderDate;

        public Builder orderNum(int value) {
            this.orderNum = value;
            return this;
        }

        public Builder orderDate(String value)
        {
            this.orderDate = value;
            return this;

        }

        public Builder copy(Order value) {
            this.orderNum = value.orderNum;
            this.orderDate = value.orderDate;

            return this;
        }

        public Order build()
        {
            return new Order(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            if (orderNum != builder.orderNum) return false;
            return orderDate.equals(builder.orderDate);

        }

        @Override
        public int hashCode() {
            int result = orderNum;
            result = 31 * result + orderDate.hashCode();
            return result;
        }
    }

    /**
     * Created by Osman on 2016-04-18.
     */
    public static class MainCourse extends Menu implements Serializable {
        private Long id;
        String mainID;
        String foodItem;

        public MainCourse() {
        }

        public MainCourse(String mainID, String foodItem) {
            this.mainID = mainID;
            this.foodItem = foodItem;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getMainID() {
            return mainID;
        }

        public void setMainID(String mainID) {
            this.mainID = mainID;
        }

        public String getFoodItem() {
            return foodItem;
        }

        public void setFoodItem(String foodItem) {
            this.foodItem = foodItem;
        }

        @Override
        public String toString() {
            return "MainCourse{" +
                    "foodItem='" + foodItem + '\'' +
                    ", mainID='" + mainID + '\'' +
                    '}';
        }
    }
}
