package com.main.acitivity;




import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class SelectMenu extends Activity{

		
		  /** Called when the activity is first created. */
		//�Կؼ������������
        private Button button=null;
		private CheckBox swimBox = null;
		private CheckBox runBox = null;
		private CheckBox readBox = null;
		
		  
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.radio);
	       

	        swimBox = (CheckBox)findViewById(R.id.swim);
	        runBox = (CheckBox)findViewById(R.id.run);
	        readBox = (CheckBox)findViewById(R.id.read);
	        //ΪRadioGroup���ü���������Ҫע����ǣ�����ļ�������Button�ؼ��ļ�����������ͬ
	        button =(Button)findViewById(R.id.button1);
	        button.setOnClickListener(new ButtonOnClickListener());
	    	


	    	

          
	        //Ϊ��ѡ��ť��Ӽ�����
	        swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					if(isChecked)
					{
						System.out.println("swim is checked");
					}
					else
					{
						System.out.println("swim is unchecked");
					}
				}
			});
	        runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					if(isChecked)
					{
						System.out.println("run is checked");
					}
					else
					{
						System.out.println("run is unchecked");
					}
				}
			});
	        readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					if(isChecked)
					{
						System.out.println("read is checked");
					}
					else
					{
						System.out.println("read is unchecked");
					}
				}
			});
	    }
		class ButtonOnClickListener implements OnClickListener{

			@Override
			public void onClick(View v) {
				  AlertDialog.Builder builder = new Builder(SelectMenu.this);
				builder.setMessage("ȷ��Ҫ��ת��?");
				builder.setTitle("��ʾ");
				builder.setPositiveButton("ȷ��",
						new android.content.DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub
								arg0.dismiss();
								Intent it = new Intent(SelectMenu.this,Maininterface.class);  
								startActivity(it); 
							}
						});

				builder.setNegativeButton("ȡ��",
						new android.content.DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								dialog.dismiss();
							}
						});
			
				builder.create().show();
			}
			
		}
			
		
	    
	}