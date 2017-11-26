package activity;

import model.InfoWork;
import model.InforSuggestion;

import gov.huadian.electry.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class ResultActivity extends Activity {
	private TextView mWorkName, mStartTime, mKeepTime, mCycleTime,mWorkerName;
	private Intent intent = new Intent();
	private Bundle bundle =new Bundle();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		mWorkName = (TextView) findViewById(R.id.appearworkname);
		mStartTime = (TextView) findViewById(R.id.appearstarttime);
		mKeepTime = (TextView) findViewById(R.id.appearkeeptime);
		mCycleTime = (TextView) findViewById(R.id.appearcycletime);
	    mWorkerName=(TextView)findViewById(R.id.appearworkername);
		intent = getIntent();
		bundle = intent.getExtras();
		InfoWork info = (InfoWork) bundle.getSerializable("info");
//		InforSuggestion info=(InforSuggestion)bundle.getSerializable("info");
		mWorkName.setText("工作名称是" + info.getWorkname());
		mStartTime.setText("工作开始时间是" + info.getStarttime());
		mKeepTime.setText("工作持续时间是" + info.getKeeptime());
		mCycleTime.setText("工作周期是" +info.getCycletime());
//		mWorkName.setText("您的意见或建议是" + info.getMsuggestion());
//		mStartTime.setText("工作开始时间是" + info.getMhandle());
//		mKeepTime.setText("工作持续时间是" +info.getMhowlong());
		 mWorkerName.setText("工作负责人是"+info.getWorkername());

	}

}
