package com.example.osman.restaurantmsandroid.factories.employee;

import com.example.osman.restaurantmsandroid.domain.Employee.POS_Cashier;
import com.example.osman.restaurantmsandroid.domain.Employee.Waiter;

/**
 * Created by Osman on 2016-04-19.
 */
public class PosFactory {
    public static POS_Cashier getPOS_Cashier(String user, String pword)
    {
        return new POS_Cashier.Builder()
                .userName(user)
                .password(pword)
                .build();
    }
}
