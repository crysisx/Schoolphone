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
			textview.setText("校园资讯");
			textview2.setText("杭电新闻#4月24日下午,学校在格致堂108室召开卓越党支部党建案例创建推进会。校党委副书记刘道平出席,党委组织部、研究生工作部、学生工作部相关负责人以及获立项的22个教工党支部和17个学生党支部党建案例负责人参加。会上,多位党建案例项目代表对案例进展情况进行了交流");
	    }
	    
	    
	    
	
		
	}
