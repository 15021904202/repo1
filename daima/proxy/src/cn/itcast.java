package cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class itcast {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
      List<String> proxyList = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(list, args);
            }
        });
        proxyList.add("你好");
        System.out.println(list);
    }
}
