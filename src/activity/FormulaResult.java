package activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.test.R;

import control.MyExpandableListViewAdapter;
import control.MyExpandableListViewAdapterCanshu;

import activity.ContactwayActivity.ViewHolder;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ExpandableListView.OnGroupClickListener;

public class FormulaResult extends Activity {

	private TextView htmlname;
	private Intent intent = new Intent();
	private Bundle bundle = new Bundle();
	private String info;
	private ExpandableListView mExpandableListView = null;
	private MyExpandableListViewAdapterCanshu mExpandableListViewAdapter = null;
	List<String> childrenList1, childrenList2, childrenList3;
	ViewHolder holder = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		intent = getIntent();
		bundle = intent.getExtras();
		info = (String) bundle.getSerializable("info");
		if (info.equals(FormulaFragment.CHANGYONGXITONG)) {
			setContentView(R.layout.activity_formularesult3);
		} else if (info.equals(FormulaFragment.JIDIANBAOHU)) {
			setContentView(R.layout.activity_formularesult2);
		}else if (info.equals(FormulaFragment.DUANLUJISUAN)) {
			setContentView(R.layout.activity_formularesult1);
			initView();
			initListener();
			initData();
		}
		htmlname = (TextView) findViewById(R.id.theme);
		htmlname.setText(info);

	}
	class ViewHolder {
		ImageView imageView;
		TextView childText, groupText;
	}

	private void initData() {
		// TODO 自动生成的方法存根
		Map<String, List<String>> dataset = new HashMap<String, List<String>>();
		String[] parentList = new String[] { "#1机组主设备参数", "#2机组主设备参数", "启备变设备参数" };
		childrenList1 = new ArrayList<String>();
		childrenList2 = new ArrayList<String>();
		childrenList3 = new ArrayList<String>();
		
		childrenList1.add("   1.发电机参数");
		childrenList1.add("额定容量:        733MVA");
		childrenList1.add("额定功率:        660MW");
		childrenList1.add("额定功率因数:      0.9");
		childrenList1.add("额定电压:       20kV");
		childrenList1.add("额定电流:      21169A");
		childrenList1.add("短路阻抗:       23.1%");
		childrenList1.add("中性点接地电阻:   0.45Ω");
		childrenList1.add("空载励磁电压:   139V(75°C)");
		childrenList1.add("空载励磁电流:    1480A");
		childrenList1.add("额定励磁电压:    445V(90°C)");
		childrenList1.add("额定励磁电流:   4534A");
		childrenList1.add("   2.主变参数");
		childrenList1.add("额定容量:      780MVA");
		childrenList1.add("额定电压:       242*2.5%/20kV");
		childrenList1.add("额定电流:      1860.9A/22516.7A");
		childrenList1.add("短路阻抗:      15.74%");
		childrenList1.add("连接组别:      YN,d11");
		childrenList1.add("   3.高厂变参数");
		childrenList1.add("额定容量:      54/31.5-31.5MVA     ");
		childrenList1.add("额定电压:      20±2*2.5%/6.3-6.3kV  " );
		childrenList1.add("额定电流:      1558.8A/2886.8-2886.8A");
		childrenList1.add("连接组别:      Dyn1-yn1    ");
		childrenList1.add("短路阻抗:       9.45%");
		childrenList1.add("   4.励磁变参数");
		childrenList1.add("额定容量:      3*2400kVA     连接组别:     Yd11");
		childrenList1.add("额定电流:      208A/4399A     短路阻抗:       8.3%");
		childrenList1.add("额定电压:   20/(根号3*0.945)kV");
		childrenList1.add("   5.互感器参数");
		childrenList1.add("机端TA:      25000/1");
		childrenList1.add("中性点TA:     25000/1");
		childrenList1.add("主变高压侧TA:      3000/1");
		childrenList1.add("主变高压侧零序TA:    1000/1");
		childrenList1.add("高厂变高压侧TA:   5000/1");
		childrenList1.add("高压侧分支TA:   4000/1");
		childrenList1.add("高厂变分支零序TA:   200/1");
		childrenList1.add("励磁变一次侧TA:   600/5");
		childrenList1.add("励磁变二次侧TA:   6000/5"); 
		childrenList1.add("机端TV:            主变高压侧TV:      ");
		childrenList1.add("高厂变低压侧分支TV:          中性点抽取电压:    "); 
		
		childrenList2.add("   1.发电机参数");
		childrenList2.add("额定容量:      733MVA        ");
		childrenList2.add("额定功率:       660MW");
		childrenList2.add("额定功率因数:     0.9          ");
		childrenList2.add("额定电压:       20kW");
		childrenList2.add("额定电流:      21169A   ");
		childrenList2.add("次暂态短路阻抗(饱和值):    23.1%");
		childrenList2.add("中性点接地电阻:   0.45Ω       ");
		childrenList2.add("空载励磁电压:    139V(75°C)");
		childrenList2.add("空载励磁电流:    1480A       ");
		childrenList2.add("额定励磁电压:    445V(90°C)");
		childrenList2.add("额定励磁电流:   4534A");
		childrenList2.add("   2.主变参数");
		childrenList2.add("额定容量:      780MVA");
		childrenList2.add("额定电压:   (525±2*2.5%)/20kV");
		childrenList2.add("额定电流:     857.8A/22516.7A   ");
		childrenList2.add("短路阻抗:        15.85%");
		childrenList2.add("连接组别:      YN,d11    ");
		childrenList2.add("   3.高厂变参数");
		childrenList2.add("额定容量:      54/31.5-31.5MVA     ");
		childrenList2.add("额定电压:      20±2*2.5%/6.3-6.3kV  " );
		childrenList2.add("额定电流:      1558.8/2886.8-2886.8A");
		childrenList2.add("连接组别:      Dyn1-yn1    ");
		childrenList2.add("半穿越阻抗:       17.61,17.78%");
		childrenList2.add("   4.励磁变参数");
		childrenList2.add("额定容量:      3*2400kVA     连接组别:     Yd11");
		childrenList2.add("额定电流:      208A/4399A     短路阻抗:       8.33%");
		childrenList2.add("额定电压:      20/0.945kV");
		childrenList2.add("   5.互感器参数");
		childrenList2.add("机端TA:      25000/1");
		childrenList2.add("中性点TA:     25000/1");
		childrenList2.add("主变高压侧TA:      4000/1");
		childrenList2.add("主变高压侧零序TA:    500/1");
		childrenList2.add("高厂变高压侧TA:   5000/1");
		childrenList2.add("高压侧分支TA:   4000/1");
		childrenList2.add("高厂变分支零序TA:   200/1");
		childrenList2.add("励磁变一次侧TA:   600/5");
		childrenList2.add("励磁变二次侧TA:   6000/5"); 
		childrenList2.add("机端TV:            主变高压侧TV:      ");
		childrenList2.add("高厂变低压侧分支TV:          中性点抽取电压:    "); 
		childrenList2.add("中性点配电变压器变比:  "); 
		
		childrenList3.add("   1.启备变参数");
		childrenList3.add("型号:     SFFZ-CY-54000/220");
		childrenList3.add("额定容量:      54/31.5-31.5/18MVA");
		childrenList3.add("额定电压和分接范围:       230±8×1.25%/6.3-6.3/10.5kV");
		childrenList3.add("短路阻抗(高压-低压1):     19.33%");
		childrenList3.add("短路阻抗(高压-低压2):     19.34%");
		childrenList3.add("接线组别:   YN,yn0,yn0,d11   ");
		childrenList3.add("高压侧中性点运行方式:   直接接地");
		childrenList3.add("低压侧中性点运行方式:   17.3Ω电阻接地");
		childrenList3.add("   2.TA变比");
		childrenList3.add("220kV启备变间隔:      2*400/1A     ");
		childrenList3.add("启备变高压侧零序:     50~150/1A");
		childrenList3.add("启备变低压侧零序:     200/1  ");
		childrenList3.add("启备变6kV1A,1B,2A,2B:       4000/1");
		childrenList3.add("   3.TV变比");
		childrenList3.add("220kV 母线 TVI,TVII:      ");
		childrenList3.add("起备变 6kV 分支 PT:      " );


		
		dataset.put(parentList[0], childrenList1);
		dataset.put(parentList[1], childrenList2);
		dataset.put(parentList[2], childrenList3);

		mExpandableListViewAdapter = new MyExpandableListViewAdapterCanshu(
				getBaseContext(), parentList, dataset);
		mExpandableListView.setAdapter(mExpandableListViewAdapter);
	}

	private void initListener() {
		// TODO 自动生成的方法存根
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
		
	}

	private void initView() {
		// TODO 自动生成的方法存根
		mExpandableListView = (ExpandableListView) findViewById(R.id.expandlistview2);
	}
}
