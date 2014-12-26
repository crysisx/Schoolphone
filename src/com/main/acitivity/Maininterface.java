package com.main.acitivity;

import java.util.ArrayList;
import java.util.HashMap;

import com.announcement.acitivity.Announcement;
import com.course.funtion.MainActivity;
import com.message.acitivity.MainTabActivity;
import com.mytwitter.acitivity.R;
import com.resource.acitivity.Upload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class Maininterface extends Activity {
	private CornerListView mListView = null;
	ArrayList<HashMap<String, String>> map_list1 = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		getDataSource1();
		// getDataSource2();

		SimpleAdapter adapter1 = new SimpleAdapter(this, map_list1,
				R.layout.simple_list_item_1, new String[] { "item" },
				new int[] { R.id.item_title });
		mListView = (CornerListView) findViewById(R.id.list1);
		mListView.setAdapter(adapter1);
		mListView.setOnItemClickListener(new OnItemListSelectedListener());
	}

	public ArrayList<HashMap<String, String>> getDataSource1() {

		map_list1 = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map3 = new HashMap<String, String>();
		HashMap<String, String> map4 = new HashMap<String, String>();

		map1.put("item", "上课签到");
		map2.put("item", "校园资讯");
		map3.put("item", "课程表管理");
		map4.put("item", "自习教室智能推荐");
 
		map_list1.add(map1);
		map_list1.add(map2);
		map_list1.add(map3);
		map_list1.add(map4);

		return map_list1;
	}

	class OnItemListSelectedListener implements OnItemClickListener {
         
		Intent intent=new Intent();
		
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
		         	if(id==1){
			           System.out.println("id"+id);
		               intent.setClass( Maininterface.this,Announcement.class);
			           Maininterface.this.startActivity(intent);
		            }else if(id==2){
				           System.out.println("id"+id);
			               intent.setClass( Maininterface.this,MainActivity.class);
				          Maininterface.this.startActivity(intent);
			        }else if(id==3){
				           System.out.println("id"+id);
			                intent.setClass( Maininterface.this,Upload.class);
				           Maininterface.this.startActivity(intent);
			        }else{
			        	 System.out.println("id null");
				         intent.setClass( Maininterface.this,MobileSign.class);
					     Maininterface.this.startActivity(intent);
			        }
		         	
			  }
		
	  }
}