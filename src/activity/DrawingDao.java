package activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class DrawingDao extends SQLiteOpenHelper{

    private static SQLiteDatabase db;

    public static  SQLiteDatabase getInstance(Context context){
        if(db == null){
            db = new DrawingDao(context).getReadableDatabase();
        }
        return db;
    }

    private DrawingDao(Context context){
        super(context, Environment.getExternalStorageDirectory() + "/Drawing.data",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO 自动生成的方法存根
		
	}
}