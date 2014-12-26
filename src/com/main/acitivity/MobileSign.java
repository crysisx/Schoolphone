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
//				//设置button
				button =(Button)findViewById(R.id.button1);
		        button.setOnClickListener(new ButtonOnClickListener());
//				//将可选内容与ArrayAdapter连接起来
//				adapter = ArrayAdapter.createFromResource(this, R.array.plantes, android.R.layout.simple_spinner_item);
//				adapter2 = ArrayAdapter.createFromResource(this, R.array.plantes2, android.R.layout.simple_spinner_item);
//				adapter3 = ArrayAdapter.createFromResource(this, R.array.plantes3, android.R.layout.simple_spinner_item);
//				//设置下拉列表的风格	
//		        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//				//将adapter2 添加到spinner中
//				spinner.setAdapter(adapter);
//				spinner2.setAdapter(adapter2);
//				spinner3.setAdapter(adapter3);
//				//添加事件Spinner事件监听  
//				spinner.setOnItemSelectedListener(new SpinnerXMLSelectedListener());
//				spinner2.setOnItemSelectedListener(new SpinnerXMLSelectedListener2());
//				spinner3.setOnItemSelectedListener(new SpinnerXMLSelectedListener3());
//				//设置默认值
//				spinner.setVisibility(View.VISIBLE);
//				spinner2.setVisibility(View.VISIBLE);
//				spinner3.setVisibility(View.VISIBLE);
//			}
//			
//			//使用XML形式操作
//			class SpinnerXMLSelectedListener implements OnItemSelectedListener{
//				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
//						long arg3) {
//					view.setText("班级："+adapter.getItem(arg2));
//					view2.setText("课程："+adapter2.getItem(arg2));
//					view3.setText("课时："+adapter3.getItem(arg2));
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
//					view.setText("班级："+adapter.getItem(arg2));
//					view2.setText("课程："+adapter2.getItem(arg2));
//					view3.setText("课时："+adapter3.getItem(arg2));
//				}
//
//				public void onNothingSelected(AdapterView<?> arg0) {
//					
//				}
//			}
//			class SpinnerXMLSelectedListener3 implements OnItemSelectedListener{
//				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
//						long arg3) {
//					view.setText("班级："+adapter.getItem(arg2));
//					view2.setText("课程："+adapter2.getItem(arg2));
//					view3.setText("课时："+adapter3.getItem(arg2));
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