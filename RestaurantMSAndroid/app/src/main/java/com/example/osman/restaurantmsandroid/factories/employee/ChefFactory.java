package com.example.osman.restaurantmsandroid.factories.employee;

import com.example.osman.restaurantmsandroid.domain.Employee.Chef;

/**
 * Created by Osman on 2016-04-19.
 */
public class ChefFactory {
    public static Chef getChefFactory(String name, String pword){
        return new Chef.Builder()
                .userName(name)
                .password(pword)
                .build();

    }
}
