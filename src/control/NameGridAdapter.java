package control;

import java.util.HashMap;
import java.util.List;

import model.WorkerName;

import com.example.test.R;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class NameGridAdapter extends BaseAdapter {
	// final Char[] COUNTRIES = new Char[]{ "刘庆", "邝中魁", "周伟才", "王宪天", "冯宇航",
	// "左巽", "张超", "颜莎", "吕雪", "张冰洁", "宋瑶", "李娟", "曾鹏" };
	private Context mcontext = null;
	private List<WorkerName> mlist = null;
	// private List<integer> checkBoxIDList;
	// private LayoutInflater inflater = null;
	private  static HashMap<Integer, Boolean> isSelected;

	public static  HashMap<Integer, Boolean> getIsSelected() {
		return isSelected;
	}

	public static void setIsSelected(HashMap<Integer, Boolean> isSelected) {
		NameGridAdapter.isSelected = isSelected;
	}

	@SuppressLint("UseSparseArrays")
	public NameGridAdapter(Context context, List<WorkerName> list) {
		mcontext = context;
		mlist = list;
		// inflater = LayoutInflater.from(context);
		isSelected = new HashMap<Integer, Boolean>();
		initDate();
	}

	private void initDate() {
		for (int i = 0; i < mlist.size(); i++) {
			getIsSelected().put(i, false);
		}
	}

	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		if (mlist.size() == 0) {
			return 0;
		} else
			return mlist.size();

	}

	@Override
	public Object getItem(int arg0) {
		// TODO 自动生成的方法存根
		if (mlist == null)
			return null;
		else
			return mlist.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO 自动生成的方法存根
		return 0;
	}

	public class ViewHolder {
	    public CheckBox mCheckBox;
//		TextView name;
		TextView ID;

		public CheckBox getmCheckBox() {
			return mCheckBox;
		}

		public void setmCheckBox(CheckBox mCheckBox) {
			this.mCheckBox = mCheckBox;
		}
	}

	@Override
	public View getView(int i, View view, ViewGroup group) {
		// TODO 自动生成的方法存根
		final ViewHolder viewholder;
		if (view == null) {
			viewholder = new ViewHolder();
			view = LayoutInflater.from(mcontext).inflate(
					R.layout.gridview_name_item, null);
			viewholder.mCheckBox=((CheckBox) view
					.findViewById(R.id.namecheckcell));
//			viewholder.ID=(TextView)view.findViewById(R.id.item_ID);
			view.setTag(viewholder);
		} else {
			viewholder = (ViewHolder) view.getTag();
		};
		viewholder.getmCheckBox().setText(mlist.get(i).getString());
		viewholder.mCheckBox.setChecked(getIsSelected().get(i));
//		viewholder.ID.setText(mlist.get(i).getId());
		return view;
	}
}
