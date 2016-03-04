package com.imwoniu.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * Created by Work on 2016/3/4.
 */
public class Client {

    interface Hello {
        String hello(Object name);
    }

    interface SumSay {
        String say(String msg);
        int sum(int a, int b);
        int hi(String hi);
    }

    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8890/hello";

        HessianProxyFactory factory = new HessianProxyFactory();
        Hello basic = (Hello) factory.create(Hello.class, url);
        System.out.println(basic.hello(123));

        SumSay sumSay = (SumSay) factory.create(SumSay.class, url);
        System.out.println(sumSay.say("你好"));

        System.out.println("计算结果：" + sumSay.sum(10, 20));

    }
}
