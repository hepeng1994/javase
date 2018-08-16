package java34.dya10.yunsuan;

public class Pro implements OneToN {

	@Override
	public int dispose(int n) {
		int c=1;
		for(int i=1;i<=n;i++){
			c *=i;
		}
		return c;
	}

}
