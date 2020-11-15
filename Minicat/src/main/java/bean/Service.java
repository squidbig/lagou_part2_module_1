package bean;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private String port="";
	List<Engine> engineList=new ArrayList<Engine>();
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public List<Engine> getEngineList() {
		return engineList;
	}
	public void setEngineList(List<Engine> engineList) {
		this.engineList = engineList;
	}
	@Override
	public String toString() {
		return "Service [port=" + port + ", engineList=" + engineList + "]";
	}
	
	
}
