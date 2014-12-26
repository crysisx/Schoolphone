package com.announcement.acitivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mytwitter.acitivity.R;




public class Telephone  extends Activity{
	
    TextView textview =null;
    TextView textview2 =null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost);
		textview = (TextView)findViewById(R.id.top);
		textview2 = (TextView)findViewById(R.id.text);
		textview.setText("常用电话");
		textview2.setText("查号：86915114\n"+"故障：86919169\n"+"校区总值班电话：86878555\n 校园110值班：86915110 \n");
    }
    
    
    

	
}
