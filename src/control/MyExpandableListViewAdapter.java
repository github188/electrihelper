package control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.test.R;


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



public class MyExpandableListViewAdapter extends BaseExpandableListAdapter{
	 private String[] mparentList =null;
	 private Context mcontext =null;
	 private Map<String, List<String>> mdataset=null;
	 
	public   MyExpandableListViewAdapter(Context context,String[] parentList,Map<String, List<String>> dataset) 
	 {
	// TODO ���������������������������������
		mdataset=dataset;
		mparentList=parentList;
		mcontext=context;
}
	
//���������������������������������
	@Override
	public Object getChild(int parentPos, int childPos) {
		// TODO ���������������������������
		return mdataset.get(mparentList[parentPos]).get(childPos);
	}
//  ������������������������������������id 
	@Override
	public long getChildId(int parentPos, int childPos) {
		// TODO ���������������������������
		return childPos;
	}

	@Override
	public View getChildView(int parentPos, int childPos,boolean b, View view,
			ViewGroup viewGroup) {
		// TODO ���������������������������
		 if (view == null) {  
//		        LayoutInflater inflater = (LayoutInflater) mcontext  
//		                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
		        view = LayoutInflater.from(mcontext).inflate(R.layout.listview_search_item, null);  
		    }  
		    view.setTag(R.layout.channel_expandablelistview, parentPos);  
		    view.setTag(R.layout.listview_search_item, childPos);  
		    TextView text = (TextView) view.findViewById(R.id.search_item_info);  
			text.setText(mdataset.get(mparentList[parentPos]).get(childPos));  
		return view;
	}
//  ��������������������������������� 
	@Override
	public int getChildrenCount(int parentPos) {
		// TODO ���������������������������
		return mdataset.get(mparentList[parentPos]).size();
	}
//  ������������������ 
	@Override
	public Object getGroup(int parentPos) {
		// TODO ���������������������������
		return mdataset.get(mparentList[parentPos]);
	}
//  ���������������������  
	@Override
	public int getGroupCount() {
		// TODO ���������������������������
		return mdataset.size();
	}
//  ���������������������id  
	@Override
	public long getGroupId(int parentPos) {
		// TODO ���������������������������
		return parentPos;
	}
//  ���������������������view 

	@Override
	public View getGroupView(int parentPos, boolean b, View view, ViewGroup viewGroup) {
		// TODO ���������������������������
	    if (view == null) {  
//	        LayoutInflater inflater = (LayoutInflater) ManufacturerActivity  
//	                .this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	        view = LayoutInflater.from(mcontext).inflate(R.layout.channel_expandablelistview, null);  
	    }  
	    view.setTag(R.layout.channel_expandablelistview, parentPos);  
	    view.setTag(R.layout.listview_search_item, -1);  
	    TextView text = (TextView) view.findViewById(R.id.channel_group_name);  
	    text.setText(mparentList[parentPos]);
		return view;
	}
//  ���������������������������������������������������������id���������������������������������������false��������������������� 
	@Override
	public boolean hasStableIds() {
		// TODO ���������������������������
		return true;
	}
//  ������������������������������������������������������������������������������true 
	@Override
	public boolean isChildSelectable(int i, int i1) {
		// TODO ���������������������������
		return true;
	}

}
