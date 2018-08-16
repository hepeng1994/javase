package java34.dya21.user;

import java.lang.reflect.Proxy;

public abstract class Test {
	public static void main(String[] args) {
		MyProxy proxy2 = new MyProxy(new User2(),new MyAdvice());
		
		UserService myProxy =(UserService) proxy2.MyProxy();
		myProxy.add();
	}

}
