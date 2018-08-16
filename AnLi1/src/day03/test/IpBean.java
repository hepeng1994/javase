package day03.test;

public class IpBean {
	private String startId;
	private String endId;
	private long startDecId;
	private long endDecId;
	private String province;
	private String city;
	private String carrieroperator ;
	public void set(String startId, String endId, long startDecId, long endDecId,
			String province, String city, String carrieroperator) {
	
		this.startId = startId;
		this.endId = endId;
		this.startDecId = startDecId;
		this.endDecId = endDecId;
		this.province = province;
		this.city = city;
		this.carrieroperator = carrieroperator;
	}
	@Override
	public String toString() {
		return "IpLuRu [startId=" + startId + ", endId=" + endId
				+ ", startDecId=" + startDecId + ", endDecId=" + endDecId
				+ ", province=" + province + ", city=" + city
				+ ", carrieroperator=" + carrieroperator + "]";
	}
	public String getStartId() {
		return startId;
	}
	public void setStartId(String startId) {
		this.startId = startId;
	}
	public String getEndId() {
		return endId;
	}
	public void setEndId(String endId) {
		this.endId = endId;
	}
	public Long getStartDecId() {
		return startDecId;
	}
	public void setStartDecId(long startDecId) {
		this.startDecId = startDecId;
	}
	public Long getEndDecId() {
		return endDecId;
	}
	public void setEndDecId(long endDecId) {
		this.endDecId = endDecId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCarrieroperator() {
		return carrieroperator;
	}
	public void setCarrieroperator(String carrieroperator) {
		this.carrieroperator = carrieroperator;
	}
	
}
