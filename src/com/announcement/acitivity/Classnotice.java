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
		textview.setText("�༶֪ͨ");
		textview2.setText("�ɴ����߲�ĳ���ڣ�������˵����ֻҪ������Լ��������������ڼ�����Ǿͼᶨ���ƵĹ᳹ʵʩ�����ȴ�ҿ���Ч����ʱ��Ͳ����ٷ�����");
    }
    
    
    

	
}
