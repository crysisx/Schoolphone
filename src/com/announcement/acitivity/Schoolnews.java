package com.announcement.acitivity;

import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;






public class Schoolnews  extends Activity{
	    TextView textview =null;
	    TextView textview2 =null;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.tabhost);
			textview = (TextView)findViewById(R.id.top);
			textview2 = (TextView)findViewById(R.id.text);
			textview.setText("У԰��Ѷ");
			textview2.setText("��������#4��24������,ѧУ�ڸ�����108���ٿ�׿Խ��֧���������������ƽ��ᡣУ��ί���������ƽ��ϯ,��ί��֯�����о�����������ѧ����������ظ������Լ��������22���̹���֧����17��ѧ����֧���������������˲μӡ�����,��λ����������Ŀ����԰�����չ��������˽���");
	    }
	    
	    
	    
	
		
	}
