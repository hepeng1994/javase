package day07;

public class BikeBean {
//{"event_type":0,"page":"/pages/index/index","time":"2018-03-14 12:35:14",
	//"uid":"oDK8U0c_VZqQTMVsab9oM219vZpw","longitude":126.67032,
	//"latitude":45.767525,"province":"黑龙江省","city":"哈尔滨市","distric":"南岗区"}
	String event_type;
	String page;
	String time;
	String uid;
	String longitude;
	String latitude;
	String province;
	String city;
	String distric;
	public BikeBean(String event_type, String page, String time, String uid,
			String longitude, String latitude, String province, String city,
			String distric) {
		super();
		this.event_type = event_type;
		this.page = page;
		this.time = time;
		this.uid = uid;
		this.longitude = longitude;
		this.latitude = latitude;
		this.province = province;
		this.city = city;
		this.distric = distric;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
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
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	@Override
	public String toString() {
		return "BikeBean [event_type=" + event_type + ", page=" + page
				+ ", time=" + time + ", uid=" + uid + ", longitude="
				+ longitude + ", latitude=" + latitude + ", province="
				+ province + ", city=" + city + ", distric=" + distric + "]";
	}
	public BikeBean() {
		super();
	}
	
}
