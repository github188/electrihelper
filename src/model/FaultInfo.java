package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FaultInfo {


    public static String ZHILIUXITONG="直流系统故障";
    public static String LICIXITONG="励磁系统故障";
    public static String FENGLENGKONGZHIXIANG="风冷控制箱故障";
    public static String FABIANZU ="发变组故障";
    public static String DENGLIZI="等离子故障";
    public static String DIANCHUCHEN="电除尘故障";
    public static String QITA="其他故障";

    public static String test_zhiliuxitong="{\"content\":[{\"appearance\":\"交流过欠压故障\",\"handle\":\"1)确认交流输入是否正常;\n2)检查交流输入是否正常及空气开关或交流接触器是否在正常运行位置;\n3)检查交流采样板上采样变压器和压敏电阻是否损坏;\n4)其他原因.\",\"faultreason\":null},{\"appearance\":\"空气开关脱口故障\",\"handle\":\"1)首先检查直流馈出空气开关是否有在合闸的位置而信号灯不亮,若有确认此开关是否脱扣;\n2)其他原因.\",\"faultreason\":null},{\"appearance\":\"熔断器熔断故障\",\"handle\":\"1)检查蓄电池组正负极熔断器是否熔断;\n2)检查熔断信号继电器是否有问题;\n3)其他原因\",\"faultreason\":null},{\"appearance\":\"母线欠电压\",\"handle\":\"1)用万用表测量母线电压是否正常;\n2)检查充电参数及告警参数设置是否正确;\n3)检查降压装置(若有)控制开关是否在自动位置;\n4)其他原因.\",\"faultreason\":null},{\"appearance\":\"母线接地\",\"handle\":\"1)先看微机控制器负对地电压和控母对地电压是否平衡,如果是负对地电压接近于零,肯定负母线接地.同样相反;\n2)采用高阻抗的万用表实际测量母线对地电压判断有无接地;\n3)如果系统配置独立的绝缘检测装置可以从该装置上查看.\",\"faultreason\":null},{\"appearance\":\"模块故障\",\"handle\":\"1)确认电源模块是否有黄灯亮;\n2)查看电源模块黄灯亮表示交流输入过欠压或直流输出过欠压或电源模块过热,因此首先检查交流输入及直流输出电压是否在允许范围内和模块是否过热;\n3)查看电源模块当输出过压时,将关断电源输出,只能关机后再开机恢复,因此当确认外部都正常时,关告警电源模块后再开电源模块,看电源模块黄灯是否还亮,若还亮,则表示模块有故障.\",\"faultreason\":null},{\"appearance\":\"绝缘监测装置故障\",\"handle\":\"检查该装置工作电源是否正常.\",\"faultreason\":null},{\"appearance\":\"绝缘监测报母线过欠压\",\"handle\":\"1)首先监测母线电源是否在正常范围;\n2)查看装置显示的电压值是否同实际不一样;\n3)装置内部可能有器件出现故障,需要厂家处理.\",\"faultreason\":null},{\"appearance\":\"绝缘检测装置报接地\",\"handle\":\"首先看故障记录,确认哪条支路发生正接地还是负接地,接地电阻值是多少,然后将故障支路接地排除.\",\"faultreason\":null},{\"appearance\":\"电池巡检仪报单只电池电压过欠压\",\"handle\":\"首先查看故障记录,确认哪几只电池电压不正常.然后查看该只电池的保险和连线是否有无松动或接触不良.\",\"faultreason\":null},{\"appearance\":\"蓄电池充电电流不限流\",\"handle\":\"1)首先确认系统是否在均充状态;\n2)其次充电机输出电压是否已达到均充电压,若输出电压已达到均充电压,则系统处在恒压充电状态,不会限流;\n3)检查模块同监控之间并接线是否可靠连接;\n4)其他原因.\",\"faultreason\":null}]}";
    public static String test_licixitong="{\"content\":[{\"appearance\":\"正常调节有功功率引起机组解列的事故处理\",\"handle\":\"业界中低励限制调节方法有两种:\n一是采用在低励限制时增加电压参考值的方法限制无功功率下降,这种方法调节过程较平稳,但调节速度较慢,另一种在低励限制动作时直接切换为无功功率闭环调节.根据无功功率下降的幅度及速度进行调节,这种方法调节速度快,有助于发电机无功功率快速恢复至正常运行范围.\",\"faultreason\":null},{\"appearance\":\"无功调差参数设置不一致切换导致发电机误强励事故\",\"handle\":\"......\",\"faultreason\":null}]}" ;
    public static String test_fenglengkongzhixiang="{\"content\":[{\"appearence\":\"value\",\"handle\":\"value\",\"faulreason\":\"value\"},{\"appearence\":\"value\",\"handle\":\"value\",\"faultreason\":\"value\"}]}";
    public static String test_fabianzu="{\"content\":[{\"appearance\":\"机组低负荷下报主变通风D\",\"handle\":\"显示主变通风D报警，无主变通风C，确认发变组D柜操作面板死机，重启装置。\",\"faultreason\":\"由于装置死机，主变通风D的告警信号一直误发，所以在机组低负荷情况下还会有告警信号。\"}]}";
    public static String test_denglizi="{\"content\":[{\"appearance\":\"等离子点火器拉弧失败\",\"handle\":\"按下急停按钮验明调速器输出无电，用万用表测量输出阴阳极板阻止，未能达到3000欧姆需要调整有阴阳极板间隙或者打磨清扫\",\"faultreason\":\"需要调整有阴阳极板间隙或者打磨清扫\"}]}";
    public static String test_dianchuchen="{\"content\":[{\"appearance\":\"等离子点火器拉弧失败\",\"handle\":\"按下急停按钮验明调速器输出无电，用万用表测量输出阴阳极板阻止，未能达到3000欧姆需要调整有阴阳极板间隙或者打磨清扫\",\"faultreason\":\"需要调整有阴阳极板间隙或者打磨清扫\"}]}";
    public static String test_qita="{\"content\":[{\"appearance\":\"6kV厂用电南自综合保护装置，无电电压电流、DCS画面远方不能启动\",\"handle\":\"在确定PT和CT回路、多功能电表和综保装置全部正常的情况下，在电气工程师站，ECMS系统检查AB网通讯管理机状态，为通讯失败，延时等，重启通讯管理机，操作方法及密码在工程师电脑内\",\"faultreason\":\"装置在停电或者突然来电时，通讯管理机未能及时反映\"},{\"appearance\":\"开关开关输入输出故障\",\"handle\":\"DCS湖面报警开关输入输出故障，开关不能远方合闸\",\"faultreason\":\"检查开关关于位置接点，通讯的二次回路是否正常\"},{\"appearance\":\"抄表系统生成报表失败\",\"handle\":\"将抄表系统上的软件重启并登录，登录名和密码全部是a，检查机组线路电量数据送入，完成\",\"faultreason\":\"抄表系统电量不变，多发生于在刚起机的时间\"},{\"appearance\":\"380V开关不能远方启动或者DCS画面上无远方允许\",\"handle\":\"试验位置可以合闸，工作位置不能合闸，确认通讯线路无问题后，检查开关位置接点是否牢靠\",\"faultreason\":\"结合图纸发现开关工作位置不牢靠，则合闸不允许\"},{\"appearance\":\"6kV开关黄色熔断器熔断指示灯亮，开关动作断开\",\"handle\":\"将开关拖至检修位，合上地刀，用万用表通断挡测量，找出断开的熔断器，确认熔断器熔断弹簧已经弹出，核对定值，更换即可\",\"faultreason\":\"短路电流或者定值错误导致\"}]}" ;
    @SerializedName("content")
    private List<ContentBean>  content;

    public static FaultInfo objectFromData(String str) {

        return new Gson().fromJson(str, FaultInfo.class);
    }

    public static FaultInfo objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), FaultInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<FaultInfo> arrayFaultInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<FaultInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<FaultInfo> arrayFaultInfoFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<FaultInfo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * appearance : 交流过欠压故障
         * handle : 1)确认交流输入是否正常;
         2)检查交流输入是否正常及空气开关或交流接触器是否在正常运行位置;
         3)检查交流采样板上采样变压器和压敏电阻是否损坏;
         4)其他原因.
         * faultreason : null
         */

        @SerializedName("appearance")
        private String appearance;
        @SerializedName("handle")
        private String handle;
        @SerializedName("faultreason")
        private String faultreason;

        public static ContentBean objectFromData(String str) {

            return new Gson().fromJson(str, ContentBean.class);
        }

        public static ContentBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ContentBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ContentBean> arrayContentBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ContentBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ContentBean> arrayContentBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ContentBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getAppearance() {
            return appearance;
        }

        public void setAppearance(String appearance) {
            this.appearance = appearance;
        }

        public String getHandle() {
            return handle;
        }

        public void setHandle(String handle) {
            this.handle = handle;
        }

        public String getFaultreason() {
            return faultreason;
        }

        public void setFaultreason(String faultreason) {
            this.faultreason = faultreason;
        }
    }
}
