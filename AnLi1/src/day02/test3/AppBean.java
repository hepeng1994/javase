package day02.test3;

public class AppBean {
	private String date;
	private String userName;
	private String appName;
	private String from;
	private String minVersion;
	private String maxVersion;
	public void set(String date, String userName, String appName, String from,
			String minVersion, String maxVersion) {
		this.date = date;
		this.userName = userName;
		this.appName = appName;
		this.from = from;
		this.minVersion = minVersion;
		this.maxVersion = maxVersion;
	}
	@Override
	public String toString() {
		return "AppBean [date=" + date + ", userName=" + userName
				+ ", appName=" + appName + ", from=" + from + ", minVersion="
				+ minVersion + ", maxVersion=" + maxVersion + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMinVersion() {
		return minVersion;
	}
	public void setMinVersion(String minVersion) {
		this.minVersion = minVersion;
	}
	public String getMaxVersion() {
		return maxVersion;
	}
	public void setMaxVersion(String maxVersion) {
		this.maxVersion = maxVersion;
	}
	
}
