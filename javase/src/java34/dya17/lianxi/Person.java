package java34.dya17.lianxi;

import java.io.File;
import java.io.Serializable;

public  class Person implements Serializable{

		String name;
		int  sum;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", sum=" + sum + "]";
		}
		public Person(String name, int sum) {
			super();
			this.name = name;
			this.sum = sum;
		}
		
	}
	
	

