package activity;

import java.io.File;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

 class DrawingDbHelper extends SQLiteOpenHelper {

		public DrawingDbHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(new CustomPathDatabaseContext(context, getDirPath()), name,
					factory, version);
		}

		/**
		 * 获取db文件在sd卡的路径
		 * 
		 * @return
		 */
		private static String getDirPath() {
			// TODO 这里返回存放db的文件夹的绝对路径
			return "";
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		}

	}
	class CustomPathDatabaseContext extends ContextWrapper {
		private String mDirPath;

		public  CustomPathDatabaseContext (Context base, String dirPath) {
			super(base);
			this.mDirPath = dirPath;
		}

		@Override
		public File getDatabasePath(String name) {

			File result = new File(mDirPath + File.separator + name);

			if (!result.getParentFile().exists()) {
				result.getParentFile().mkdirs();
			}
			return result;
		}

		@Override
		public SQLiteDatabase openOrCreateDatabase(String name, int mode,
				CursorFactory factory) {
			return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name),
					factory);
		}

		@Override
		public SQLiteDatabase openOrCreateDatabase(String name, int mode,
				CursorFactory factory, DatabaseErrorHandler errorHandler) {
			return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name)
					.getAbsolutePath(), factory, errorHandler);
		}
}