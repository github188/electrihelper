//package model;
//
//import java.util.List;
//
//
//public class Cache {
//	private String key;
//	
//	private String StartTime, KeepTime, CycleTime,WorkerName;
//	private List<String> WorkNames = null;
//	private long timeOut;//更新时间
//    private boolean expired; //是否终止
//    
//   @Override
//	public int hashCode() {
//		// TODO 自动生成的方法存根
//	    if(WorkNames != null){
//	    	
//	    }
//		return super.hashCode();
//	}
//   
////	private  String ID,password,name,picture,position,sex,department,majorin;
//	//private Object value;
//     
//    
//    public Cache() {
//        super();
//        setTimeOut(System.currentTimeMillis() + 1000 * 60 * 60 * 24);
//        setExpired(false);
//    }
//    
//
//	public Cache(String[] workName, String[] startTime, String[] keepTime,
//			String[] cycleTime, String[] workerName, Object value, long timeOut,
//			boolean expired) {
//		super();
//		WorkName = workName;
//		StartTime = startTime;
//		KeepTime = keepTime;
//		CycleTime = cycleTime;
//		WorkerName = workerName;
//		this.value = value;
//		this.timeOut = timeOut;
//		this.expired = expired;
//	}
//
//
//
//	public Object getValue() {
//		return value;
//	}
//
//
//	public void setValue(Object value) {
//		this.value = value;
//	}
//
//
//	public String[] getWorkName() {
//		return WorkName;
//	}
//
//	public void setWorkName(String[] workName) {
//		WorkName = workName;
//	}
//
//	public String[] getStartTime() {
//		return StartTime;
//	}
//
//	public void setStartTime(String[] startTime) {
//		StartTime = startTime;
//	}
//
//	public String[] getKeepTime() {
//		return KeepTime;
//	}
//
//	public void setKeepTime(String[] keepTime) {
//		KeepTime = keepTime;
//	}
//
//	public String[] getCycleTime() {
//		return CycleTime;
//	}
//
//	public void setCycleTime(String[] cycleTime) {
//		CycleTime = cycleTime;
//	}
//
//	public String[] getWorkerName() {
//		return WorkerName;
//	}
//
//	public void setWorkerName(String[] workerName) {
//		WorkerName = workerName;
//	}
//
//	public long getTimeOut() {
//		return timeOut;
//	}
//
//	public void setTimeOut(long timeOut) {
//		this.timeOut = timeOut;
//	}
//
//	public boolean isExpired() {
//		return expired;
//	}
//
//	public void setExpired(boolean expired) {
//		this.expired = expired;
//	}
//
//
//}
