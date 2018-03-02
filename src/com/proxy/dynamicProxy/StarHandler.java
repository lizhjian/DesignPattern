package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
   Star realStar;

    public StarHandler(Star star) {
        super();
        this.realStar = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(realStar,args);

        return null;
    }
}
