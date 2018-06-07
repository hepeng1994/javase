package java34.dya21.user;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
	Object  o;//被代理类
	Object  b;//增强类

	public MyProxy(Object o, Object b) {
		super();
		this.o = o;
		this.b = b;
	}

	public Object MyProxy() {
		return Proxy.newProxyInstance( MyProxy.class.getClassLoader(),o.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Method m2 = b.getClass().getMethod("open", null);
		m2.invoke(b, args);
		Object obj = method.invoke(o, args);
		 m2 = b.getClass().getMethod("commit", null);
		m2.invoke(b, args);
		return null;
	}

}
