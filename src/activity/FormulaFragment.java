package activity;


import gov.huadian.electry.R;

import android.support.v4.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class FormulaFragment extends Fragment {
	final String[] formula = new String[] {"短路计算参数表", "厂用系统短路阻抗计算公式", "继电保护计算公式" };
	public static String CHANGYONGXITONG = "厂用系统短路阻抗计算公式";
	public static String JIDIANBAOHU = "继电保护计算公式";
	public static String DUANLUJISUAN = "短路计算参数表";
	private View mViewContent;
	private Intent mIntent = null;
	ListView listview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		if (mViewContent == null) {
			mViewContent = inflater.inflate(R.layout.activity_formula, parent,
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
		listview = (ListView) getActivity().findViewById(R.id.listview2);
	}

	private void initListener() {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				R.layout.list_text, formula);

		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int pos,
					long id) {
				String result = parent.getItemAtPosition(pos).toString();
				Bundle bundle = new Bundle();
				String info = null;
				if (result.equals(CHANGYONGXITONG)) {
					info = CHANGYONGXITONG;
				} else if (result.equals(JIDIANBAOHU)) {
					info = JIDIANBAOHU;
				}else if (result.equals(DUANLUJISUAN)) {
					info = DUANLUJISUAN;
				}
				// Log.i("dalian", "input info = " + info.toString());

				bundle.putSerializable("info", info);
				Intent mintent = new Intent();
				mintent.putExtras(bundle);
				mintent.setClass(FormulaFragment.this.getActivity(),
						FormulaResult.class);
				startActivity(mintent);
				// Toast.makeText(getActivity(), result, Toast.LENGTH_SHORT)
				// .show();
			}

		});
	}
}
