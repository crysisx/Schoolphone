package com.announcement.acitivity;





import com.course.funtion.MainActivity;
import com.mytwitter.acitivity.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

public class Announcement extends TabActivity {
	  private TabHost _tabHost;
	

      

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.announcement);
	        
	        _tabHost = getTabHost();
	        
	        AddTabPage1();
	        
	        AddTabPage2();
	        
	        AddTabPage3();
	        
	        AddTabPage4();
	    }

	    private void AddTabPage1() {
	        // TODO Auto-generated method stub
	        
	        Intent internt1 = new Intent();
	        internt1.setClass(this,Schoolnews.class);
	        
	        TabSpec tabSpec = _tabHost.newTabSpec("act1");
	        //ָ��ѡ�����ʾ����
	        tabSpec.setIndicator("У԰��Ѷ");
	         

	        //ָ����ת����
	        tabSpec.setContent(internt1);          
	        _tabHost.addTab(tabSpec);
	    }
	    
	    private void AddTabPage2() {
	        // TODO Auto-generated method stub
	        
	        Intent internt1 = new Intent();
	        internt1.setClass(this,Classnotice.class);
	        
	        TabSpec tabSpec = _tabHost.newTabSpec("act2");
	        tabSpec.setIndicator("�༶֪ͨ");
	        tabSpec.setContent(internt1);          
	        _tabHost.addTab(tabSpec);
	    }
	    
	    private void AddTabPage3() {
	        // TODO Auto-generated method stub
	        
	        Intent internt1 = new Intent();
	        internt1.setClass(this,MainActivity.class);
	        
	        TabSpec tabSpec = _tabHost.newTabSpec("act3");
	        //ָ��ѡ�����ʾ����
	        tabSpec.setIndicator("�༶�α�");
	        //ָ����ת����
	        tabSpec.setContent(internt1);          
	        _tabHost.addTab(tabSpec);
	    }
	    
	    private void AddTabPage4() {
	        // TODO Auto-generated method stub
	        
	        Intent internt1 = new Intent();
	        internt1.setClass(this,Telephone.class);
	        
	        TabSpec tabSpec = _tabHost.newTabSpec("act3");
	        //ָ��ѡ�����ʾ����
	        tabSpec.setIndicator("���õ绰");
	        //ָ����ת����
	        tabSpec.setContent(internt1);          
	        _tabHost.addTab(tabSpec);
	    }
	}