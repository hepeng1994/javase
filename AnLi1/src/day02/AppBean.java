package day02;

public class AppBean {
	private String date;
	private String userName;
	private String appName;
	private String from;
	private String minVlaue;
	private String maxValue;
	@Override
	public String toString() {
		return "AppBean [date=" + date + ", userName=" + userName
				+ ", appName=" + appName + ", from=" + from + ", minVlaue="
				+ minVlaue + ", maxValue=" + maxValue + "]";
	}
	public void set(String date, String userName, String appName, String from,
			String minVlaue, String maxValue) {
		
		this.date = date;
		this.userName = userName;
		this.appName = appName;
		this.from = from;
		this.minVlaue = minVlaue;
		this.maxValue = maxValue;
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
	public String getMinVlaue() {
		return minVlaue;
	}
	public void setMinVlaue(String minVlaue) {
		this.minVlaue = minVlaue;
	}
	public String getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}
	
}
