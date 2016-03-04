package com.imwoniu.hessian;

import com.caucho.hessian.server.HessianServlet;

/**
 * Created by Work on 2016/3/4.
 */
public class BasicService extends HessianServlet implements Basic {

    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }

    @Override
    public String say(String msg) {
        return "Say:" + msg;
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
