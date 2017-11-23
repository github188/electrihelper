package control;

import java.util.List;

import com.example.test.R;

import model.SearchResult;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchListAdapter extends BaseAdapter {
	private List<SearchResult> mList = null;
	private Context mContext = null;
	
	public SearchListAdapter (Context context, List<SearchResult> list) {
		// TODO 自动生成的构造函数存根
		mList = list;
		mContext = context;
	}

	// 表示一共有几行要显示
	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		if (mList == null)
			return 0;
		else
			return mList.size();
	}

	// 每一行的数据
	@Override
	public Object getItem(int arg0) {
		// TODO 自动生成的方法存根
		if (mList == null)
			return null;
		else
			return mList.get(arg0);
	}

	// 表示第几行
	@Override
	public long getItemId(int arg0) {
		// TODO 自动生成的方法存根
		return arg0;
	}

	// 每一行显示内容
	/**
	 * i第几行
	 * view 这一行的视图
	 */
	
	class ViewHolder{
		ImageView itemImage;
		TextView itemInfo;
	}
	
	@Override
	public View getView(int i, View view, ViewGroup arg2) {
		// TODO 自动生成的方法存根
		//1.视图声明
		ViewHolder holder = null;
		if(view == null){//无法复用，一般用于视图初始化时候
		    holder = new ViewHolder();//视图
		//2.1视图绑定
			view = LayoutInflater.from(mContext).inflate(R.layout.listview_search_item, null);//setcontentview
			holder.itemImage = (ImageView)view.findViewById(R.id.search_item_image);
			holder.itemInfo = (TextView)view.findViewById(R.id.search_item_info);
	    //2.2视图保存
			view.setTag(holder);
		}else{//可以复用，一般用于上下滑动的时候
		//3 视图复用
			holder = (ViewHolder)view.getTag();
		}
		//4.视图实际设置内容
		holder.itemImage.setBackgroundResource(R.drawable.listview_second_item);
		holder.itemInfo.setText(mList.get(i).getItemInfo());
		return view;
	}
	
	//每一行


}
