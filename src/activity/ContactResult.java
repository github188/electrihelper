package activity;


import java.util.List;
import java.util.zip.Inflater;


import model.ContactInfo;
import model.ContactInfo.InfoBean;
import model.ManuInfo;
import model.ManuInfo.InfoBean_manu;

import com.example.test.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactResult extends Activity {
	private ListView mListView;
	private Button mButton;
	private TextView htmlName;
	private Intent intent = new Intent();
	private Bundle bundle = new Bundle();
	private String info;
	private Context mContext=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contantresult);
		mListView = (ListView) findViewById(R.id.contantlistview);
		htmlName = (TextView) findViewById(R.id.theme);
		intent = getIntent();
		bundle = intent.getExtras();
		info = (String) bundle.getSerializable("info");
		htmlName.setText(info);
		Log.i("dalian", "get info = " + info.toString());
		if (info.equals(ManuInfo.SHEBEICHANGJIA)) {
			new ManuTask().execute(info);
		} else
			new ContactTask().execute(info);

	}

	public class AppListAdapter extends BaseAdapter {

		private Context mContext;
		private List<InfoBean> mInfos;

		public AppListAdapter(Context context, List<InfoBean> infos) {
			mContext = context;
			mInfos = infos;
		}

		@Override
		public int getCount() {
			return mInfos.size();
		}

		@Override
		public Object getItem(int position) {
			return mInfos.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			final ViewHolder viewHolder;
			LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			if (convertView == null) {
				viewHolder = new ViewHolder();
				convertView = layoutInflater.inflate(
						R.layout.contact_list_item, null);
				// 获取控件
				viewHolder.personname = (TextView) convertView
						.findViewById(R.id.personname);
				viewHolder.phonenumber = (TextView) convertView
						.findViewById(R.id.phonenumber);
				viewHolder.telephone=(Button) convertView.findViewById(R.id.telephone);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			// 和数据之间进行绑定
			viewHolder.personname.setText(mInfos.get(position).getPersonname());
			viewHolder.phonenumber.setText(mInfos.get(position)
					.getPhonenumber());
			viewHolder.telephone.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO 自动生成的方法存根
					String number = viewHolder.phonenumber.getText().toString();
					Toast.makeText(mContext, number, Toast.LENGTH_SHORT).show();
					
					  Intent intent = new Intent();// 创建一个意图
					  intent.setAction(Intent.ACTION_DIAL);// 指定其动作为拨打电话 添加打电话的动作
					  intent.setData(Uri.parse("tel:" + number));// 指定要拨出的号码
					  startActivity(intent);// 执行动作
				}
			});

			return convertView;
		}

		class ViewHolder {
			TextView phonenumber;
			TextView personname;
			Button telephone;
		}
	}

	public class ManuListAdapter extends BaseAdapter {

		private Context mContext;
		private List<InfoBean_manu> mInfos;

		public ManuListAdapter(Context context, List<InfoBean_manu> infos) {
			mContext = context;
			mInfos = infos;
		}

		@Override
		public int getCount() {
			return mInfos.size();
		}

		@Override
		public Object getItem(int position) {
			return mInfos.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			ViewHolder viewHolder;
			LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			if (convertView == null) {
				viewHolder = new ViewHolder();
				convertView = layoutInflater.inflate(R.layout.manu_list_item,
						null);
				// 获取控件
				viewHolder.shebei = (TextView) convertView
						.findViewById(R.id.shebei_name);
				viewHolder.xinghao = (TextView) convertView
						.findViewById(R.id.manu_class);
				viewHolder.changjia = (TextView) convertView
						.findViewById(R.id.manu_name);
				viewHolder.dianhua = (TextView) convertView
						.findViewById(R.id.dianhua);
				viewHolder.chuanzhen = (TextView) convertView
						.findViewById(R.id.chuanzhen);
				viewHolder.wangzhi = (TextView) convertView
						.findViewById(R.id.wangzhi);
				viewHolder.youxiang = (TextView) convertView
						.findViewById(R.id.youxiang);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			// 和数据之间进行绑定
			viewHolder.shebei.setText(mInfos.get(position).getShebeiming());
			viewHolder.xinghao.setText(mInfos.get(position).getXinghao());
			viewHolder.changjia.setText(mInfos.get(position).getChangjiaming());
			viewHolder.dianhua.setText(mInfos.get(position).getDianhua());
			viewHolder.chuanzhen.setText(mInfos.get(position).getChuanzhen());
			viewHolder.wangzhi.setText(mInfos.get(position).getWangzhi());
			viewHolder.youxiang.setText(mInfos.get(position).getYouxiang());

			return convertView;
		}

		class ViewHolder {
			TextView shebei;
			TextView xinghao;
			TextView changjia;
			TextView dianhua;
			TextView chuanzhen;
			TextView wangzhi;
			TextView youxiang;

		}
	}

	public class ContactTask extends AsyncTask<String, Integer, String> {

		@Override
		protected String doInBackground(String... inputs) {
			// TODO 自动生成的方法存根
			String result = "";
			if (ContactInfo.CHANGLINGDAO.equals(inputs[0])) {
				result = ContactInfo.test_changlingdao;
			} else if (ContactInfo.WEIHUBU.equals(inputs[0])) {
				result = ContactInfo.test_weihubu;
			} else if (ContactInfo.BANGONGSHI.equals(inputs[0])) {
				result = ContactInfo.test_bangongshi;
			} else if (ContactInfo.ZHENGZHIGONGZUOBU.equals(inputs[0])) {
				result = ContactInfo.test_zhengzhigongzuobu;
			} else if (ContactInfo.RENZIBU.equals(inputs[0])) {
				result = ContactInfo.test_renzibu;
			} else if (ContactInfo.JIHUAYINGXIAOBU.equals(inputs[0])) {
				result = ContactInfo.test_jihuayingxiaobu;
			} else if (ContactInfo.CAIWUZICHANBU.equals(inputs[0])) {
				result = ContactInfo.test_caiwuzichanbu;
			} else if (ContactInfo.WULIAOBU.equals(inputs[0])) {
				result = ContactInfo.test_wuliaobu;
			} else if (ContactInfo.SHENGCHANJISHUBU.equals(inputs[0])) {
				result = ContactInfo.test_shengchanjishubu;
			} else if (ContactInfo.ANJIANBAOWEIBU.equals(inputs[0])) {
				result = ContactInfo.test_anjianbaoweibu;
			} else if (ContactInfo.YUNXINGBU.equals(inputs[0])) {
				result = ContactInfo.test_yunxingbu;
			} else if (ContactInfo.RANLIAOSHENGCHANBU.equals(inputs[0])) {
				result = ContactInfo.test_ranliaoshengchanbu;
			} else if (ContactInfo.XIAOQU.equals(inputs[0])) {
				result = ContactInfo.test_xiaoqu;
			} else if (ContactInfo.QICHEBAN.equals(inputs[0])) {
				result = ContactInfo.test_qicheban;
			} else if (ContactInfo.SHITANG.equals(inputs[0])) {
				result = ContactInfo.test_shitang;
			}
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO 自动生成的方法存根
			super.onPostExecute(result);

			ContactInfo info = ContactInfo.objectFromData(result);
			mListView.setAdapter(new AppListAdapter(ContactResult.this, info
					.getInfo()));

		}
	}

	public class ManuTask extends AsyncTask<String, Integer, String> {

		@Override
		protected String doInBackground(String... inputs) {
			// TODO 自动生成的方法存根
			String result = "";
			if (ManuInfo.SHEBEICHANGJIA.equals(inputs[0])) {
				result = ManuInfo.test_shebeichangjia;
			} else if (ManuInfo.SHEJIYUAN.equals(inputs[0])) {
				result = ManuInfo.test_shebeichangjia;
			} else if (ManuInfo.DIANKEYUAN.equals(inputs[0])) {
				result = ManuInfo.test_shebeichangjia;
			}
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO 自动生成的方法存根
			super.onPostExecute(result);
			ManuInfo info = ManuInfo.objectFromData(result);
			mListView.setAdapter(new ManuListAdapter(ContactResult.this, info
					.getInfo()));
		}
	}

}
