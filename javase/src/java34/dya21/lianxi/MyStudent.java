package java34.dya21.lianxi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class MyStudent {
	public static void main(String[] args) {
		Student s = new Student();
		Perpson n = (Perpson)Proxy.newProxyInstance(MyStudent.class.getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				method.invoke(s, args);
				return null;
			}
		});
		n.easy();
	}

}