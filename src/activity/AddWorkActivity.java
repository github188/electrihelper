package activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//import model.Cache;
import model.InfoWork;
import model.WorkerName;

import gov.huadian.electry.R;

//import control.CacheManager;
import control.NameGridAdapter;
import control.NameGridAdapter.ViewHolder;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AddWorkActivity extends Activity implements OnClickListener {
	final String[] COUNTRIES = new String[] { "刘庆", "邝中魁", "周伟才", "王宪天", "冯宇航",
			"左巽", "张超", "颜莎", "吕雪", "张冰洁", "宋瑶", "李娟", "曾鹏" };
	private EditText mEditText, editkeeptime, editcycletime;
	private Spinner mKeepSpinner, mCycleSpinner;
	private GridView mGridView;
	private NameGridAdapter mNameGridAdapter;
	private List<WorkerName> mlist;
	private Button mSave, mSelectall, mSelectnone, mSettime, mBack;
	private Intent intent = new Intent();
	private Bundle bundle = new Bundle();
	private String[] workname, starttime, keeptime, cycletime, workername;
	private String temp;
	private TextView mdate;
	private int year, month, day;
	private TextView test;
	private int checkNum;
	List<String> selectID, templist = new ArrayList<String>();
	private static String ZIDINGYI = "自定义";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addwork);
		getDate();
		init();
		initData();
		initListener();

	}

	private void getDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR); // 获取年月日时分秒
		month = cal.get(Calendar.MONTH); // 获取到的月份是从0开始计数
		day = cal.get(Calendar.DAY_OF_MONTH);
	}

	public void init() {
		mKeepSpinner = (Spinner) findViewById(R.id.keeptimespinner);
		mCycleSpinner = (Spinner) findViewById(R.id.cycletimespinner);
		mGridView = (GridView) findViewById(R.id.namecheckgrid);
		mSave = (Button) findViewById(R.id.worksavebutton);
		mEditText = (EditText) findViewById(R.id.editname);
		mdate = (TextView) findViewById(R.id.dialog_tv_date);
		mSettime = (Button) findViewById(R.id.setting);
		mSelectall = (Button) findViewById(R.id.selectall);
		mSelectnone = (Button) findViewById(R.id.selectnone);
		mBack = (Button) findViewById(R.id.back);
		test = (TextView) findViewById(R.id.test);
		editkeeptime = (EditText) findViewById(R.id.editkeeptime);
		editcycletime = (EditText) findViewById(R.id.editcycletime);

		mSettime.setOnClickListener(this);
		mSelectall.setOnClickListener(this);
		mSelectnone.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.setting:
			OnDateSetListener listener = new OnDateSetListener() {
				@Override
				public void onDateSet(DatePicker arg0, int year, int month,
						int day) {
					mdate.setText(year + "-" + (++month) + "-" + day); // 将选择的日期显示到TextView中,因为之前获取month直接使用，所以不需要+1，这个地方需要显示，所以+1
				}
			};
			DatePickerDialog dialog = new DatePickerDialog(
					AddWorkActivity.this, 0, listener, year, month, day);// 后边三个参数为显示dialog时默认的日期，月份从0开始，0-11对应1-12个月
			dialog.show();
			break;
		case R.id.selectall:
			selectAll();
			break;
		case R.id.selectnone:
			cancelselectall();
			break;
		default:
			break;
		}
	}

	public void initListener() {
		mBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				intent.setClass(AddWorkActivity.this,
						FragmentTabHostActivity.class);
				startActivity(intent);
			}
		});
		mKeepSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1,
					int pos, long arg3) {
				// TODO 自动生成的方法存根
				((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
				((TextView) parent.getChildAt(0)).setTextSize(15);
				Toast.makeText(AddWorkActivity.this, mKeepSpinner.getItemAtPosition(pos).toString() , Toast.LENGTH_SHORT).show();
				if (mKeepSpinner.getItemAtPosition(pos).toString().equals(ZIDINGYI)) {
					editkeeptime.setVisibility(View.VISIBLE);
					temp =editkeeptime.getText().toString();
					templist.add(temp.toString());
					keeptime = templist.toArray(new String[templist.size()]);
//					keeptime = editkeeptime.getText().toString();
				} else
//					keeptime = mKeepSpinner.getItemAtPosition(pos).toString();
					temp =mKeepSpinner.getItemAtPosition(pos).toString();
				templist.add(temp.toString());
				keeptime = templist.toArray(new String[templist.size()]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO 自动生成的方法存根

			}
		});
		mCycleSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1,
					int pos, long arg3) {
				// TODO 自动生成的方法存根
				((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
				((TextView) parent.getChildAt(0)).setTextSize(15);
				Toast.makeText(AddWorkActivity.this, mCycleSpinner.getItemAtPosition(pos).toString() , Toast.LENGTH_SHORT).show();
				if (mCycleSpinner.getItemAtPosition(pos).toString().equals(ZIDINGYI)) {
					editcycletime.setVisibility(View.VISIBLE);
//					cycletime = editcycletime.getText().toString();
					temp =editcycletime.getText().toString();
					templist.add(temp.toString());
					cycletime = templist.toArray(new String[templist.size()]);
				} else
//					cycletime = mCycleSpinner.getItemAtPosition(pos).toString();
					temp =mCycleSpinner.getItemAtPosition(pos).toString();
				templist.add(temp.toString());
				cycletime = templist.toArray(new String[templist.size()]);
			}
			

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO 自动生成的方法存根
			}
		});
		mSave.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				if (("".equals(mEditText.getText().toString()))
						|| ("".equals(mdate.getText().toString()))
						|| ("".equals(selectID.toString()))) {
					Toast.makeText(AddWorkActivity.this, "请填写以下全部内容!",
							Toast.LENGTH_LONG).show();
				} else {
					submit();
//					workname = String.valueOf(mEditText.getText().toString());
//					starttime = String.valueOf(mdate.getText().toString());	
//					workername = selectID.toString();
					temp =mEditText.getText().toString();
					templist.add(temp.toString());
					workname = templist.toArray(new String[templist.size()]);
					temp =mdate.getText().toString();
					templist.add(temp.toString());
					starttime = templist.toArray(new String[templist.size()]);
					temp =selectID.toString();
					templist.add(temp.toString());
					workername = templist.toArray(new String[templist.size()]);
					InfoWork info = new InfoWork(workname, starttime, keeptime,
							cycletime, workername);
//					Cache cache=new Cache();
//					 CacheManager.putCacheInfo(workname, starttime, keeptime,
//								cycletime, workername,cache,10,true);
					bundle.putSerializable("info", info);
					intent.putExtras(bundle);
					intent.setClass(AddWorkActivity.this, WorkListActivity.class);
					startActivity(intent);

				}
			}
		});
		mGridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int i,
					long arg3) {
				// TODO 自动生成的方法存根
				ViewHolder holder = (ViewHolder) view.getTag();
				holder.getmCheckBox().toggle();
				NameGridAdapter.getIsSelected().put(i,
						holder.getmCheckBox().isChecked());
				if (holder.getmCheckBox().isChecked() == true) {
					checkNum++;
				} else {
					checkNum--;
				}
				test.setText("已选中" + checkNum + "项");
			}

		});
	}

	public void initData() {
		mlist = new ArrayList<WorkerName>();
		for (int i = 0; i < COUNTRIES.length; i++) {
			WorkerName item = new WorkerName(COUNTRIES[i], i);
			mlist.add(item);
		}
		mNameGridAdapter = new NameGridAdapter(this, mlist);
		mGridView.setAdapter(mNameGridAdapter);
	}

	private void dataChanged() {
		mNameGridAdapter.notifyDataSetChanged();
		test.setText("已选中" + checkNum + "项");
	}

	/** * 全选 */
	private void selectAll() {
		for (int i = 0; i < mlist.size(); i++) {
			NameGridAdapter.getIsSelected().put(i, true);
		} // 数量设为list的长度
		checkNum = mlist.size();
		dataChanged();
	}

	/** * 全不选 */
	private void cancelselectall() {
		// 遍历list的长度，将已选的按钮设为未选
		for (int i = 0; i < mlist.size(); i++) {
			if (NameGridAdapter.getIsSelected().get(i)) {
				NameGridAdapter.getIsSelected().put(i, false);
				checkNum--;// 数量减1 }
			}
			dataChanged();
		}
	}

	/** * 反选 */
	// private void deselectall() {
	// // 遍历list的长度，将已选的设为未选，未选的设为已选
	// for (int i = 0; i < mlist.size(); i++) {
	// if (mNameGridAdapter.getIsSelected().get(i)) {
	// mNameGridAdapter.getIsSelected().put(i, false);
	// checkNum--;
	// } else {
	// mNameGridAdapter.getIsSelected().put(i, true);
	// checkNum++; }
	// } dataChanged();
	// }

	/** * 提交 */
	private void submit() {
		selectID.clear();
		for (int i = 0; i < NameGridAdapter.getIsSelected().size(); i++) {
			if (NameGridAdapter.getIsSelected().get(i)) {
				selectID.add(mlist.get(i).getString());
			}
		}
		// if (selectID.size() == 0) {
		// AlertDialog.Builder builder1 = new AlertDialog.Builder(
		// AddWorkActivity.this);
		// builder1.setMessage("没有选中任何记录");
		// builder1.show();
		// }
		// else { AlertDialog.Builder builder2 = new AlertDialog.Builder(
		// AddWorkActivity.this);
		// builder2.setMessage(selectID.toString());
		// builder2.show();
		// }
	}

}
