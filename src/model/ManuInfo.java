package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ManuInfo {
    /**
     * htmlname : 设备厂家
     * info : [{"shebeiming":"变压器智能冷却控制系统","xinghao":"BLQK-III大容量","changjiaming":"长沙慧林机电科技有限公司","dianhua":"0731-85530200  \n85530201","chuanzhen":"0731-85505987","wangzhi":"http://www.hljdgs.com","youxiang":"hljdgs@163.com"},{"shebeiming":"智能复用型同期装置","xinghao":"SID-2FY","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"脱硫快切装置","xinghao":"3ID-40A","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"备用电源快切装置","xinghao":"SID-8BT-A","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"同期自动选线器","xinghao":"SID-2X-B","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"备用电源自动投入装置(B型)","xinghao":"SID-409","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"备用电源自动投入装置(B型)","xinghao":"SID-409","changjiaming":"深圳市国立智能电力科技有限公司","dianhua":"（0755）89532683\n83663989","chuanzhen":"（0755）83663603","wangzhi":"http://szidd.com","youxiang":"szidd@163.net"},{"shebeiming":"断路器保护装置","xinghao":"PRS-721A-G","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"断路器失灵保护及自动重合闸装置","xinghao":"PRS-721A","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"短引线保护装置","xinghao":"PRS-722A-G","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"微机母线保护装置","xinghao":"BP-2CS","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"光纤分相纵差成套保护装置","xinghao":"PRS-753S","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"操作继电器装置","xinghao":"WBC-22C/E","changjiaming":"长园深瑞继保自动化有限公司","dianhua":"0755-33018888\n400-678-8099","chuanzhen":"null","wangzhi":"http://sznari.com","youxiang":"market@sznari.com"},{"shebeiming":"通信服务器","xinghao":"PSX 810","changjiaming":"国电南京自动化股份有限公司","dianhua":"51183115","chuanzhen":"025-51183004","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"数字式发电机变压器组保护装置","xinghao":"DGT 801U","changjiaming":"国电南京自动化股份有限公司","dianhua":"51183115","chuanzhen":"025-51183004","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"保护测控装置","xinghao":"PS 690U","changjiaming":"国电南京自动化股份有限公司","dianhua":"51183115","chuanzhen":"025-51183004","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"综合测控装置","xinghao":"PSR 660U","changjiaming":"国电南京自动化股份有限公司","dianhua":"51183115","chuanzhen":"025-51183004","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"线路保护装置","xinghao":"PSL 603U","changjiaming":"国电南京自动化股份有限公司","dianhua":"(025)83421394\n83418700","chuanzhen":"（025）83537020","wangzhi":"http://sac-china.com","youxiang":"market@sac-china.com"},{"shebeiming":"发电厂电气监控管理系统（ECMS）","xinghao":"PS 6000+","changjiaming":"国电南京自动化股份有限公司","dianhua":"025-83537598","chuanzhen":"025-83537598","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"继电保护信号数字复接接口装置","xinghao":"GXC 600A","changjiaming":"国电南京自动化股份有限公司","dianhua":"025-69833579","chuanzhen":"025-69833000","wangzhi":"www.sac-china.com","youxiang":"null"},{"shebeiming":"数字式远跳判别装置","xinghao":"SSP530","changjiaming":"国电南京自动化股份有限公司","dianhua":"(025)51183781\n51183779","chuanzhen":"(025)51183781","wangzhi":"null","youxiang":"null"},{"shebeiming":"数字式超高压线路保护装置","xinghao":"CSC-103A(B)","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62986668","chuanzhen":"010-62981900","wangzhi":"null","youxiang":"null"},{"shebeiming":"数字式母联保护装置","xinghao":"CSC-122A-G","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62986668","chuanzhen":"010-62981900","wangzhi":"null","youxiang":"null"},{"shebeiming":"数字式故障启动装置","xinghao":"CSC-125A","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62986668","chuanzhen":"010-62981900","wangzhi":"null","youxiang":"null"},{"shebeiming":"数字式母线保护装置","xinghao":"CSC-150","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62986668","chuanzhen":"010-62981900","wangzhi":"null","youxiang":"null"},{"shebeiming":"三相操作箱","xinghao":"JFZ-11S JFZ-12S","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62961515","chuanzhen":"010-62981004","wangzhi":"www.sf-auto.com","youxiang":"info@sf-auto.com"},{"shebeiming":"数字式重合闸及断路器辅助保护装置","xinghao":"CSC-122A","changjiaming":"北京四方继保自动化股份有限公司","dianhua":"010-62961515","chuanzhen":"010-62981004","wangzhi":"www.sf-auto.com","youxiang":"info@sf-auto.com"},{"shebeiming":"故障录波及测距装置","xinghao":"YS-900A","changjiaming":"南京航天银山电气有限公司","dianhua":"025-85300766","chuanzhen":"025-85313554","wangzhi":"http://www.casicys.com","youxiang":"null"},{"shebeiming":"电力故障信息处理系统子站","xinghao":"YS-3000A","changjiaming":"南京航天银山电气有限公司","dianhua":"025-85300766","chuanzhen":"025-85313554","wangzhi":"http://www.casicys.com","youxiang":"null"},{"shebeiming":"关口电能表","xinghao":"WU.TE432q高精度","changjiaming":"上海惠安系统控制有限公司","dianhua":"（021）64850085","chuanzhen":"（021）64850086","wangzhi":"www.wescongroup.com","youxiang":"market.cn@wescongroup.com"},{"shebeiming":"远动装置","xinghao":"null","changjiaming":"上海惠安系统控制有限公司","dianhua":"4006780085","chuanzhen":"null","wangzhi":"http://www.wescon.cn","youxiang":"null"},{"shebeiming":"输电网故障GPS行波定位系统","xinghao":"WGXD-2007","changjiaming":"湖南湘能电气自动化有限公司","dianhua":"0731-8902850-8808\n0731-8925088","chuanzhen":"null","wangzhi":"null","youxiang":"xndz_xs@163.com"},{"shebeiming":"电力系统相量测量装置","xinghao":"PAC-2000","changjiaming":"南京南瑞集团公司北京监控技术中心","dianhua":"010-52613660\n010-52613662","chuanzhen":"010-82813838","wangzhi":"http://www.epri.sgcc.com.cn","youxiang":"null"},{"shebeiming":"超高压线路成套保护装置","xinghao":"PCS-931G系列","changjiaming":"南京南瑞继保电气有限公司","dianhua":"025-52107703\n8008289967\n4008289967","chuanzhen":"025-52100770","wangzhi":"www.nari-relays.com/ser_sup","youxiang":"null"},{"shebeiming":"继电保护信号数字复接接口装置","xinghao":"MUX-2MD","changjiaming":"南京南瑞继保电气有限公司","dianhua":"025-52107703\n8008289967\n4008289967","chuanzhen":"025-52100770","wangzhi":"www.nari-relays.com/ser_sup","youxiang":"null"},{"shebeiming":"卫星时间同步系统","xinghao":"NH-9000","changjiaming":"湖南南汇电气有限公司","dianhua":"0731-85510187","chuanzhen":"0731-85510187-601","wangzhi":"null","youxiang":"hnnhdl@163.com"},{"shebeiming":"联切/高周/微机联切机组装置柜","xinghao":"GFWK-C","changjiaming":"江苏华瑞泰科技股份有限公司","dianhua":"(025)86728200","chuanzhen":"（025）52103712","wangzhi":"http://www.hrtkj.com","youxiang":"null"},{"shebeiming":"励磁系统","xinghao":"ABB UN6800","changjiaming":"上海纳信实业有限公司","dianhua":"86-21-54399353","chuanzhen":"86-21-54399376","wangzhi":"null","youxiang":"null"},{"shebeiming":"控制单元","xinghao":"2.0A,5.0A,6.0A和\n2.0E,5.0E,6.0E","changjiaming":"上海施耐德配电电器有限公司","dianhua":"(021)58122222","chuanzhen":"（021）58120980","wangzhi":"null","youxiang":"null"},{"shebeiming":"低压产品","xinghao":"MASTERRPACT MT(N)","changjiaming":"上海施耐德配电电器有限公司","dianhua":"(021)58122222","chuanzhen":"（021）58120980","wangzhi":"null","youxiang":"null"},{"shebeiming":"低压开关柜","xinghao":"MNS3.0","changjiaming":"厦门ABB低压电器设备有限公司","dianhua":"086 0592 6038118","chuanzhen":"086 0592 6038110","wangzhi":"www.abb.com.cn","youxiang":"David-jizhen.li@cn.abb.com"},{"shebeiming":"三相联动操作","xinghao":"LTB 72.5-245E1\nBLG 1002A","changjiaming":"北京ABB高压开关设备有限公司","dianhua":"(010)6781 8000","chuanzhen":"（010）6781 8001","wangzhi":"null","youxiang":"null"},{"shebeiming":"智能交流配电监控模块","xinghao":"EAU01","changjiaming":"艾默生网络能源有限公司","dianhua":"4008876510","chuanzhen":"null","wangzhi":"www.emersonnetworkpower.com.cn","youxiang":"service@emersonnetwork.com.cn"},{"shebeiming":"触摸屏监控模块","xinghao":"EMU10","changjiaming":"艾默生网络能源有限公司","dianhua":"4008876510","chuanzhen":"null","wangzhi":"www.emersonnetworkpower.com.cn","youxiang":"service@emersonnetwork.com.cn"},{"shebeiming":"继电保护测试仪","xinghao":"PW系列","changjiaming":"北京博电新力电气股份有限公司","dianhua":"400-680-0650","chuanzhen":"010-82755151-8005","wangzhi":"http://www.ponovo.cn","youxiang":"help@ponovo.cn"},{"shebeiming":"脱硫110v直流系统设备","xinghao":"null","changjiaming":"福建龙净环保股份有限公司","dianhua":"13524705706 陆大银","chuanzhen":"021-26079555-556","wangzhi":"http://www.ponovo.cn","youxiang":"ludayin@slep.net.cn"},{"shebeiming":"脱硫110v直流系统设备","xinghao":"null","changjiaming":"国电南京自动化股份有限公司","dianhua":"15851869339 韩建科","chuanzhen":"025-52393672","wangzhi":"null","youxiang":"vvx2000@163.com"},{"shebeiming":"高效干式配电变压器","xinghao":"null","changjiaming":"湖南省电力勘测设计院","dianhua":"13574113238 肖少华","chuanzhen":"0731-85387381","wangzhi":"null","youxiang":"314227168@qq.com"},{"shebeiming":"高效干式配电变压器","xinghao":"null","changjiaming":"保定天威顺达变压器有限公司","dianhua":"18631260353 牛海峰","chuanzhen":"0312-3309226","wangzhi":"null","youxiang":"twsd2004@163.com"},{"shebeiming":"互感器综合测试仪","xinghao":"HCFA-IV","changjiaming":"保定华创电气有限公司","dianhua":"0312-3336705","chuanzhen":"null","wangzhi":"null","youxiang":"null"},{"shebeiming":"调压变压器","xinghao":"DBW/SBW SERIES","changjiaming":"青岛艾迪森科技有限公司","dianhua":"86 532 87882666\n87883999","chuanzhen":"86 532 87885388","wangzhi":"http://www.LDC.com.cn","youxiang":"LDCUPS@yahoo.com.cn"},{"shebeiming":"UPS","xinghao":"SDP SERIES","changjiaming":"青岛艾迪森科技有限公司","dianhua":"86 532 87882666\n87883999","chuanzhen":"86 532 87885388","wangzhi":"http://www.LDC.com.cn","youxiang":"LDCUPS@yahoo.com.cn"},{"shebeiming":"户内高压隔离开关","xinghao":"GN19-12Q","changjiaming":"江山市森源电器有限公司","dianhua":"0570-4351198\n4351111","chuanzhen":"0570-4351057","wangzhi":"null","youxiang":"null"},{"shebeiming":"变压器油面温控器","xinghao":"BWY-804J(TH)","changjiaming":"大连世有电力科技有限公司","dianhua":"0411-87804698\n0411-87804658转8899","chuanzhen":"0411-87805542","wangzhi":"null","youxiang":"null"},{"shebeiming":"全自动加药系统","xinghao":"TCZB系列","changjiaming":"上海同臣环保股份有限公司","dianhua":"021-65988709\n021-35183665","chuanzhen":"021-65988179","wangzhi":"null","youxiang":"sales@techase.com"},{"shebeiming":"电力专用纵向加密认证网关","xinghao":"PSTunnel-2000系列","changjiaming":"北京科东电力控制系统有限责任公司","dianhua":"null","chuanzhen":"null","wangzhi":"null","youxiang":"null"},{"shebeiming":"油温度指示控制器","xinghao":"OTI 34系列","changjiaming":"北京市天菱电气设备有限公司","dianhua":"86-10-8586 2898/2899","chuanzhen":"86-10-8586 2868","wangzhi":"null","youxiang":"business@tianlingdianqi.com"},{"shebeiming":"前置数据采集盒","xinghao":"OTI 34系列","changjiaming":"上海耀明仪表控制有限公司","dianhua":"021-33011531\n33011558","chuanzhen":"021-63070827","wangzhi":"null","youxiang":"null"},{"shebeiming":"智能电能量采集终端","xinghao":"DF6205","changjiaming":"烟台东方威思顿电气有限公司","dianhua":"0535-5520555","chuanzhen":"0535-5520535","wangzhi":"http://www.ytwisdom.com","youxiang":"wisdom@dongfang-china.com"},{"shebeiming":"多功能失压、断流计时仪","xinghao":"JSY-A03S、JSY-A03T","changjiaming":"武汉威凯仪器设备有限公司","dianhua":"027-88515165\n027-88515169","chuanzhen":"027-88515169","wangzhi":"http://www.ytwisdom.com","youxiang":"wecan1105@sina.com"},{"shebeiming":"电容式电压互感器","xinghao":"CVT","changjiaming":"上海MWB互感器有限公司","dianhua":"86-21-24084888\n13501977817","chuanzhen":"86-21-54723118","wangzhi":"http://www.ytwisdom.com","youxiang":"sales.cn@trench-group.com"},{"shebeiming":"互感器伏安变比极性综合测试仪","xinghao":"HTFA-105","changjiaming":"武汉市华天电力自动化有限责任公司","dianhua":"(027)87459656","chuanzhen":"（027）87803129","wangzhi":"www.whhuatian.com","youxiang":"whhuatian@163.com"},{"shebeiming":"全电子多功能电能表","xinghao":"Mk6E","changjiaming":"厦门红相电力设备股份有限公司","dianhua":"0592-2108051","chuanzhen":"0592-2107581","wangzhi":"http://www.redphase.com.cn","youxiang":"null"},{"shebeiming":"全封闭支柱式电流互感器","xinghao":"LZZBJ9-12/150b/4","changjiaming":"中国·大连北方互感器集团有限公司","dianhua":"400-0411-666","chuanzhen":"0411-83290552","wangzhi":"WWW.DLBF.COM","youxiang":"null"},{"shebeiming":"全封闭母线式电流互感器","xinghao":"LMZB1-10","changjiaming":"中国·大连北方互感器集团有限公司","dianhua":"400-0411-666","chuanzhen":"0411-83290552","wangzhi":"WWW.DLBF.COM","youxiang":"null"},{"shebeiming":"电压互感器","xinghao":"JDZX17-3.6.10","changjiaming":"中国·大连北方互感器集团有限公司","dianhua":"400-0411-666","chuanzhen":"0411-83290552","wangzhi":"WWW.DLBF.COM","youxiang":"null"},{"shebeiming":"微机电力谐振诊断消除装置","xinghao":"LCH-WXYH","changjiaming":"北京国电电力成科技有限公司  ","dianhua":"010-83817544\n010-51667459","chuanzhen":"010-51413310","wangzhi":"null","youxiang":"null"},{"shebeiming":"零序电流互感器","xinghao":"LCH-LJF(Y)","changjiaming":"北京国电电力成科技有限公司  ","dianhua":"010-51667459","chuanzhen":"010-51413310","wangzhi":"null","youxiang":"null"},{"shebeiming":"零序电流互感器","xinghao":"HY-LCT","changjiaming":"北京华园经纬机电技术有限公司  ","dianhua":"010-84032171\n84035179","chuanzhen":"010-84035179","wangzhi":"www.bjhjw.cn","youxiang":"bj-hyjw@vip.163.com"},{"shebeiming":"带电状态显示器","xinghao":"NYD-SSD-III(G)-2001、2002","changjiaming":"南京亚电电力设备有限公司 ","dianhua":"025-52339266\n52339299","chuanzhen":"025-52338099","wangzhi":"http://www.njyddl.com","youxiang":"yddl8056@vip.sina.com"},{"shebeiming":"带电状态显示器","xinghao":"NYD-SSD-III(G)-2001、2002","changjiaming":"南京亚电电力设备有限公司 ","dianhua":"025-52339266\n52339299","chuanzhen":"025-52338099","wangzhi":"http://www.njyddl.com","youxiang":"yddl8056@vip.sina.com"},{"shebeiming":"CT二次过电压保护器","xinghao":"null","changjiaming":"南京亚电电力设备有限公司 ","dianhua":"025-52339266\n52339299","chuanzhen":"025-52338099","wangzhi":"http://www.njyddl.com","youxiang":"yddl8056@vip.sina.com"},{"shebeiming":"大能容组合式过电压保护器","xinghao":"BSTG","changjiaming":"安徽一天电气技术有限公司 ","dianhua":"0551-65357301\n65357308","chuanzhen":"0551-65357153","wangzhi":"http://www.onesky.cc","youxiang":"null"},{"shebeiming":"便携式故障录波分析仪","xinghao":"PDA1010","changjiaming":"哈尔滨锐思科技有限公司","dianhua":"045-82323681","chuanzhen":"045-82323681","wangzhi":"null","youxiang":"lgf_risen@163.com "},{"shebeiming":"隔离开关及熔断器组","xinghao":"QSA、QA、QP、QSS、QAS、QPS","changjiaming":"厦门联容电控有限公司","dianhua":"0592-5702071","chuanzhen":"0592-5702072","wangzhi":"null","youxiang":"null"}]
     */

    @SerializedName("htmlname")
    private String htmlname;
    @SerializedName("info")
    private List<InfoBean_manu> info;
    
    public static String test_shebeichangjia = "{\"htmlname\":\"设备厂家\",\"info\":[{\"shebeiming\":\"变压器智能冷却控制系统\",\"xinghao\":\"BLQK-III大容量\",\"changjiaming\":\"长沙慧林机电科技有限公司\",\"dianhua\":\"0731-85530200  \n85530201\",\"chuanzhen\":\"0731-85505987\",\"wangzhi\":\"http://www.hljdgs.com\",\"youxiang\":\"hljdgs@163.com\"},{\"shebeiming\":\"智能复用型同期装置\",\"xinghao\":\"SID-2FY\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"脱硫快切装置\",\"xinghao\":\"3ID-40A\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"备用电源快切装置\",\"xinghao\":\"SID-8BT-A\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"同期自动选线器\",\"xinghao\":\"SID-2X-B\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"备用电源自动投入装置(B型)\",\"xinghao\":\"SID-409\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"备用电源自动投入装置(B型)\",\"xinghao\":\"SID-409\",\"changjiaming\":\"深圳市国立智能电力科技有限公司\",\"dianhua\":\"（0755）89532683\n83663989\",\"chuanzhen\":\"（0755）83663603\",\"wangzhi\":\"http://szidd.com\",\"youxiang\":\"szidd@163.net\"},{\"shebeiming\":\"断路器保护装置\",\"xinghao\":\"PRS-721A-G\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"断路器失灵保护及自动重合闸装置\",\"xinghao\":\"PRS-721A\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"短引线保护装置\",\"xinghao\":\"PRS-722A-G\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"微机母线保护装置\",\"xinghao\":\"BP-2CS\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"光纤分相纵差成套保护装置\",\"xinghao\":\"PRS-753S\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"操作继电器装置\",\"xinghao\":\"WBC-22C/E\",\"changjiaming\":\"长园深瑞继保自动化有限公司\",\"dianhua\":\"0755-33018888\n400-678-8099\",\"chuanzhen\":\"null\",\"wangzhi\":\"http://sznari.com\",\"youxiang\":\"market@sznari.com\"},{\"shebeiming\":\"通信服务器\",\"xinghao\":\"PSX 810\",\"changjiaming\":\"国电南京自动化股份有限公司\",\"dianhua\":\"51183115\",\"chuanzhen\":\"025-51183004\",\"wangzhi\":\"www.sac-china.com\",\"youxiang\":\"null\"}]}";
    
	public static String SHEBEICHANGJIA ="设备厂家";
	public static String DIANKEYUAN ="电科院";
	public static String SHEJIYUAN ="设计院";

    public static ManuInfo objectFromData(String str) {

        return new Gson().fromJson(str, ManuInfo.class);
    }

    public static ManuInfo objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ManuInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ManuInfo> arrayManuInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<ManuInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ManuInfo> arrayManuInfoFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ManuInfo>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getHtmlname() {
        return htmlname;
    }

    public void setHtmlname(String htmlname) {
        this.htmlname = htmlname;
    }

    public List<InfoBean_manu> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean_manu> info) {
        this.info = info;
    }

    public static class InfoBean_manu {
        /**
         * shebeiming : 变压器智能冷却控制系统
         * xinghao : BLQK-III大容量
         * changjiaming : 长沙慧林机电科技有限公司
         * dianhua : 0731-85530200
         85530201
         * chuanzhen : 0731-85505987
         * wangzhi : http://www.hljdgs.com
         * youxiang : hljdgs@163.com
         */

        @SerializedName("shebeiming")
        private String shebeiming;
        @SerializedName("xinghao")
        private String xinghao;
        @SerializedName("changjiaming")
        private String changjiaming;
        @SerializedName("dianhua")
        private String dianhua;
        @SerializedName("chuanzhen")
        private String chuanzhen;
        @SerializedName("wangzhi")
        private String wangzhi;
        @SerializedName("youxiang")
        private String youxiang;

        public static InfoBean_manu objectFromData(String str) {

            return new Gson().fromJson(str, InfoBean_manu.class);
        }

        public static InfoBean_manu objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), InfoBean_manu.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<InfoBean_manu> arrayInfoBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<InfoBean_manu>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<InfoBean_manu> arrayInfoBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<InfoBean_manu>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getShebeiming() {
            return shebeiming;
        }

        public void setShebeiming(String shebeiming) {
            this.shebeiming = shebeiming;
        }

        public String getXinghao() {
            return xinghao;
        }

        public void setXinghao(String xinghao) {
            this.xinghao = xinghao;
        }

        public String getChangjiaming() {
            return changjiaming;
        }

        public void setChangjiaming(String changjiaming) {
            this.changjiaming = changjiaming;
        }

        public String getDianhua() {
            return dianhua;
        }

        public void setDianhua(String dianhua) {
            this.dianhua = dianhua;
        }

        public String getChuanzhen() {
            return chuanzhen;
        }

        public void setChuanzhen(String chuanzhen) {
            this.chuanzhen = chuanzhen;
        }

        public String getWangzhi() {
            return wangzhi;
        }

        public void setWangzhi(String wangzhi) {
            this.wangzhi = wangzhi;
        }

        public String getYouxiang() {
            return youxiang;
        }

        public void setYouxiang(String youxiang) {
            this.youxiang = youxiang;
        }
    }
}
