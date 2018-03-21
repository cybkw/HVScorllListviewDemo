package com.hvscorlllistviewdemo.hvlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import com.hvscorlllistviewdemo.R;

/**
 * Created by willkong on 2016/11/16.
 */

public class HVListViewActivity extends Activity{

    private LayoutInflater mInflater;

    private HVListView mListView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hvlistview);

        mListView = (HVListView) findViewById(android.R.id.list);
        //设置列头
        mListView.mListHead = (LinearLayout) findViewById(R.id.head);
        //设置数据
        mListView.setAdapter(new DataAdapter());

        mInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
    }

    private class DataAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 50;//固定显示50行数据
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.hvlistview_head_item, null);
            }

            //校正（处理同时上下和左右滚动出现错位情况）
            View child = ((ViewGroup) convertView).getChildAt(1);
            int head = mListView.getHeadScrollX();
            if (child.getScrollX() != head) {
                child.scrollTo(mListView.getHeadScrollX(), 0);
            }
            return convertView;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
    }
}
