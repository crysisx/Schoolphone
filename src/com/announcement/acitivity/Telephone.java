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
		textview.setText("���õ绰");
		textview2.setText("��ţ�86915114\n"+"���ϣ�86919169\n"+"У����ֵ��绰��86878555\n У԰110ֵ�ࣺ86915110 \n");
    }
    
    
    

	
}
