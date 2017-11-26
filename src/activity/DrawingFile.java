package activity;

import java.util.ArrayList;

import gov.huadian.electry.R;


import android.app.Activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class DrawingFile extends Activity implements OnClickListener{
	private ListView filelist;
	private EditText unitEdit,numberEdit;
	private Button selectBt,insertBt,editBt;
	
 public static ArrayList<String> list = new ArrayList<String>();
//	    public static Cursor drawings;
//	    String path ="home/android/workspace/AndroidStudy/test/res/raw/drawing_data";
//	    private SQLiteDatabase db=new DrawingDbHelper(this,path,null,1){
//			@Override
//			public void onCreate(SQLiteDatabase arg0) {
//				// TODO 自动生成的方法存根		
//			}
//			@Override
//			public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
//				// TODO 自动生成的方法存根		
//			}}.getReadableDatabase();
@Override
protected void onCreate(Bundle savedInstanceState) {  
	// TODO 自动生成的方法存根
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_drawingfile);
}

    @Override
    protected void onResume() {
        super.onResume();
        initView();
        initData();
	};
	
	private void initView() {
		// TODO 自动生成的方法存根
		filelist= (ListView) findViewById(R.id.drawingfilelist);
		unitEdit=(EditText) findViewById(R.id.unit);
		numberEdit=(EditText) findViewById(R.id.number);
		selectBt=(Button) findViewById(R.id.select);
		insertBt=(Button) findViewById(R.id.insert);
		editBt=(Button) findViewById(R.id.edit);
	}

	private void initData() {
	// TODO 自动生成的方法存根
		
		
	    }

	@Override
	public void onClick(View v) {
		String unitStr,numberStr;
		// TODO 自动生成的方法存根
		switch (v.getId()){
		case R.id.select:
			String sql="select * from drawing where system=?";
//			drawings = db.rawQuery(sql, new String[] {"发变组"});
//			SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.drawingfile_list_item, drawings,
//	                new String[] {"fileclass", "filename","freshtime"},
//	                new int[] {R.id.fileimage, R.id.filename, R.id.freshtime}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
//			filelist.setAdapter(adapter);
		}
	}

	
}

