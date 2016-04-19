package com.example.osman.restaurantmsandroid.factories.employee;

import com.example.osman.restaurantmsandroid.domain.Employee.Waiter;

/**
 * Created by Osman on 2016-04-19.
 */
public class WaiterFactory {
    public static Waiter getWaiter(String user, String pword)
    {
        return new Waiter.Builder()
                .userName(user)
                .password(pword)
                .build();
    }
}
