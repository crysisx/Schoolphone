package com.main.acitivity;

import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends Activity{
	private TextView resultView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher);
		Intent intent = getIntent();
		String factorOneStr = intent.getStringExtra("one");
		String factorTwoStr = intent.getStringExtra("two");
		//int factorOneInt = Integer.parseInt(factorOneStr);
		//int factorTwoInt = Integer.parseInt(factorTwoStr);
		//int result = factorOneInt * factorTwoInt;
		int result =5;
		resultView.setText(result + "");
		
	}


}
