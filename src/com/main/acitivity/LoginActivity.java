package com.main.acitivity;

import com.mytwitter.acitivity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {
	 private  Button button =null; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        button =(Button)findViewById(R.id.signin_button);
        button.setOnClickListener(new ButtonOnClickListener());
        
    }
    
	class ButtonOnClickListener implements OnClickListener{
		@Override
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(LoginActivity.this,Maininterface.class);
			LoginActivity.this.startActivity(intent);
		}
	}
	
}
