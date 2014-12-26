package com.course.funtion;

import com.mytwitter.acitivity.R;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

/**
 *@author 
 */
public class diary_activity extends ListActivity {
	
	//�ظ��Ĺؼ���
	private static final int ACTIVITY_CREATE = 0;
	private static final int ACTIVITY_EDIT = 1;

	//�˵���ѡ��
	private static final int INSERT_ID = Menu.FIRST;
	private static final int DELETE_ID = Menu.FIRST + 1;

	private DbAdapter mDbHelper;
	private Cursor mDiaryCursor;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary_list);
		mDbHelper = new DbAdapter(this);
		updateListView();

	}

	//���µ�ǰ��listacvitity
	private void updateListView() {
		mDbHelper.open();
		mDiaryCursor = mDbHelper.getAllNotes();
		startManagingCursor(mDiaryCursor);
		String[] from = new String[] { DbAdapter.KEY_TITLE,
				DbAdapter.KEY_CREATED };
		int[] to = new int[] { R.id.text1, R.id.created };
		SimpleCursorAdapter notes = new SimpleCursorAdapter(this,
				R.layout.diary_row, mDiaryCursor, from, to);
		setListAdapter(notes);
		mDbHelper.closeclose();
	}

	//����һ���˵�
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0, INSERT_ID, 0,"�½�").setIcon(R.drawable.new_course);
		menu.add(0, DELETE_ID, 0, "ɾ��").setIcon(R.drawable.delete);
		return true;
	}

	//�˵�ѡ��
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case INSERT_ID:
			createDiary();
			return true;
		case DELETE_ID:
			mDbHelper.open();
			mDbHelper.deleteDiary(getListView().getSelectedItemId());
			mDbHelper.closeclose();
			updateListView();
			return true;
		}
		return super.onMenuItemSelected(featureId, item);
	}

	private void createDiary() {
		Intent i = new Intent(this, DiaryEditActivity.class);
		startActivityForResult(i, ACTIVITY_CREATE);
	}

	@Override
	// ��Ҫ��position��id����һ���ܺõ�����
	// positionָ���ǵ�������ViewItem�ڵ�ǰListView�е�λ��
	// ÿһ����ViewItem�󶨵����ݣ��϶�����һ��id��ͨ�����id�����ҵ��������ݡ�
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Cursor c = mDiaryCursor;
		c.moveToPosition(position);
		Intent i = new Intent(this, DiaryEditActivity.class);
		i.putExtra(DbAdapter.KEY_ROWID, id);
		i.putExtra(DbAdapter.KEY_TITLE, c.getString(c
				.getColumnIndexOrThrow(DbAdapter.KEY_TITLE)));
		i.putExtra(DbAdapter.KEY_BODY, c.getString(c
				.getColumnIndexOrThrow(DbAdapter.KEY_BODY)));
		startActivityForResult(i, ACTIVITY_EDIT);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode,
			Intent intent) {
		super.onActivityResult(requestCode, resultCode, intent);
		updateListView();
	}
}
