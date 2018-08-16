package java34.dya21.lianxi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		//被代理类
		Monkey y=new Monkey();
		// 为这个类生成代理对象
		/*
		 * 参数一 :类加载器 
		 * 参数二：被代理对象所实现的所有的接口(获取代理对象的所有的方法) 
		 * 参数初三: 自定义代理逻辑
		 */
		//p为生成的代理对象

		Kongkong p = (Kongkong)Proxy.newProxyInstance(Test.class.getClassLoader(), y.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.println("嘿嘿");
				// Method 对象 代表方法的对象
				Object object = method.invoke(y, args);
				System.out.println("呵呵");
				return null;
			}
		});
		p.add();
	}

}
