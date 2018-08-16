package dayzixi.dianying;

public class MovieBean {
	String movie;
	int rate;
	String timestamp;
	String uid;
	public void set(String movie, int rate, String timestamp, String uid) {
		this.movie = movie;
		this.rate = rate;
		this.timestamp = timestamp;
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "MovieBean [movie=" + movie + ", rate=" + rate + ", timestamp="
				+ timestamp + ", uid=" + uid + "]";
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
