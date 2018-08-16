package day07.test1;

import java.util.Arrays;

public class WangLuoBean {
	double[] queryLocation;
	AddrList[] addrList;
	public WangLuoBean(double[] queryLocation, AddrList[] addrList) {
		super();
		this.queryLocation = queryLocation;
		this.addrList = addrList;
	}
	public double[] getQueryLocation() {
		return queryLocation;
	}
	public void setQueryLocation(double[] queryLocation) {
		this.queryLocation = queryLocation;
	}
	public AddrList[] getAddrList() {
		return addrList;
	}
	public void setAddrList(AddrList[] addrList) {
		this.addrList = addrList;
	}
	public WangLuoBean() {
		super();
	}
	@Override
	public String toString() {
		return "WangLuoBean [queryLocation=" + Arrays.toString(queryLocation)
				+ ", addrList=" + Arrays.toString(addrList) + "]";
	}
	
}
