package com.main.acitivity;


import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;



	public class MobileSign extends Activity {

//			private TextView view;
//			private TextView view2;
//			private TextView view3;
//			private Spinner spinner;
//			private Spinner spinner2;
//			private Spinner spinner3;
//			private ArrayAdapter adapter;
//			private ArrayAdapter adapter2;
//			private ArrayAdapter adapter3;
			private Button button ;

			@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.mobilesign);
//				spinner = (Spinner) findViewById(R.id.Spinner1);
//				spinner2 = (Spinner) findViewById(R.id.Spinner3);
//				spinner3 = (Spinner) findViewById(R.id.Spinner2);
//				view = (TextView) findViewById(R.id.spinnerText1);
//				view2 = (TextView) findViewById(R.id.spinnerText2);
//				view3 = (TextView) findViewById(R.id.spinnerText3);
//				//����button
				button =(Button)findViewById(R.id.button1);
		        button.setOnClickListener(new ButtonOnClickListener());
//				//����ѡ������ArrayAdapter��������
//				adapter = ArrayAdapter.createFromResource(this, R.array.plantes, android.R.layout.simple_spinner_item);
//				adapter2 = ArrayAdapter.createFromResource(this, R.array.plantes2, android.R.layout.simple_spinner_item);
//				adapter3 = ArrayAdapter.createFromResource(this, R.array.plantes3, android.R.layout.simple_spinner_item);
//				//���������б�ķ��	
//		        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//				//��adapter2 ��ӵ�spinner��
//				spinner.setAdapter(adapter);
//				spinner2.setAdapter(adapter2);
//				spinner3.setAdapter(adapter3);
//				//����¼�Spinner�¼�����  
//				spinner.setOnItemSelectedListener(new SpinnerXMLSelectedListener());
//				spinner2.setOnItemSelectedListener(new SpinnerXMLSelectedListener2());
//				spinner3.setOnItemSelectedListener(new SpinnerXMLSelectedListener3());
//				//����Ĭ��ֵ
//				spinner.setVisibility(View.VISIBLE);
//				spinner2.setVisibility(View.VISIBLE);
//				spinner3.setVisibility(View.VISIBLE);
//			}
//			
//			//ʹ��XML��ʽ����
//			class SpinnerXMLSelectedListener implements OnItemSelectedListener{
//				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
//						long arg3) {
//					view.setText("�༶��"+adapter.getItem(arg2));
//					view2.setText("�γ̣�"+adapter2.getItem(arg2));
//					view3.setText("��ʱ��"+adapter3.getItem(arg2));
//				}
//
//				public void onNothingSelected(AdapterView<?> arg0) {
//					
//				}
//				
//				
//			}
//			class SpinnerXMLSelectedListener2 implements OnItemSelectedListener{
//				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
//						long arg3) {
//					view.setText("�༶��"+adapter.getItem(arg2));
//					view2.setText("�γ̣�"+adapter2.getItem(arg2));
//					view3.setText("��ʱ��"+adapter3.getItem(arg2));
//				}
//
//				public void onNothingSelected(AdapterView<?> arg0) {
//					
//				}
//			}
//			class SpinnerXMLSelectedListener3 implements OnItemSelectedListener{
//				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
//						long arg3) {
//					view.setText("�༶��"+adapter.getItem(arg2));
//					view2.setText("�γ̣�"+adapter2.getItem(arg2));
//					view3.setText("��ʱ��"+adapter3.getItem(arg2));
//				}
//
//				public void onNothingSelected(AdapterView<?> arg0) {
//					
//				}
		}
			class ButtonOnClickListener implements OnClickListener{

				@Override
				public void onClick(View v) {
					Intent intent = new Intent();
					intent.setClass(MobileSign.this,SelectMenu.class);
					MobileSign.this.startActivity(intent);
				}
			}	
        
	}