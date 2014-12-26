package com.announcement.acitivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mytwitter.acitivity.R;



public class Classnotice  extends Activity{
	
    TextView textview =null;
    TextView textview2 =null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost);
		textview = (TextView)findViewById(R.id.top);
		textview2 = (TextView)findViewById(R.id.text);
		textview.setText("班级通知");
		textview2.setText("成大事者不某于众，商鞅曾说过，只要你坚信自己的做法是有利于集体的那就坚定不移的贯彻实施，最后等大家看到效果的时候就不会再非议了");
    }
    
    
    

	
}
