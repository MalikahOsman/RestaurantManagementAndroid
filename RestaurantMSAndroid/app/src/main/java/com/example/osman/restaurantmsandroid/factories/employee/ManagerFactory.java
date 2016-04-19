package com.example.osman.restaurantmsandroid.factories.employee;

import com.example.osman.restaurantmsandroid.domain.Employee.Chef;
import com.example.osman.restaurantmsandroid.domain.Employee.RestaurantManager;

/**
 * Created by Osman on 2016-04-19.
 */
public class ManagerFactory {
    public static RestaurantManager getManagerFactory(String name, String pword) {
        return new RestaurantManager.Builder()
                .userName(name)
                .password(pword)
                .build();
    }
}
