package day06;

import java.util.Date;

public class SessionBean {
	private String sessionId;
	private String sessionIp;
	private Date sessionDate;
	private String sessionUrl;
	private int sessionCixu;
	public void set(String sessionIp, Date date, String sessionUrl) {
		
		this.sessionIp = sessionIp;
		this.sessionDate = date;
		this.sessionUrl = sessionUrl;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionIp() {
		return sessionIp;
	}
	public void setSessionIp(String sessionIp) {
		this.sessionIp = sessionIp;
	}
	public Date getDate() {
		return sessionDate;
	}
	public void setDate(Date date) {
		this.sessionDate = date;
	}
	public String getSessionUrl() {
		return sessionUrl;
	}
	public void setSessionUrl(String sessionUrl) {
		this.sessionUrl = sessionUrl;
	}
	public int getSessionCixu() {
		return sessionCixu;
	}
	public void setSessionCixu(int sessionCixu) {
		this.sessionCixu = sessionCixu;
	}
	@Override
	public String toString() {
		return "SessionBean [sessionId=" + sessionId + ", sessionIp="
				+ sessionIp + ", date=" + sessionDate + ", sessionUrl=" + sessionUrl
				+ ", sessionCixu=" + sessionCixu + "]";
	}
	
}
