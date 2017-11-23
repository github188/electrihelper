package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SearchListinfo {


    /**
     * result : true
     * resultinfo : [{"name":"first1","info":"this is first shebei!"},{"name":"first2","info":"this is first1 shebei!"},{"name":"first2","info":"this is first1 shebei!"}]
     */

    @SerializedName("result")
    private boolean result;
    @SerializedName("resultinfo")
    private List<ResultinfoBean> resultinfo;

    public static SearchListinfo objectFromData(String str) {

        return new Gson().fromJson(str, SearchListinfo.class);
    }

    public static SearchListinfo objectFromData(String str, String key) {

        try {
            org.json.JSONObject jsonObject = new org.json.JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), SearchListinfo.class);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<SearchListinfo> arraySearchListinfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<SearchListinfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<SearchListinfo> arraySearchListinfoFromData(String str, String key) {

        try {
            org.json.JSONObject jsonObject = new org.json.JSONObject(str);
            Type listType = new TypeToken<ArrayList<SearchListinfo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public List<ResultinfoBean> getResultinfo() {
        return resultinfo;
    }

    public void setResultinfo(List<ResultinfoBean> resultinfo) {
        this.resultinfo = resultinfo;
    }

    public static class ResultinfoBean {
        /**
         * name : first1
         * info : this is first shebei!
         */

        @SerializedName("name")
        private String name;
        @SerializedName("info")
        private String info;

        public static ResultinfoBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultinfoBean.class);
        }

        public static ResultinfoBean objectFromData(String str, String key) {

            try {
                org.json.JSONObject jsonObject = new org.json.JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResultinfoBean.class);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultinfoBean> arrayResultinfoBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultinfoBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultinfoBean> arrayResultinfoBeanFromData(String str, String key) {

            try {
                org.json.JSONObject jsonObject = new org.json.JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultinfoBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
