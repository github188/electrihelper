package activity;

import model.InforSuggestion;

import gov.huadian.electry.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SuggestionActivity extends Activity{
//	private TextView mInfoTV,mTime;
	private Button mInfoBV;
	private Intent mIntent = new Intent();
	private EditText mInfoET1, mInfoET2;
	private Spinner spinner;
	private String msuggestion,mhandle,mhowlong;
	private Bundle bundle=new Bundle();
	private Button mBack;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suggestion);
		intview();
		intListener();

	}

	private void intview() {

		mInfoBV = (Button) findViewById(R.id.suggestionsavebutton);
		mBack=(Button)findViewById(R.id.back);
		mInfoET1 = (EditText) findViewById(R.id.suggestionedit);
		mInfoET2 = (EditText) findViewById(R.id.handleedit);
		spinner = (Spinner) findViewById(R.id.timespinner);
		spinner.getSelectedItem();
	}

	public class Info {
		EditText suggestioninfo;
		EditText handleinfo;
	}

	private void intListener() {
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View arg1,
					int pos, long id) {

				((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
				((TextView) parent.getChildAt(0)).setTextSize(12);
				mhowlong = spinner.getItemAtPosition(pos).toString();
//				mTime.setText(mhowlong);

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		mBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				mIntent.setClass(SuggestionActivity.this,FragmentTabHostActivity.class);
				startActivity(mIntent);
			}
		});

		mInfoBV.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				InforSuggestion info = new InforSuggestion();
				if (("".equals((mInfoET1.getText().toString())))
						|| ("".equals((mInfoET2.getText().toString())))) {
					Toast.makeText(SuggestionActivity.this, "请填写完整您的意见或建议!",
							Toast.LENGTH_LONG).show();
					return;
				} else {
					msuggestion=mInfoET1.getText().toString();
					mhandle=mInfoET2.getText().toString();
					info=new InforSuggestion(msuggestion,mhandle,mhowlong);
					bundle.putSerializable("info", info);
					mIntent.putExtras(bundle);
					mIntent.setClass(SuggestionActivity.this,
							ResultActivity.class);
					startActivity(mIntent);
				}

			}

		});

	
	}

}
