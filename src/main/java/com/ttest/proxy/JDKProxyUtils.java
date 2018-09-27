package com.ttest.proxy;

import org.hibernate.tool.schema.TargetType;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyUtils {
    public static Object getProxy(final Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("记录日志");
                        return method.invoke(target,args);
                    }
                });
    }
}
