package activity;

import model.UserInfo1;

import gov.huadian.electry.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle ;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private EditText editUser, editNumber;
	private Button mLogin, mRegister;
	private Intent intent;
	private Bundle bundle;
	private String user, password;
	private UserInfo1 userInfo;
	private CheckBox mKeepuser, mKeeplogin;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		initView();
		sp = getSharedPreferences("userInfo", 0);
		String name = sp.getString("ID", "");
		String pass = sp.getString("PASSWORD", "");
		Boolean choseRemember = sp.getBoolean("remenmber", false);
		Boolean choseAutologin = sp.getBoolean("autologin", false);
		Toast.makeText(this, name, Toast.LENGTH_LONG).show();

		if (choseRemember) {
			editUser.setText(name);
			editNumber.setText(pass);
			mKeepuser.setChecked(true);
		}

		if (choseAutologin) {
			mKeeplogin.setChecked(true);
		}
		initListeners();
	}

	private void initListeners() {
		mLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// intent = getIntent();
				// bundle = intent.getExtras();
				// UserInfo userInfo = (UserInfo)
				// bundle.getSerializable("info");
				user = String.valueOf(editUser.getText().toString());
				password = String.valueOf(editNumber.getText().toString());
				SharedPreferences.Editor editor = sp.edit();
				UserInfo1.setID("430204199110046120");
				UserInfo1.setPassword("123456");
				if ((user.equals(UserInfo1.getID()) && password.equals(UserInfo1
						.getPassword()))) {
					Toast.makeText(LoginActivity.this, "登录成功!",
							Toast.LENGTH_LONG).show();
					editor.putString("ID", user);
					editor.putString("PASSWORD", password);
					if (mKeepuser.isChecked()) {
						editor.putBoolean("rememaber", true);
					} else {
						editor.putBoolean("rememaber", false);
					}

					if (mKeeplogin.isChecked()) {
						editor.putBoolean("autologin", true);
					} else {
						editor.putBoolean("autologin", false);
					}
					
					editor.commit();
					Intent intent = new Intent(LoginActivity.this,
							FragmentTabHostActivity.class);
					startActivity(intent);
				} else {
					Toast.makeText(LoginActivity.this, "请核实您的权限并输入正确的身份证号和密码!",
							Toast.LENGTH_LONG).show();
				}
			}
		});
	}
	
	private void initView() {
		editUser = (EditText) findViewById(R.id.editname);
		editNumber = (EditText) findViewById(R.id.editnumber);
		mLogin = (Button) findViewById(R.id.login);
		mRegister = (Button) findViewById(R.id.register);
		mKeeplogin = (CheckBox) findViewById(R.id.keeplogin);
		mKeepuser = (CheckBox) findViewById(R.id.keepuser);

	}

}
