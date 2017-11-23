package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
	/**
	 * htmlname : 厂领导 info :
	 * [{"personname":"何辉","phonenumber":"18973166777"},{"personname"
	 * :"郝忠义","phonenumber"
	 * :"18390681000"},{"personname":"皮军","phonenumber":"18073619898"
	 * },{"personname"
	 * :"曾全芝","phonenumber":"18073165053"},{"personname":"高景玉","phonenumber"
	 * :"18073165909"
	 * },{"personname":"喻新和","phonenumber":"13637368000"},{"personname"
	 * :"潘涛","phonenumber"
	 * :"18975615999"},{"personname":"蔡华锋","phonenumber":"18975623381"
	 * },{"personname"
	 * :"于德超 ","phonenumber":"18073165006"},{"personname":"李冬英","phonenumber"
	 * :"13348667999"},{"personname":"何文波","phonenumber":"18073165268"}]
	 */

	public static String test_changlingdao = "{\"htmlname\":\"厂领导\",\"info\":[{\"personname\":\"何辉\",\"phonenumber\":\"18973166777\"},{\"personname\":\"郝忠义\",\"phonenumber\":\"18390681000\"},{\"personname\":\"皮军\",\"phonenumber\":\"18073619898\"},{\"personname\":\"曾全芝\",\"phonenumber\":\"18073165053\"},{\"personname\":\"高景玉\",\"phonenumber\":\"18073165909\"},{\"personname\":\"喻新和\",\"phonenumber\":\"13637368000\"},{\"personname\":\"潘涛\",\"phonenumber\":\"18975615999\"},{\"personname\":\"蔡华锋\",\"phonenumber\":\"18975623381\"},{\"personname\":\"于德超 \",\"phonenumber\":\"18073165006\"},{\"personname\":\"李冬英\",\"phonenumber\":\"13348667999\"},{\"personname\":\"何文波\",\"phonenumber\":\"18073165268\"}]}";
	public static String test_bangongshi = "{\"htmlname\":\"办公室\",\"info\":[{\"personname\":\"陈喜\",\"phonenumber\":\"18073165122\"},{\"personname\":\"刘力军\",\"phonenumber\":\"13873652653\"},{\"personname\":\"马金平\",\"phonenumber\":\"18207362058\"},{\"personname\":\"鲁光武\",\"phonenumber\":\"17773639648\"},{\"personname\":\"张立\",\"phonenumber\":\"15377365111\"},{\"personname\":\"蒋爱红\",\"phonenumber\":\"18073617880\"},{\"personname\":\"申放云\",\"phonenumber\":\"13657368725\"},{\"personname\":\"孔兴华\",\"phonenumber\":\"18975623310\"},{\"personname\":\"江文明\",\"phonenumber\":\"18673617626\"},{\"personname\":\"肖保林\",\"phonenumber\":\"18175789383\"},{\"personname\":\"李祥\",\"phonenumber\":\"17711676700\"},{\"personname\":\"高春艳\",\"phonenumber\":\"13575207259\"},{\"personname\":\"皮亚琼\",\"phonenumber\":\"18073659896\"}]}";
	public static String test_zhengzhigongzuobu = "{\"htmlname\":\"政治工作部\",\"info\":[{\"personname\":\"潘涛\",\"phonenumber\":\"18975615999\"},{\"personname\":\"谷晓明\",\"phonenumber\":\"13974235525\"},{\"personname\":\"姜雁飞\",\"phonenumber\":\"15073628778\"},{\"personname\":\"杨德辉\",\"phonenumber\":\"18873673911\"},{\"personname\":\"梁建\",\"phonenumber\":\"13575193186\"},{\"personname\":\"陈健\",\"phonenumber\":\"15870256015\"},{\"personname\":\"赵冰颖\",\"phonenumber\":\"13367361577\"},{\"personname\":\"赵春华\",\"phonenumber\":\"15399779383\"}]}";
	public static String test_renzibu = "{\"htmlname\":\"人资部\",\"info\":[{\"personname\":\"曾跃虎\",\"phonenumber\":\"18073165015\"},{\"personname\":\"文锐\",\"phonenumber\":\"13307360678\"},{\"personname\":\"唐敏\",\"phonenumber\":\"17773658040\"},{\"personname\":\"卢方琼\",\"phonenumber\":\"15007369296\"},{\"personname\":\"张常棣\",\"phonenumber\":\"18973683081\"},{\"personname\":\"邓茜\",\"phonenumber\":\"18569421042\"}]}";
	public static String test_jihuayingxiaobu = "{\"htmlname\":\"计划营销部\",\"info\":[{\"personname\":\"蔡华锋\",\"phonenumber\":\"18975623381\"},{\"personname\":\"刘力源\",\"phonenumber\":\"18073659898\"},{\"personname\":\"焦雄飞\",\"phonenumber\":\"15260753359\"},{\"personname\":\"袁继东\",\"phonenumber\":\"18175634066\"},{\"personname\":\"蔡敏 \",\"phonenumber\":\"18907427778\"},{\"personname\":\"韦升荣\",\"phonenumber\":\"13337362335\"},{\"personname\":\"赵伯晗\",\"phonenumber\":\"13973623467\"},{\"personname\":\"余绍兵\",\"phonenumber\":\"13873603337\"},{\"personname\":\"夏广才\",\"phonenumber\":\"18073165477\"},{\"personname\":\"林继香\",\"phonenumber\":\"13637360262\"}]}";
	public static String test_caiwuzichanbu = "{\"htmlname\":\"财务资产部\",\"info\":[{\"personname\":\"李冬英\",\"phonenumber\":\"13348667999\"},{\"personname\":\"陈训华\",\"phonenumber\":\"13786710696\"},{\"personname\":\"张晓蔓\",\"phonenumber\":\"13786692829\"},{\"personname\":\"金圆圆\",\"phonenumber\":\"13975664720\"},{\"personname\":\"宋轩平\",\"phonenumber\":\"18173638680\"},{\"personname\":\"李祖峰\",\"phonenumber\":\"15080652115\"},{\"personname\":\"陈晓倩\",\"phonenumber\":\"15200699239\"},{\"personname\":\"邹秋慧\",\"phonenumber\":\"15673789918\"},{\"personname\":\"唐乐平\",\"phonenumber\":\"13142119535\"}]}";
	public static String test_wuliaobu = "{\"htmlname\":\"物料部\",\"info\":[{\"personname\":\"夏振兴\",\"phonenumber\":\"18073165005\"},{\"personname\":\"赵广辛\",\"phonenumber\":\"13984277690\"},{\"personname\":\"王守阳\",\"phonenumber\":\"18073165330\"},{\"personname\":\"徐旻\",\"phonenumber\":\"18975623366\"},{\"personname\":\"耿智宇\",\"phonenumber\":\"17707363553\"},{\"personname\":\"邓敏姿\",\"phonenumber\":\"15307360477\"},{\"personname\":\"黄莺\",\"phonenumber\":\"18173636109\"},{\"personname\":\"祝康艺\",\"phonenumber\":\"17773619127\"},{\"personname\":\"修科\",\"phonenumber\":\"18073679450\"},{\"personname\":\"周早\",\"phonenumber\":\"13378069520\"},{\"personname\":\"蔡莉\",\"phonenumber\":\"18907429777\"},{\"personname\":\"张光军\",\"phonenumber\":\"18073645777\"},{\"personname\":\"胡立新\",\"phonenumber\":\"13807360161\"},{\"personname\":\"骆娟\",\"phonenumber\":\"18142687799\"},{\"personname\":\"何静茹\",\"phonenumber\":\"18175652639\"},{\"personname\":\"徐丽娟\",\"phonenumber\":\"15974477606\"},{\"personname\":\"高文兵\",\"phonenumber\":\"13548857462\"},{\"personname\":\"朱继巍\",\"phonenumber\":\"18973684512\"},{\"personname\":\"刘琼\",\"phonenumber\":\"18182133216\"}]}";
	public static String test_shengchanjishubu = "{\"htmlname\":\"生产技术部\",\"info\":[{\"personname\":\"罗洪辉\",\"phonenumber\":\"18074659897\"},{\"personname\":\"史畅\",\"phonenumber\":\"13973626361\"},{\"personname\":\"郑海斌\",\"phonenumber\":\"15073695320\"},{\"personname\":\"杨佳贤\",\"phonenumber\":\"18608408020\"},{\"personname\":\"王振\",\"phonenumber\":\"17773641716\"},{\"personname\":\"董良阁\",\"phonenumber\":\"18673663695\"},{\"personname\":\"游松林\",\"phonenumber\":\"18670667046\"},{\"personname\":\"张志强\",\"phonenumber\":\"18670661127\"},{\"personname\":\"梁万博\",\"phonenumber\":\"15874171720\"},{\"personname\":\"姚勇琦\",\"phonenumber\":\"17773617925\"},{\"personname\":\"顾剑英\",\"phonenumber\":\"15399770999\"},{\"personname\":\"程思\",\"phonenumber\":\"18673673399\"},{\"personname\":\"李秀红\",\"phonenumber\":\"15907366617\"},{\"personname\":\"李宏伟\",\"phonenumber\":\"18229789867\"}]}";
	public static String test_anjianbaoweibu = "{\"htmlname\":\"安监保卫部\",\"info\":[{\"personname\":\"李延辉\",\"phonenumber\":\"18711673877\"},{\"personname\":\"刘晓\",\"phonenumber\":\"18173613318\"},{\"personname\":\"唐明晖\",\"phonenumber\":\"18692898977\"},{\"personname\":\"孔鹏程\",\"phonenumber\":\"13511178868\"},{\"personname\":\"张小丽\",\"phonenumber\":\"18173678537\"},{\"personname\":\"周康权\",\"phonenumber\":\"13807424370\"},{\"personname\":\"彭汝攀\",\"phonenumber\":\"15211310777\"}]}";
	public static String test_yunxingbu = "{\"htmlname\":\"运行部\",\"info\":[{\"personname\":\"吴强\",\"phonenumber\":\"18073165656\"},{\"personname\":\"董乐平\",\"phonenumber\":\"18152686665\"},{\"personname\":\"杜泰民\",\"phonenumber\":\"17707367200\"},{\"personname\":\"杜宝玉\",\"phonenumber\":\"15080607796\"},{\"personname\":\"候云峰\",\"phonenumber\":\"13618415115\"},{\"personname\":\"金贵\",\"phonenumber\":\"17763617022\"},{\"personname\":\"张稳\",\"phonenumber\":\"17752732169\"},{\"personname\":\"赖伟\",\"phonenumber\":\"17769360766\"},{\"personname\":\"宋波\",\"phonenumber\":\"17773647797\"},{\"personname\":\"张漆玺\",\"phonenumber\":\"17773629991\"},{\"personname\":\"黄建钱\",\"phonenumber\":\"17707475477\"},{\"personname\":\"沈平\",\"phonenumber\":\"13317368828\"},{\"personname\":\"王丽丽\",\"phonenumber\":\"18397303781\"},{\"personname\":\"刘艳锋\",\"phonenumber\":\"13907375529\"}]}";
	public static String test_ranliaoshengchanbu = "{\"htmlname\":\"燃料生产部\",\"info\":[{\"personname\":\"杨宏慧\",\"phonenumber\":\"13973667212\"},{\"personname\":\"李合祥\",\"phonenumber\":\"18073165038\"},{\"personname\":\"孟凡荣\",\"phonenumber\":\"15973669277\"},{\"personname\":\"易成龙\",\"phonenumber\":\"15272665578\"},{\"personname\":\"黄建军\",\"phonenumber\":\"15074298208\"},{\"personname\":\"陈世发\",\"phonenumber\":\"18932145286\"},{\"personname\":\"邹玲\",\"phonenumber\":\"15886623862\"},{\"personname\":\"陈蒙\",\"phonenumber\":\"18670612880\"},{\"personname\":\"曲靖\",\"phonenumber\":\"18573678711\"},{\"personname\":\"廖茂林\",\"phonenumber\":\"18890715908\"},{\"personname\":\"赵鲲\",\"phonenumber\":\"17773647720\"},{\"personname\":\"张哲铭\",\"phonenumber\":\"18173638820\"},{\"personname\":\"曹野\",\"phonenumber\":\"17707362041\"},{\"personname\":\"杨军\",\"phonenumber\":\"15074224800\"},{\"personname\":\"耿辉\",\"phonenumber\":\"15886698377\"}]}";
	public static String test_xiaoqu = "{\"htmlname\":\"小区\",\"info\":[{\"personname\":\"喻新和\",\"phonenumber\":\"13637368000\"},{\"personname\":\"庄克兴\",\"phonenumber\":\"13845355828\"}]}";
	public static String test_qicheban = "{\"htmlname\":\"汽车班\",\"info\":[{\"personname\":\"彭军\",\"phonenumber\":\"18373679168\"},{\"personname\":\"曹大燕\",\"phonenumber\":\"13973789619\"},{\"personname\":\"李国山\",\"phonenumber\":\"18073198801\"},{\"personname\":\"王云军\",\"phonenumber\":\"18075620728\"},{\"personname\":\"尹赞扬\",\"phonenumber\":\"18073165886\"},{\"personname\":\"张如刚\",\"phonenumber\":\"18670720101\"},{\"personname\":\"马杰\",\"phonenumber\":\"13077263903\"},{\"personname\":\"颜学冬\",\"phonenumber\":\"13875015518\"},{\"personname\":\"高云波\",\"phonenumber\":\"13974212767\"},{\"personname\":\"王宏仁\",\"phonenumber\":\"13973627548\"},{\"personname\":\"张辉\",\"phonenumber\":\"18229601850\"},{\"personname\":\"张斌\",\"phonenumber\":\"13873721299\"},{\"personname\":\"徐承惠\",\"phonenumber\":\"13907423511\"},{\"personname\":\"龙治波\",\"phonenumber\":\"13762613298\"},{\"personname\":\"江红兵\",\"phonenumber\":\"15973658139\"}]}";
	public static String test_shitang = "{\"htmlname\":\"食堂\",\"info\":[{\"personname\":\"罗群霞\",\"phonenumber\":\"15211306690\"},{\"personname\":\"周光明\",\"phonenumber\":\"13875161849\"}]}";
	public static String test_weihubu = "{\"htmlname\":\"维护部\",\"info\":[{\"personname\":\"黄晓\",\"phonenumber\":\"18711673167\"},{\"personname\":\"袁彬岚\",\"phonenumber\":\"13975663856\"},{\"personname\":\"尹迎春\",\"phonenumber\":\"17773620808\"},{\"personname\":\"袁湘华\",\"phonenumber\":\"13511146903\"},{\"personname\":\"徐焕文\",\"phonenumber\":\"18216112829\"},{\"personname\":\"罗毅利\",\"phonenumber\":\"18073659876\"},{\"personname\":\"范川\",\"phonenumber\":\"18073627260\"},{\"personname\":\"钟永春\",\"phonenumber\":\"17773632920\"},{\"personname\":\"任峰\",\"phonenumber\":\"13872660081\"},{\"personname\":\"张永飞\",\"phonenumber\":\"17763626677\"},{\"personname\":\"侯舒麟\",\"phonenumber\":\"15344485757\"},{\"personname\":\"王军\",\"phonenumber\":\"13378067546\"},{\"personname\":\"杜维\",\"phonenumber\":\"13548882514\"},{\"personname\":\"尹佳锋\",\"phonenumber\":\"13875919982\"},{\"personname\":\"周舟\",\"phonenumber\":\"15173632270\"},{\"personname\":\"周沅俊\",\"phonenumber\":\"13511199725\"}]}";

	public static String CHANGLINGDAO = "厂领导";
	public static String WEIHUBU = "维护部";
	public static String BANGONGSHI = "办公室";
	public static String ZHENGZHIGONGZUOBU = "政治工作部";
	public static String RENZIBU = "人资部";
	public static String JIHUAYINGXIAOBU = "计划营销部";
	public static String CAIWUZICHANBU = "财务资产部";
	public static String WULIAOBU = "物料部";
	public static String SHENGCHANJISHUBU = "生产技术部";
	public static String ANJIANBAOWEIBU = "安监保卫部";
	public static String YUNXINGBU = "运行部";
	public static String RANLIAOSHENGCHANBU = "燃料生产部";
	public static String XIAOQU = "小区";
	public static String QICHEBAN = "汽车班";
	public static String SHITANG = "食堂";


	@SerializedName("htmlname")
	private String htmlname;
	@SerializedName("info")
	private List<InfoBean> info;

	public static ContactInfo objectFromData(String str) {

		return new Gson().fromJson(str, ContactInfo.class);
	}

	public static ContactInfo objectFromData(String str, String key) {

		try {
			JSONObject jsonObject = new JSONObject(str);

			return new Gson().fromJson(jsonObject.getString(str),
					ContactInfo.class);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<ContactInfo> arrayContactInfoFromData(String str) {

		Type listType = new TypeToken<ArrayList<ContactInfo>>() {
		}.getType();

		return new Gson().fromJson(str, listType);
	}

	public static List<ContactInfo> arrayContactInfoFromData(String str,
			String key) {

		try {
			JSONObject jsonObject = new JSONObject(str);
			Type listType = new TypeToken<ArrayList<ContactInfo>>() {
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

	public List<InfoBean> getInfo() {
		return info;
	}

	public void setInfo(List<InfoBean> info) {
		this.info = info;
	}

	public static class InfoBean {
		/**
		 * personname : 何辉 phonenumber : 18973166777
		 */

		@SerializedName("personname")
		private String personname;
		@SerializedName("phonenumber")
		private String phonenumber;

		public static InfoBean objectFromData(String str) {

			return new Gson().fromJson(str, InfoBean.class);
		}

		public static InfoBean objectFromData(String str, String key) {

			try {
				JSONObject jsonObject = new JSONObject(str);

				return new Gson().fromJson(jsonObject.getString(str),
						InfoBean.class);
			} catch (JSONException e) {
				e.printStackTrace();
			}

			return null;
		}

		public static List<InfoBean> arrayInfoBeanFromData(String str) {

			Type listType = new TypeToken<ArrayList<InfoBean>>() {
			}.getType();

			return new Gson().fromJson(str, listType);
		}

		public static List<InfoBean> arrayInfoBeanFromData(String str,
				String key) {

			try {
				JSONObject jsonObject = new JSONObject(str);
				Type listType = new TypeToken<ArrayList<InfoBean>>() {
				}.getType();

				return new Gson().fromJson(jsonObject.getString(str), listType);

			} catch (JSONException e) {
				e.printStackTrace();
			}

			return new ArrayList();

		}

		public String getPersonname() {
			return personname;
		}

		public void setPersonname(String personname) {
			this.personname = personname;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
	}
}
