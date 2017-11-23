//package activity;
//
//import com.example.test.R;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.Toast;
//import android.widget.AdapterView.OnItemClickListener;
//
//public class WorkItemActivity extends Activity{
//	private ListView listview;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO 自动生成的方法存根
//		super.onCreate(savedInstanceState);
//	setContentView(R.layout.activity_workitem);
//	initView();
//	initListener();
//	}
//	private void initView() {
//		listview = (ListView)findViewById(R.id.worklist);
//	}
//	private void initListener() {
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(WorkItemActivity.this,
//				R.layout.list_text, ctype);
//
//		listview.setAdapter(adapter);
//
//		listview.setOnItemClickListener(new OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> parent, View arg1, int pos,
//					long id) {
//				String result = parent.getItemAtPosition(pos).toString();
//				Toast.makeText(WorkItemActivity.this, result, Toast.LENGTH_SHORT)
//						.show();
//			}
//
//		});
//	}
//}
