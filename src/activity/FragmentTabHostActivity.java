package activity;

import com.example.test.R;


import android.content.Intent;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class FragmentTabHostActivity extends FragmentActivity implements
		OnTabChangeListener,OnClickListener {
	private FragmentTabHost tabHost;
	private TabSpec chat;
	private TabSpec contact;
	private TabSpec discover;
	private TabSpec me;
	private TabIndicatorView chat_view;
	private TabIndicatorView contact_view;
	private TabIndicatorView discover_view;
	private TabIndicatorView me_view;
	private DrawerLayout drawerLayout;
	private Button settingButton,btn_setting,btn_recent,
	btn_waitforhandle,btn_text,btn_storehouse;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO ���������������������������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragmenttabhost);
		initView();
		initListener();
		tabHost.setup(this, getSupportFragmentManager(),
				android.R.id.tabcontent);
		addSpec();
		tabHost.setOnTabChangedListener(this);
//	tabHost.getTabWidget().setDividerDrawable(android.R.color.black);

	}
	public void initView(){
		tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
//		View view = LayoutInflater.from(FragmentTabHostActivity.this).inflate(R.layout.activity_home,null);
//		settingButton=(Button)view.findViewById(R.id.setting);
		btn_setting=(Button)findViewById(R.id.btn_left1);
		btn_recent=(Button)findViewById(R.id.btn_left2);
		btn_waitforhandle=(Button)findViewById(R.id.btn_left3);
		btn_text=(Button)findViewById(R.id.btn_left4);
		btn_storehouse=(Button)findViewById(R.id.btn_left5);
	}
	public void initListener(){
//		settingButton.setOnClickListener(this);
		btn_setting.setOnClickListener(this);
		btn_recent.setOnClickListener(this);
		btn_waitforhandle.setOnClickListener(this);
		btn_text.setOnClickListener(this);
		btn_storehouse.setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO ���������������������������
		return super.onCreateOptionsMenu(menu);
	}

	private void addSpec() {
		chat = tabHost.newTabSpec("TAG_CHAT");
		chat_view = new TabIndicatorView(this);
		chat_view.setIcon(R.drawable.focus, R.drawable.a);
		chat_view.setIconON();
		chat_view.setUnReadNum(0);
		chat_view.setTitle("������");
		chat.setIndicator(chat_view);
		tabHost.addTab(chat, HomeFragment.class, null);

		contact = tabHost.newTabSpec("TAG_CONN");
		contact_view = new TabIndicatorView(this);
		contact_view.setIcon(R.drawable.focus, R.drawable.v);
		contact_view.setIconOff();
		contact_view.setUnReadNum(0);
		contact_view.setTitle("������");
		contact.setIndicator(contact_view);
		tabHost.addTab(contact, FormulaFragment.class, null);
	
		discover = tabHost.newTabSpec("TAG_FIND");
		discover_view = new TabIndicatorView(this);
		discover_view.setIcon(R.drawable.focus, R.drawable.ou);
		discover_view.setIconOff();
		discover_view.setUnReadNum(0);
		discover_view.setTitle("������");
		discover.setIndicator(discover_view);
		tabHost.addTab(discover, FaultFragment.class, null);

		me = tabHost.newTabSpec("TAG_ME");
		me_view = new TabIndicatorView(this);
		me_view.setIcon(R.drawable.focus, R.drawable.hz);
		me_view.setIconOff();
		me_view.setUnReadNum(0);
		me_view.setTitle("������");
		me.setIndicator(me_view);
		tabHost.addTab(me, HelpFragment.class, null);

	}

	@Override
	public void onTabChanged(String tabId) {
		// TODO ���������������������������
		chat_view.setIconOff();
		contact_view.setIconOff();
		discover_view.setIconOff();
		me_view.setIconOff();
		if (tabId == "TAG_CHAT") {
			chat_view.setIconON();
		} else if (tabId == "TAG_CONN") {
			contact_view.setIconON();
		} else if (tabId == "TAG_FIND") {
			discover_view.setIconON();
		} else if (tabId == "TAG_ME") {
			me_view.setIconON();
		}
		tabHost.setCurrentTabByTag(tabId);
	}
	
	  private void addFragmentToStack(Fragment fragment) {
		     getSupportFragmentManager().beginTransaction().replace(android.R.id.tabcontent, fragment).commit();
		  }
	@Override
	public void onClick(View v) {
		// TODO ���������������������������
		switch(v.getId()){
//        case R.id.setting:
//            drawerLayout.openDrawer(Gravity.LEFT);
//            break;
        case R.id.btn_left1:
            drawerLayout.closeDrawer(Gravity.LEFT);
            Intent intent=new Intent();
            intent.setClass(FragmentTabHostActivity.this, SettingActivity.class);
            startActivity(intent);
//            addFragmentToStack(new SettingFragment());
            break;
        case R.id.btn_left2:
            drawerLayout.closeDrawer(Gravity.LEFT);
            addFragmentToStack(new RecentFragment());
            break;
        case R.id.btn_left3:
            drawerLayout.closeDrawer(Gravity.LEFT);
            addFragmentToStack(new WaitForHandleFragment());
            break;
        case R.id.btn_left4:
            drawerLayout.closeDrawer(Gravity.LEFT);
            addFragmentToStack(new TextFragment());
            break;
        case R.id.btn_left5:
            drawerLayout.closeDrawer(Gravity.LEFT);
            addFragmentToStack(new StoreHouseFragment());
            break;
	}
	}


	}
		

	

