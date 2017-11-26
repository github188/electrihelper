package activity;

import java.util.List;

import model.ContactInfo;
import model.ContactInfo.InfoBean;
import model.FaultInfo;
import model.FaultInfo.ContentBean;

import gov.huadian.electry.R;

import activity.ContactResult.AppListAdapter;
import activity.ContactResult.ManuTask;
import activity.ContactResult.AppListAdapter.ViewHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FaultResult extends Activity {
	private ListView faultlist;
	private TextView htmlname;
	private Intent intent = new Intent();
	private Bundle bundle = new Bundle();
	private String info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faultresult);
		faultlist = (ListView) findViewById(R.id.faultlistview);
		htmlname = (TextView) findViewById(R.id.theme);
		intent = getIntent();
		bundle = intent.getExtras();
		info = (String) bundle.getSerializable("info");
		htmlname.setText(info);
		new FaultTask().execute(info);
	}

	public class FaultAdapter extends BaseAdapter {

		private Context mContext;
		private List<ContentBean> mInfos;

		public FaultAdapter(Context context, List<ContentBean> infos) {
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
				convertView = layoutInflater.inflate(R.layout.fault_list_item,
						null);
				// 获取控件
				viewHolder.appearance = (TextView) convertView
						.findViewById(R.id.appearance);
				viewHolder.handle = (TextView) convertView
						.findViewById(R.id.handle);
				viewHolder.faultreason = (TextView) convertView
						.findViewById(R.id.faultreason);
				convertView.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertView.getTag();
			}
			// 和数据之间进行绑定
			viewHolder.appearance.setText(mInfos.get(position).getAppearance());
			viewHolder.handle.setText(mInfos.get(position).getHandle());
			viewHolder.faultreason.setText(mInfos.get(position)
					.getFaultreason());

			return convertView;
		}

		class ViewHolder {
			TextView appearance;
			TextView handle;
			TextView faultreason;
		}

	}

	public class FaultTask extends AsyncTask<String, Integer, String> {

		@Override
		protected String doInBackground(String... inputs) {
			// TODO 自动生成的方法存根
			String result = "";
			if (FaultInfo.ZHILIUXITONG.equals(inputs[0])) {
				result = FaultInfo.test_zhiliuxitong;
			} else if (FaultInfo.LICIXITONG.equals(inputs[0])) {
				result = FaultInfo.test_licixitong;
			} else if (FaultInfo.FENGLENGKONGZHIXIANG.equals(inputs[0])) {
				result = FaultInfo.test_fenglengkongzhixiang;
			} else if (FaultInfo.FABIANZU.equals(inputs[0])) {
				result = FaultInfo.test_fabianzu;
			} else if (FaultInfo.DENGLIZI.equals(inputs[0])) {
				result = FaultInfo.test_denglizi;
			} else if (FaultInfo.DIANCHUCHEN.equals(inputs[0])) {
				result = FaultInfo.test_dianchuchen;
			} else if (FaultInfo.QITA.equals(inputs[0])) {
				result = FaultInfo.test_qita;
			}
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO 自动生成的方法存根
			super.onPostExecute(result);

			FaultInfo info = FaultInfo.objectFromData(result);
			faultlist.setAdapter(new FaultAdapter(FaultResult.this, info.getContent()));

		}
	}
}
