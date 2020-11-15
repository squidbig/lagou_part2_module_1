package bean;

public class Engine {
	private String hostName="";
	private String appBase="";
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getAppBase() {
		return appBase;
	}
	public void setAppBase(String appBase) {
		this.appBase = appBase;
		this.appBase=this.appBase.replaceAll("\\\\","/");
		if(!this.appBase.endsWith("/")) {
			this.appBase+="/";
		}
	}
	@Override
	public String toString() {
		return "Engine [hostName=" + hostName + ", appBase=" + appBase + "]";
	}
}
