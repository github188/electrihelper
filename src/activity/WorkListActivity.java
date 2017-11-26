package activity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import model.Cache;
import model.InfoWork;

import gov.huadian.electry.R;

//import control.CacheManager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class WorkListActivity extends Activity {
	private Intent intent = new Intent();
	private Bundle bundle = new Bundle();
	// private String mWorkName, mStartTime, mKeepTime, mCycleTime,mWorkerName;
	private ListView listview;
	List<String> listA, listB = new ArrayList<String>();
	String[] worknamelist, origin = new String[] {};
	private Button addwork;
	private InfoWork minfo;
	private String[] info,b;
	private String temp,tempString,a;
//	private Cache cache;
	private String[] workName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_worklist);
		intent = getIntent();
		bundle = intent.getExtras();
		minfo = (InfoWork) bundle.getSerializable("info");
		info=minfo.getWorkname();
		tempString=Arrays.toString(info);
		a=Arrays.toString(b);
//		cache=CacheManager.getCacheInfo(workName);
//		if (tempString.equals(a)) {
//			if ((Arrays.toString(cache.getWorkName())).equals(a)) {
//				worknamelist = new String[] { "暂无工作任务,请点击右上角按钮添加工作任务!" };
//			} else {
//				worknamelist = cache.getWorkerName();
//			}
//		} else {
//			origin = cache.getWorkerName();
//			listA = Arrays.asList(origin);
//			listB = new ArrayList<String>(listA);
//			info = minfo.getWorkname();
//			temp = info.toString();
//			listB.add(temp);
//			worknamelist = listB.toArray(new String[listB.size()]);
//		}
		;
		initView();
		// mWorkName =info.getWorkname();
		// mStartTime =info.getStarttime();
		// mCycleTime =info.getCycletime();
		// mWorkerName =info.getWorkername();
		// mKeepTime =info.getKeeptime();
		initListener();

	}

	private void initListener() {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.activity_workitem, worknamelist);

		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int pos,
					long id) {
//				intent.setClass(WorkListActivity.this, ResultActivity.class);
// 				startActivity(intent);
			}

		});
		listview.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO 自动生成的方法存根
				showListDialog() ;
				return true;
			}
		});
		addwork.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根

				intent.setClass(WorkListActivity.this, AddWorkActivity.class);
				startActivity(intent);
			}
		});
	}
	
	 private void showListDialog() {
	        final String[] items = {"查看","编辑"};
	        AlertDialog.Builder builer = new AlertDialog.Builder(this)
	                .setTitle("您希望")
	                //设置列表项
	                .setItems(items, new DialogInterface.OnClickListener() {
	                    //参数2：被点击项的索引
	                    @Override
	                    public void onClick(DialogInterface dialogInterface, int i) {
	                     if(i==0){
	                    	 intent.setClass(WorkListActivity.this, ResultActivity.class);
	         				startActivity(intent);
	                     }else{
	                    	 intent.setClass(WorkListActivity.this, AddWorkActivity.class);
		         				startActivity(intent);
	                     }
	                    }
	                });
	        builer.show();
	    }


	private void initView() {
		// TODO 自动生成的方法存根
		listview = (ListView) findViewById(R.id.worklist);
		addwork = (Button) findViewById(R.id.addworkbutton);
	}



}
