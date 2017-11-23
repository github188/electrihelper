package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DrawingInfo {
    /**
     * filename : 220kV一次系统图
     * fileclass : cad
     * unit : 公用
     * system : 一次
     * origin : 设计院
     * location : 升压站
     * freshtime : 2016.08.10
     * equipment : null
     * productmode : null
     * voltageclass : 220kV
     * number : null
     */

    @SerializedName("filename")
    private String filename;
    @SerializedName("fileclass")
    private String fileclass;
    @SerializedName("unit")
    private String unit;
    @SerializedName("system")
    private String system;
    @SerializedName("origin")
    private String origin;
    @SerializedName("location")
    private String location;
    @SerializedName("freshtime")
    private String freshtime;
    @SerializedName("equipment")
    private String equipment;
    @SerializedName("productmode")
    private String productmode;
    @SerializedName("voltageclass")
    private String voltageclass;
    @SerializedName("number")
    private String number;

    public static DrawingInfo objectFromData(String str) {

        return new Gson().fromJson(str, DrawingInfo.class);
    }

    public static DrawingInfo objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), DrawingInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<DrawingInfo> arrayDrawingInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<DrawingInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<DrawingInfo> arrayDrawingInfoFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<DrawingInfo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileclass() {
        return fileclass;
    }

    public void setFileclass(String fileclass) {
        this.fileclass = fileclass;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFreshtime() {
        return freshtime;
    }

    public void setFreshtime(String freshtime) {
        this.freshtime = freshtime;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getProductmode() {
        return productmode;
    }

    public void setProductmode(String productmode) {
        this.productmode = productmode;
    }

    public String getVoltageclass() {
        return voltageclass;
    }

    public void setVoltageclass(String voltageclass) {
        this.voltageclass = voltageclass;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
