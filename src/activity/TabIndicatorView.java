package activity;


import com.example.test.R;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TabIndicatorView extends RelativeLayout{
	
	private ImageView iv;  
    private TextView tv_unRead;  
    private TextView tv_msg;  
    private int offIcon,onIcon;  
  
    public TabIndicatorView(Context context, AttributeSet attrs) {  
        super(context, attrs);  
        init();  
    }  
  
    public TabIndicatorView(Context context) {  
        this(context, null);  
    }  
  
    private void init() {  
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragmenttabhostview, this);  
        iv = (ImageView)view.findViewById(R.id.indicator_icon);  
        tv_unRead = (TextView)view.findViewById(R.id.unread_num);  
        tv_msg = (TextView)view.findViewById(R.id.indicator_text);  
    }  
  
    public void setIcon(int onIcon,int offIcon) {  
        this.onIcon=onIcon;  
        this.offIcon=offIcon;  
    }  
  
    public void setIconON(){  
        iv.setImageResource(onIcon);  
    }  
    public void setIconOff(){  
        iv.setImageResource(offIcon);  
    }  
    public void setUnReadNum(int num) {  
        if (num == 0) {  
            tv_unRead.setVisibility(View.GONE);  
        } else if (num <= 99) {  
            tv_unRead.setVisibility(View.VISIBLE);  
            tv_unRead.setText(num + "");  
        } else {  
            tv_unRead.setText("99+");  
        }  
    }  
  
    public void setTitle(String tab) {  
        tv_msg.setText(tab);  
        tv_msg.setTextColor(Color.BLACK);
    }  
  
}  


