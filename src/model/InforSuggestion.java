package model;

import java.io.Serializable;

public class InforSuggestion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2625392501327594719L;
	private String msuggestion;
	private String mhandle;
	private String mhowlong;
	public InforSuggestion(){
		
	}

	public InforSuggestion(String msuggestion, String mhandle, String mhowlong) {
		super();
		this.msuggestion = msuggestion;
		this.mhandle = mhandle;
		this.mhowlong = mhowlong;
	}

	public String getMsuggestion() {
		return msuggestion;
	}

	public void setMsuggestion(String msuggestion) {
		this.msuggestion = msuggestion;
	}

	public String getMhandle() {
		return mhandle;
	}

	public void setMhandle(String mhandle) {
		this.mhandle = mhandle;
	}

	public String getMhowlong() {
		return mhowlong;
	}

	public void setMhowlong(String mhowlong) {
		this.mhowlong = mhowlong;
	}
	
}
