package activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.SearchResult;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.GridView;

import com.example.test.R;

import control.PresentGridAdapter;
import control.SearchListAdapter;

public class InstructionActivity extends Activity{
	final String[] COUNTRIES = new String[] { "发变组保护", "厂用电系统", "直流系统", "RTU系统",
			"ECMS及NCS系统", "励磁系统", "UPS系统", "网控室" ,"等离子","电除尘","脱硫"};
	final int[] BITMAPS = { R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item };

	private GridView mSearchGrid = null;
//	private ListView mSearchList = null;
	private Button mSearchButton = null;
//	private AutoCompleteTextView mSearchText =null;
//	 Map<Integer, SearchResult> maps = new HashMap<Integer, SearchResult>();
		private List<SearchResult> mList = null;//
		private SearchListAdapter mSearchAdapter = null;
		private PresentGridAdapter mPresentAdapter =null;
		private Button mback;
		private Intent mintent=new Intent();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_instruction);
		initView();
		initListener();
		initData();
	}
	private void initView() {
		// TODO 自动生成的方法存根
		mSearchGrid = (GridView) findViewById(R.id.instrsearchlistview);
		mSearchButton = (Button) findViewById(R.id.instrsearchbutton);
		mback=(Button)findViewById(R.id.back);
	}

	private void initListener() {
		// TODO 自动生成的方法存根
		mSearchButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mSearchGrid.setAdapter(mSearchAdapter);
			}
		});
		mback.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mintent.setClass(InstructionActivity.this,FragmentTabHostActivity.class);
				startActivity(mintent);
			}
		});
}
	private void initData() {
		mList= new ArrayList<SearchResult>();
		for(int i = 0; i < COUNTRIES.length; i ++){
			SearchResult item = new SearchResult(BITMAPS[i], COUNTRIES[i]);
			mList.add(item);
		}
		mSearchAdapter = new SearchListAdapter (this, mList);
		mSearchGrid.setAdapter(mPresentAdapter);	
			}
	}
