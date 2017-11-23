package activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.ContactInfo;
import model.ManuInfo;

import com.example.test.R;

import control.MyExpandableListViewAdapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactwayActivity extends Activity {
	private ExpandableListView mExpandableListView = null;
	private MyExpandableListViewAdapter mExpandableListViewAdapter = null;
	ViewHolder holder = null;
	private Button mBack;
	private Intent mintent;
	List<String> childrenList1, childrenList2, childrenList3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactway);

		initView();
		initListen();
		initData();

	}

	class ViewHolder {
		ImageView imageView;
		TextView childText, groupText;
	}

	private void initView() {
		mExpandableListView = (ExpandableListView) findViewById(R.id.expandlistview);
		mBack = (Button) findViewById(R.id.back);

	}

	private void initListen() {
		mExpandableListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView arg0, View arg1,
					int groupposition, long arg3) {
				// TODO 自动生成的方法存根
				if (mExpandableListView.isGroupExpanded(groupposition)) {
					mExpandableListView.expandGroup(groupposition);
				} else {
					mExpandableListView.collapseGroup(groupposition);
				}
				return false;

			}
		});
		mBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mintent.setClass(ContactwayActivity.this,
						FragmentTabHostActivity.class);
				startActivity(mintent);
			}
		});
		mExpandableListView.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView list, View v,
					int arg2, int arg3, long arg4) {
				// TODO 自动生成的方法存根
				Bundle bundle = new Bundle();
				String info = null;
				if (mExpandableListViewAdapter.getChild(arg2, arg3).toString()
						.equals(ContactInfo.CHANGLINGDAO)) {
					info = ContactInfo.CHANGLINGDAO;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.WEIHUBU)) {
					info = ContactInfo.WEIHUBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.BANGONGSHI)) {
					info = ContactInfo.BANGONGSHI;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.ZHENGZHIGONGZUOBU)) {
					info = ContactInfo.ZHENGZHIGONGZUOBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.RENZIBU)) {
					info = ContactInfo.RENZIBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.JIHUAYINGXIAOBU)) {
					info = ContactInfo.JIHUAYINGXIAOBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.CAIWUZICHANBU)) {
					info = ContactInfo.CAIWUZICHANBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.WULIAOBU)) {
					info = ContactInfo.WULIAOBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.SHENGCHANJISHUBU)) {
					info = ContactInfo.SHENGCHANJISHUBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.ANJIANBAOWEIBU)) {
					info = ContactInfo.ANJIANBAOWEIBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.YUNXINGBU)) {
					info = ContactInfo.YUNXINGBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.RANLIAOSHENGCHANBU)) {
					info = ContactInfo.RANLIAOSHENGCHANBU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.XIAOQU)) {
					info = ContactInfo.XIAOQU;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.QICHEBAN)) {
					info = ContactInfo.QICHEBAN;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ContactInfo.SHITANG)) {
					info = ContactInfo.SHITANG;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ManuInfo.SHEBEICHANGJIA)) {
					info = ManuInfo.SHEBEICHANGJIA;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ManuInfo.DIANKEYUAN)) {
					info = ManuInfo.DIANKEYUAN;
				} else if (mExpandableListViewAdapter.getChild(arg2, arg3)
						.toString().equals(ManuInfo.SHEJIYUAN)) {
					info = ManuInfo.SHEJIYUAN;
				}
				Log.i("dalian", "input info = " + info.toString());

				bundle.putSerializable("info", info);
				Intent mintent = new Intent();
				mintent.putExtras(bundle);
				mintent.setClass(ContactwayActivity.this, ContactResult.class);
				startActivity(mintent);
				return true;
			}
		});

	}

	private void initData() {
		Map<String, List<String>> dataset = new HashMap<String, List<String>>();
		String[] parentList = new String[] { "本厂人员联系方式", "外部协调人员联系方式", "设备密码" };
		childrenList1 = new ArrayList<String>();
		childrenList2 = new ArrayList<String>();
		childrenList3 = new ArrayList<String>();

		childrenList1.add("厂领导");
		childrenList1.add("办公室");
		childrenList1.add("政治工作部");
		childrenList1.add("人资部");
		childrenList1.add("计划营销部");
		childrenList1.add("财务资产部");
		childrenList1.add("物料部");
		childrenList1.add("生产技术部");
		childrenList1.add("安监保卫部");
		childrenList1.add("运行部");
		childrenList1.add("燃料生产部");
		childrenList1.add("维护部");
		childrenList1.add("小区");
		childrenList1.add("汽车班");
		childrenList1.add("食堂");
		childrenList2.add("设备厂家");
//		childrenList2.add("电科院");
//		childrenList2.add("设计院");
		childrenList3.add("DGT801发变组保护:801 / 8");
		childrenList3.add("EP980g系列南自保护装置:1000");		
		childrenList3.add("丹东华通测控/马保:5555/2007");
		childrenList3.add("南自多功能电度表:0008");
		childrenList3.add("杭州凯源多功能电度表:0001");
		childrenList3.add("科陆直流绝缘检察装置:688022");
		childrenList3.add("施耐德保护装置:无密码");
		childrenList3.add("国立智能BZT装置:0000");
		childrenList3.add("四方母线保护:8888");
		childrenList3.add("长园深瑞线路保护:700/800/483");
		childrenList3.add("南瑞线路保护:+左上-");
		childrenList3.add("故障录波装置:admin/admin");
		childrenList3.add("保安同期,机组同期:0000");
		childrenList3.add("220kV安稳装置:888888");
		childrenList3.add("南自测控装置:2000");
		childrenList3.add("艾默生直流充电装置:12345");
		childrenList3.add("ATyS双电源切换装置:0000/0001");
		childrenList3.add("500kV南自线路保护:99");
		childrenList3.add("东方日立变频装置:DHC,1234");
		dataset.put(parentList[0], childrenList1);
		dataset.put(parentList[1], childrenList2);
		dataset.put(parentList[2], childrenList3);

		mExpandableListViewAdapter = new MyExpandableListViewAdapter(
				getBaseContext(), parentList, dataset);
		mExpandableListView.setAdapter(mExpandableListViewAdapter);
		// for(int i = 0; i < mExpandableListViewAdapter.getGroupCount(); i++){
		//
		// // mExpandableListView.expandGroup(i);

	}

}
