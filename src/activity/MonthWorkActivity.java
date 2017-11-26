package activity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.InfoWork;

import gov.huadian.electry.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MonthWorkActivity extends Activity{
	private Intent intent=new Intent();
	private Bundle bundle=new Bundle();
	private CheckBox mRenwu1,mRenwu2,mRenwu3;
	private Spinner mWorkername,mSituation;
	private String workername,situation,describle;
	private EditText mDescrible;
	private Button mCheckList;
	private CalendarView mCalendarView;
	private Calendar cal= Calendar.getInstance();
	private SimpleDateFormat sdf= new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
	private String time;
	protected String[] mstarttime,mworkname,mkeeptime,mcycletime, mworkername;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_monthwork);
		initView();
		initListener();
	}

	private void initListener() {
		// TODO 自动生成的方法存根
		mCalendarView.setOnDateChangeListener(new OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                    int dayOfMonth) {
             
            }
        });
		mCheckList.setOnClickListener(new OnClickListener() {
	

			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				InfoWork info = new InfoWork( mworkname,  mstarttime,  mkeeptime,
						 mcycletime,  mworkername);
				bundle.putSerializable("info", info);
				intent = new Intent();
				intent.putExtras(bundle);
				intent.setClass(MonthWorkActivity.this,WorkListActivity.class);
				startActivity(intent);
			}
		});
		
		mWorkername.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1,
					int pos, long arg3) {
				// TODO 自动生成的方法存根
				((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
				((TextView) parent.getChildAt(0)).setTextSize(15);
				Toast.makeText(MonthWorkActivity.this, mWorkername.getItemAtPosition(pos).toString() , Toast.LENGTH_SHORT).show();
					workername = mWorkername.getItemAtPosition(pos).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO 自动生成的方法存根

			}
		});
		
		mSituation.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1,
					int pos, long arg3) {
				// TODO 自动生成的方法存根
				((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
				((TextView) parent.getChildAt(0)).setTextSize(15);
				Toast.makeText(MonthWorkActivity.this, mSituation.getItemAtPosition(pos).toString() , Toast.LENGTH_SHORT).show();
					situation = mSituation.getItemAtPosition(pos).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO 自动生成的方法存根

			}
		});
		
		    
		
	}

	private void initView() {
		// TODO 自动生成的方法存根
		mRenwu1 =(CheckBox)findViewById(R.id.renwu1);
		mRenwu2 =(CheckBox) findViewById(R.id.renwu2);
		mRenwu3 =(CheckBox) findViewById(R.id.renwu3);
		mWorkername=(Spinner) findViewById(R.id.workername);
		mSituation=(Spinner) findViewById(R.id.situation);
		mDescrible =(EditText) findViewById(R.id.describle);
		mCalendarView =(CalendarView) findViewById(R.id.calendarView1);
		mCheckList =(Button) findViewById(R.id.checklist);
		
		 describle= mDescrible.getText().toString();
	}

}

