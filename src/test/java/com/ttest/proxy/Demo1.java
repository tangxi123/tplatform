package com.ttest.proxy;

import org.junit.Test;

public class Demo1 {
    @Test
    public void test1(){
        CustomerService service = new CustomerServiceImpl();
        CustomerService proxy = (CustomerService)JDKProxyUtils.getProxy(service);
        proxy.save();
        proxy.update();
    }
}
