package activity;

import model.ContactInfo;
import model.FaultInfo;
import model.ManuInfo;

import gov.huadian.electry.R;

import android.support.v4.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class FaultFragment extends Fragment {
	final String[] ctype = new String[] { "直流系统故障", "励磁系统故障", "风冷控制箱故障",
			"发变组故障", "等离子故障", "电除尘故障", "其他故障" };
	private View mViewContent;
	private Intent mIntent = null;
	ListView listview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		if (mViewContent == null) {
			mViewContent = inflater.inflate(R.layout.activity_fault, parent,
					false);
		}
		parent = (ViewGroup) mViewContent.getParent();
		if (parent != null) {
			parent.removeView(mViewContent);
		}

		return mViewContent;
	}

	public void onActivityCreated(Bundle saveInstanceBundle) {
		super.onCreate(saveInstanceBundle);
		initView();
		initListener();
	}

	private void initView() {
		listview = (ListView) getActivity().findViewById(R.id.listview1);
	}

	private void initListener() {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				R.layout.list_text, ctype);

		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int pos,
					long id) {
				String result = parent.getItemAtPosition(pos).toString();
				Bundle bundle = new Bundle();
				String info = null;
				if (result.equals(FaultInfo.ZHILIUXITONG)) {
					info = FaultInfo.ZHILIUXITONG;
				} else if (result.equals(FaultInfo.LICIXITONG)) {
					info = FaultInfo.LICIXITONG;
				} else if (result.equals(FaultInfo.FENGLENGKONGZHIXIANG)) {
					info = FaultInfo.FENGLENGKONGZHIXIANG;
				} else if (result.equals(FaultInfo.FABIANZU)) {
					info = FaultInfo.FABIANZU;
				} else if (result.equals(FaultInfo.DENGLIZI)) {
					info = FaultInfo.DENGLIZI;
				} else if (result.equals(FaultInfo.DIANCHUCHEN)) {
					info = FaultInfo.DIANCHUCHEN;
				} else if (result.equals(FaultInfo.QITA)) {
					info = FaultInfo.QITA;
				} 
//				Log.i("dalian", "input info = " + info.toString());

				bundle.putSerializable("info", info);
				Intent mintent = new Intent();
				mintent.putExtras(bundle);
				mintent.setClass(FaultFragment.this.getActivity(), FaultResult.class);
				startActivity(mintent);
//				Toast.makeText(getActivity(), result, Toast.LENGTH_SHORT)
//						.show();
			}

		});
	}
}
