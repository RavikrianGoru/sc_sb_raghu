package in.nareshit;

public class DatabaseCon {
	private String driver;
	private String url;
	
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
	}
	public DatabaseCon() {
		super();
		System.out.println("From Default constructor");
	}
	public DatabaseCon(String driver, String url) {
		super();
		this.driver = driver;
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("From setter Driver");
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
		System.out.println("From setter URL");
	}
}
