package com.message.acitivity;

import com.main.acitivity.MobileSign;
import com.mytwitter.acitivity.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;
/**
 * 
 * @author 
 * @since 2011-3-8
 */
public class MainTabActivity extends TabActivity implements OnCheckedChangeListener{
	private RadioGroup mainTab;
	private TabHost mTabHost;
	
	//鍐呭Intent
	private Intent mHomeIntent;
	private Intent mNewsIntent;
	private Intent mInfoIntent;
	private Intent mSearchIntent;
	private Intent mMoreIntent;
	
	private final static String TAB_TAG_HOME="tab_tag_home";
	private final static String TAB_TAG_NEWS="tab_tag_news";
	private final static String TAB_TAG_INFO="tab_tag_info";
	private final static String TAB_TAG_SEARCH="tab_tag_search";
	private final static String TAB_TAG_MORE="tab_tag_more";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.msgsend);
        mainTab=(RadioGroup)findViewById(R.id.main_tab);
        mainTab.setOnCheckedChangeListener(this);
        prepareIntent();
        setupIntent();
    }
    /**
     * 鍑嗗tab鐨勫唴瀹笽ntent
     */
	private void prepareIntent() {
		mHomeIntent=new Intent(this, HomeActivity.class);
		mNewsIntent=new Intent(this, NewsActivity.class);
		mInfoIntent=new Intent(this, MyInfoActivity.class);
		mSearchIntent=new Intent(this,SearchActivity.class);
		mMoreIntent=new Intent(this, MoreActivity.class);
	}
	/**
	 * 
	 */
	private void setupIntent() {
		this.mTabHost=getTabHost();
		TabHost localTabHost=this.mTabHost;
		localTabHost.addTab(buildTabSpec(TAB_TAG_HOME, R.string.main_home, R.drawable.icon_1_n, mHomeIntent));
		localTabHost.addTab(buildTabSpec(TAB_TAG_NEWS, R.string.main_news, R.drawable.icon_2_n, mNewsIntent));
		localTabHost.addTab(buildTabSpec(TAB_TAG_INFO, R.string.main_my_info, R.drawable.icon_3_n, mInfoIntent));
		localTabHost.addTab(buildTabSpec(TAB_TAG_SEARCH, R.string.menu_search, R.drawable.icon_4_n, mSearchIntent));
		localTabHost.addTab(buildTabSpec(TAB_TAG_MORE, R.string.more, R.drawable.icon_5_n, mMoreIntent));
	}
	/**
	 * 鏋勫缓TabHost鐨凾ab椤�	 * @param tag 鏍囪
	 * @param resLabel 鏍囩
	 * @param resIcon 鍥炬爣
	 * @param content 璇ab灞曠ず鐨勫唴瀹�	 * @return 涓�釜tab
	 */
	private TabHost.TabSpec buildTabSpec(String tag, int resLabel, int resIcon,final Intent content) {
		return this.mTabHost.newTabSpec(tag).setIndicator(getString(resLabel),
				getResources().getDrawable(resIcon)).setContent(content);
	} 
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch(checkedId){
		case R.id.radio_button0:
			this.mTabHost.setCurrentTabByTag(TAB_TAG_HOME);
			break;
		case R.id.radio_button1:
			this.mTabHost.setCurrentTabByTag(TAB_TAG_NEWS);
			break;
		case R.id.radio_button2:
			this.mTabHost.setCurrentTabByTag(TAB_TAG_INFO);
			break;
		case R.id.radio_button3:
			this.mTabHost.setCurrentTabByTag(TAB_TAG_SEARCH);
			break;
		case R.id.radio_button4:
			this.mTabHost.setCurrentTabByTag(TAB_TAG_MORE);
			break;
		}
	}
    
    
}