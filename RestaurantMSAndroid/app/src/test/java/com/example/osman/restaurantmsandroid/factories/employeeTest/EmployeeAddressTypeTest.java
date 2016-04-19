package com.example.osman.restaurantmsandroid.factories.employeeTest;

import com.example.osman.restaurantmsandroid.domain.settings.AddressType;
import com.example.osman.restaurantmsandroid.factories.employee.AddressTypeFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Osman on 2016-04-18.
 */
public class EmployeeAddressTypeTest {
    @Test
    public void testCreate() throws Exception {
        AddressType AddressType = AddressTypeFactory.getAddressType("HOME");
        Assert.assertEquals("HOME", AddressType.getName());
    }

    @Test
    public void testUpdate() throws Exception {
        AddressType addressType = AddressTypeFactory.getAddressType("HOME");
        AddressType newAddressType = new AddressType
                .Builder()
                .copy(addressType)
                .name("WORK")
                .build();
        Assert.assertEquals("WORK", newAddressType.getName());
       // Assert.assertEquals(newAddressType.getState());
    }
}
