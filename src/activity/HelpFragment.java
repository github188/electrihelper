package activity;

import gov.huadian.electry.R;

import android.support.v4.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;


public class HelpFragment extends Fragment implements OnClickListener {
	private TextView mmaintenTV;
	private TextView msuggesTV;
	private Intent mIntent =new Intent();
	private View mViewContent;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		  if (mViewContent == null) {
	            mViewContent = inflater.inflate(R.layout.activity_help, parent, false);
	        }
	parent = (ViewGroup) mViewContent.getParent();
		if (parent != null) {
			parent.removeView(mViewContent);
		}
		return mViewContent;
	}
	public void onActivityCreated(Bundle saveInstanceBundle){
		super.onCreate(saveInstanceBundle);
		initView();
		initListener();
	}
	private void initView() {
		mmaintenTV = (TextView) getActivity().findViewById(R.id.maintenance);
		msuggesTV =(TextView) getActivity().findViewById(R.id.suggestion);
	}
	private void initListener() {
		mmaintenTV.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(),  MonthWorkActivity.class);
				startActivity(mIntent);
			}
		});

		msuggesTV.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mIntent.setClass(getActivity(), SuggestionActivity.class);
				startActivity(mIntent);
			}
		});
	}
	@Override
	public void onClick(View arg0) {
		// TODO 自动生成的方法存根
		
	}


}