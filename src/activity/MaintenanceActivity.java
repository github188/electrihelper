package activity;

import java.util.Calendar;

import gov.huadian.electry.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.Toast;

public class MaintenanceActivity extends Activity{
//	private TextView mInfoTV;
//	private Intent mintent= new Intent();
	private DatePicker datepicker;
	private TimePicker timepicker;
//	private Context context=getBaseContext();
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maintenance);
		initView();
		initData();
		initListener();
	}
	
	private void initView(){
		DatePicker datepicker=(DatePicker)findViewById(R.id.datePicker1);
		TimePicker timepicker=(TimePicker)findViewById(R.id.timePicker1);
		timepicker.setIs24HourView(true);
	}
	
	private void initData(){
		Calendar calendar=Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month=calendar.get(Calendar.MONTH);
		day=calendar.get(Calendar.DAY_OF_MONTH);
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		minute=calendar.get(Calendar.MINUTE);
		
	}
	
	private void initListener(){
		datepicker.init(year, month, day, new OnDateChangedListener(){
			@Override
			public void onDateChanged(DatePicker arg0,int year,int month,int day){
			MaintenanceActivity.this.year=year;
			MaintenanceActivity.this.month=month;
			MaintenanceActivity.this.day=day;
			show(year,month,day,hour,minute);
			}
		});
		
		timepicker.setOnTimeChangedListener(new OnTimeChangedListener(){
			@Override
			public void onTimeChanged(TimePicker view,int hourOfDay,int minute){
			MaintenanceActivity.this.hour=hourOfDay;
			MaintenanceActivity.this.minute=minute;
			show(year,month,day,hour,minute);
			}
		});
	}
	
	private void show(int year,int month,int day,int hour,int minute){
		String str=year+""+(month+1)+""+day+""+hour+""+minute;
		Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
	}
}

