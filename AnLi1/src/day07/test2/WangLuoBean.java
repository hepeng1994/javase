package day07.test2;

import java.util.Arrays;

public class WangLuoBean {
	private Double[] queryLocation;
	private AddrList[] addrList;
	public void set(Double[] queryLocation, AddrList[] addrList) {
		this.queryLocation = queryLocation;
		this.addrList = addrList;
	}
	@Override
	public String toString() {
		return "WangLuoBean [queryLocation=" + Arrays.toString(queryLocation)
				+ ", addrList=" + Arrays.toString(addrList) + "]";
	}
	public Double[] getQueryLocation() {
		return queryLocation;
	}
	public void setQueryLocation(Double[] queryLocation) {
		this.queryLocation = queryLocation;
	}
	public AddrList[] getAddrList() {
		return addrList;
	}
	public void setAddrList(AddrList[] addrList) {
		this.addrList = addrList;
	}
	
}
