package model;

import android.graphics.Bitmap;

public class SearchResult {
	
	Bitmap itemImage;
	String itemInfo;
    int itemRes;
   
	public SearchResult(int itemRes, String itemInfo) {
		super();
		this.itemRes = itemRes;
		this.itemInfo = itemInfo;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

	public Bitmap getItemImage() {
		return itemImage;
	}

	public void setItemImage(Bitmap itemImage) {
		this.itemImage = itemImage;
	}
	
	public int getItemRes() {
		return itemRes;
	}

	public void setItemRes(int itemRes) {
		this.itemRes = itemRes;
	}
}
