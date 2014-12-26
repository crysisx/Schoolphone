package com.resource.acitivity;

import java.io.File;

import com.main.acitivity.LoginActivity;
import com.main.acitivity.Maininterface;
import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Upload extends Activity {

	 private  Button button =null; 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.upload);
	        button =(Button)findViewById(R.id.ok);
	        button.setOnClickListener(new ButtonOnClickListener());
	        
	    }
	    
		class ButtonOnClickListener implements OnClickListener{
			@Override
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(Upload.this,zxtj.class);
				Upload.this.startActivity(intent);
			}
		}
    
}
