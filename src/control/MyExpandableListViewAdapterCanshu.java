package control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


import com.example.test.R;

public class MyExpandableListViewAdapterCanshu extends BaseExpandableListAdapter{
	 private String[] mparentList =null;
	 private Context mcontext =null;
	 private Map<String, List<String>> mdataset=null;
	 
	public   MyExpandableListViewAdapterCanshu(Context context,String[] parentList,Map<String, List<String>> dataset) 
	 {
	// TODO 自动生成的构造函数存根
		mdataset=dataset;
		mparentList=parentList;
		mcontext=context;
}
	
//获得某个父项的某个子项
	@Override
	public Object getChild(int parentPos, int childPos) {
		// TODO 自动生成的方法存根
		return mdataset.get(mparentList[parentPos]).get(childPos);
	}
//  获得某个父项的某个子项的id 
	@Override
	public long getChildId(int parentPos, int childPos) {
		// TODO 自动生成的方法存根
		return childPos;
	}

	@Override
	public View getChildView(int parentPos, int childPos,boolean b, View view,
			ViewGroup viewGroup) {
		// TODO 自动生成的方法存根
		 if (view == null) {  
		        view = LayoutInflater.from(mcontext).inflate(R.layout.expandablelist_formula_item, null);  
		    }  
		    view.setTag(R.layout.channel_expandablelistview, parentPos);  
		    view.setTag(R.layout.expandablelist_formula_item, childPos);  
		    TextView text1 = (TextView) view.findViewById(R.id.text1);  
//		    TextView text2 = (TextView) view.findViewById(R.id.text2);  
//		    TextView text3 = (TextView) view.findViewById(R.id.text3);  
//		    TextView text4 = (TextView) view.findViewById(R.id.text4);  
			text1.setText(mdataset.get(mparentList[parentPos]).get(childPos));  
//			text2.setText(mdataset.get(mparentList[parentPos]).get(childPos));  
//			text3.setText(mdataset.get(mparentList[parentPos]).get(childPos));  
//			text4.setText(mdataset.get(mparentList[parentPos]).get(childPos));  
		return view;
	}
//  获得某个父项的子项数目 
	@Override
	public int getChildrenCount(int parentPos) {
		// TODO 自动生成的方法存根
		return mdataset.get(mparentList[parentPos]).size();
	}
//  获得某个父项 
	@Override
	public Object getGroup(int parentPos) {
		// TODO 自动生成的方法存根
		return mdataset.get(mparentList[parentPos]);
	}
//  获得父项的数量  
	@Override
	public int getGroupCount() {
		// TODO 自动生成的方法存根
		return mdataset.size();
	}
//  获得某个父项的id  
	@Override
	public long getGroupId(int parentPos) {
		// TODO 自动生成的方法存根
		return parentPos;
	}
//  获得父项显示的view 

	@Override
	public View getGroupView(int parentPos, boolean b, View view, ViewGroup viewGroup) {
		// TODO 自动生成的方法存根
	    if (view == null) {  
//	        LayoutInflater inflater = (LayoutInflater) ManufacturerActivity  
//	                .this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	        view = LayoutInflater.from(mcontext).inflate(R.layout.channel_expandablelistview, null);  
	    }  
	    view.setTag(R.layout.channel_expandablelistview, parentPos);  
	    view.setTag(R.layout.expandablelist_formula_item, -1);  
	    TextView text = (TextView) view.findViewById(R.id.channel_group_name);  
	    text.setText(mparentList[parentPos]);
		return view;
	}
//  按函数的名字来理解应该是是否具有稳定的id，这个方法目前一直都是返回false，没有去改动过 
	@Override
	public boolean hasStableIds() {
		// TODO 自动生成的方法存根
		return true;
	}
//  子项是否可选中，如果需要设置子项的点击事件，需要返回true 
	@Override
	public boolean isChildSelectable(int i, int i1) {
		// TODO 自动生成的方法存根
		return true;
	}

}
