package activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import model.SearchResult;

import com.example.test.R;

import control.PresentGridAdapter;
import control.SearchListAdapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.Toast;

public class DrawingActivity extends Activity {

	final String[] COUNTRIES = new String[] { "发变组保护", "厂用电系统", "直流系统",
			"RTU系统", "ECMS及NCS系统", "励磁系统", "UPS系统", "网控室", "等离子", "电除尘", "脱硫系统" };
	final int[] BITMAPS = { R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item,
			R.drawable.listview_second_item, R.drawable.listview_second_item };

	private GridView mSearchGrid = null;
	private ListView mSearchList = null;
	private Button mSearchButton = null;
	private Button mBack = null;
	private AutoCompleteTextView mSearchText = null;
	private Intent mintent = new Intent();

	@SuppressLint("UseSparseArrays")
	Map<Integer, SearchResult> maps = new HashMap<Integer, SearchResult>();
	private List<SearchResult> mList = null;//
	private SearchListAdapter mSearchAdapter = null;
	private PresentGridAdapter mPresentAdapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawing);
		initView();
		initListen();
		initData();
	}

	private void initView() {
		// TODO 自动生成的方法存根
		mSearchGrid = (GridView) findViewById(R.id.gridview1);
		mSearchList = (ListView) findViewById(R.id.listview1);
		mSearchButton = (Button) findViewById(R.id.drawingsearchbutton);
		mSearchText = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		mBack = (Button) findViewById(R.id.back);
	}

	private void initListen() {
		// TODO 自动生成的方法存根
		mSearchButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mSearchList.setAdapter(mSearchAdapter);
				mSearchGrid.setVisibility(View.INVISIBLE);
				mSearchList.setVisibility(View.VISIBLE);
			}
		});

		mBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mintent.setClass(DrawingActivity.this,
						FragmentTabHostActivity.class);
				startActivity(mintent);
			}
		});

		mSearchText.setOnKeyListener(new OnKeyListener() {
			@Override
			public boolean onKey(View arg0, int arg1, KeyEvent event) {
				// TODO 自动生成的方法存根
				if (mSearchText.getText().length() == 0) {
					mSearchGrid.setVisibility(View.VISIBLE);
					mSearchList.setVisibility(View.INVISIBLE);
				}
				return false;
			}
		});
		mSearchGrid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO 自动生成的方法存根
				switch(arg2){
				case 0:Toast.makeText(getApplicationContext(), "发变组保护", Toast.LENGTH_SHORT).show();
				startActivity(new Intent().setClass(getApplicationContext(), DrawingFile.class));
				break;
				case 1:Toast.makeText(getApplicationContext(), "厂用电系统", Toast.LENGTH_SHORT).show();break;
				case 2:Toast.makeText(getApplicationContext(), "直流系统", Toast.LENGTH_SHORT).show();break;
				case 3:Toast.makeText(getApplicationContext(), "RTU系统", Toast.LENGTH_SHORT).show();break;
				case 4:Toast.makeText(getApplicationContext(), "ECMS及NCS系统", Toast.LENGTH_SHORT).show();break;
				case 5:Toast.makeText(getApplicationContext(), "励磁系统", Toast.LENGTH_SHORT).show();break;
				case 6:Toast.makeText(getApplicationContext(), "UPS系统", Toast.LENGTH_SHORT).show();break;
				case 7:Toast.makeText(getApplicationContext(), "网控室", Toast.LENGTH_SHORT).show();break;
				case 8:Toast.makeText(getApplicationContext(), "等离子", Toast.LENGTH_SHORT).show();break;
				case 9:Toast.makeText(getApplicationContext(), "电除尘", Toast.LENGTH_SHORT).show();break;
				case 10:Toast.makeText(getApplicationContext(), "脱硫系统", Toast.LENGTH_SHORT).show();break;default:
				}
			}
		});
	}

	private void initData() {
		mList = new ArrayList<SearchResult>();
		for (int i = 0; i < COUNTRIES.length; i++) {
			SearchResult item = new SearchResult(BITMAPS[i], COUNTRIES[i]);
			mList.add(item);
		}
		mSearchAdapter = new SearchListAdapter(this, mList);
		mPresentAdapter = new PresentGridAdapter(this, mList);

		mSearchGrid.setAdapter(mPresentAdapter);
		mSearchList.setAdapter(mSearchAdapter);
		// Map<String, Object>
		// for(int i = 0; i < COUNTRIES.length; i++){
		// SearchResult item = new
		// SearchResult(R.drawable.listview_second_item,COUNTRIES[i]);
		// maps.put(i, item);
		//
		// //SearchResult result = maps.get(i);
		// }

	}

}
