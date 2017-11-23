package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    @SerializedName("UserInfo")
    private List<UserInfoBean> UserInfo;

    public static UserInfo objectFromData(String str) {

        return new Gson().fromJson(str, UserInfo.class);
    }

    public static UserInfo objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), UserInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<UserInfo> arrayUserInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<UserInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<UserInfo> arrayUserInfoFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<UserInfo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<UserInfoBean> getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(List<UserInfoBean> UserInfo) {
        this.UserInfo = UserInfo;
    }

    public static class UserInfoBean {
        /**
         * name : 张冰洁
         * sex : 女
         * picture : 默认女生头像
         * department : 维护部
         * majorin : 电气专业
         * position : 电气初级维护工
         * ID : 430204199110046120
         * password : 123456
         */

        @SerializedName("name")
        private String name;
        @SerializedName("sex")
        private String sex;
        @SerializedName("picture")
        private String picture;
        @SerializedName("department")
        private String department;
        @SerializedName("majorin")
        private String majorin;
        @SerializedName("position")
        private String position;
        @SerializedName("ID")
        private String ID;
        @SerializedName("password")
        private String password;

        public static UserInfoBean objectFromData(String str) {

            return new Gson().fromJson(str, UserInfoBean.class);
        }

        public static UserInfoBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), UserInfoBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<UserInfoBean> arrayUserInfoBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<UserInfoBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<UserInfoBean> arrayUserInfoBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<UserInfoBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
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

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getMajorin() {
            return majorin;
        }

        public void setMajorin(String majorin) {
            this.majorin = majorin;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
