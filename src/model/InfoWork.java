package model;

import java.io.Serializable;

public class InfoWork implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5337143683221087038L;
	private String[] mworkname;
	private String[] mstarttime;
	private String[] mkeeptime;
	
	public InfoWork(String[] mworkname, String[] mstarttime, String[] mkeeptime,
			String[] mcycletime, String[] mworkername) {
		super();
		this.mworkname = mworkname;
		this.mstarttime = mstarttime;
		this.mkeeptime = mkeeptime;
		this.mcycletime = mcycletime;
		this.mworkername = mworkername;
	}

	private String[] mcycletime;
	private String[] mworkername;



	public String[] getWorkname() {
		return mworkname;
	}

	public void setWorkname(String[] workname) {
		this.mworkname = workname;
	}

	public String[] getStarttime() {
		return mstarttime;
	}

	public void setStarttime(String[] starttime) {
		this.mstarttime = starttime;
	}

	public String[] getKeeptime() {
		return mkeeptime;
	}

	public void setKeeptime(String[] keeptime) {
		this.mkeeptime = keeptime;
	}

	public String[] getCycletime() {
		return mcycletime;
	}

	public void setCycletime(String[] cycletime) {
		this.mcycletime = cycletime;
	}

	public String[] getWorkername() {
		return mworkername;
	}

	public void setWorkername(String[] workername) {
		this.mworkername = workername;
	}
}
