package activity;

import gov.huadian.electry.R;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment implements OnClickListener {
	private View mViewContent;
	private TextView mInfoTv1;
	private TextView mInfoTv2;
	private TextView mInfoTv3;
	private TextView mInfoTv4;
	private Intent mIntent = new Intent();
	private Button mErweima;

	// private AutoCompleteTextView textView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		if (mViewContent == null) {
			mViewContent = inflater.inflate(R.layout.activity_home, parent,
					false);
		}
		parent = (ViewGroup) mViewContent.getParent();
		if (parent != null) {
			parent.removeView(mViewContent);
		}

		return mViewContent;
	}

	public void onActivityCreated(Bundle saveInstanceBundle) {
		super.onCreate(saveInstanceBundle);
		initView();
		initListener();
	}

	private void initView() {
		mInfoTv1 = (TextView) getActivity().findViewById(R.id.drawingtext);
		mInfoTv2 = (TextView) getActivity().findViewById(R.id.instructiontext);
		mInfoTv3 = (TextView) getActivity()
				.findViewById(R.id.constantvaluetext);
		mInfoTv4 = (TextView) getActivity().findViewById(R.id.manufacturertext);
		mErweima=(Button)getActivity().findViewById(R.id.erweima);
	}

	private void initListener() {

		mInfoTv1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(), DrawingActivity.class);
				startActivity(mIntent);
			}
		});

		mInfoTv2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(), InstructionActivity.class);
				startActivity(mIntent);
			}
		});

		mInfoTv3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(), ConstantvalueActivity.class);
				startActivity(mIntent);
			}
		});

		mInfoTv4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(), ContactwayActivity.class);
				startActivity(mIntent);
			}
		});
//		mErweima.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View arg0) {
//				mIntent.setClass(getActivity(), CameraFrame.class);
//				startActivity(mIntent);
//			}
//		});
	}

	@Override
	public void onClick(View v) {
		// TODO 自动生成的方法存根
		switch(v.getId()){
        case R.id.erweima:
            DrawerLayout drawerLayout;
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.activity_fragmenttabhost,null);
            drawerLayout=(DrawerLayout)view.findViewById(R.id.drawerLayout);
    		
			drawerLayout.openDrawer(Gravity.LEFT);
            break;
	}

	// private void initData() {
	// // manager = getSupportFragmentManager();
	// addFragmentToStack(new FragmentParent1());
	//
	// }

}
}
