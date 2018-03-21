package com.hvscorlllistviewdemo.leftrightdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.hvscorlllistviewdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willkong on 2016/11/16.
 */

public class LeftRightActivity extends Activity{
    private LinearLayout leftContainerView;
    private ListView leftListView;
    private List<String> leftlList;
    private LinearLayout rightContainerView;
    private ListView rightListView;
    private List<RightModel> models;
    private SyncHorizontalScrollView titleHorsv;
    private SyncHorizontalScrollView contentHorsv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_right);
        leftContainerView = (LinearLayout) findViewById(R.id.left_container);
        leftListView = (ListView) findViewById(R.id.left_container_listview);
        rightContainerView = (LinearLayout) findViewById(R.id.right_container);
        rightListView = (ListView) findViewById(R.id.right_container_listview);
        titleHorsv = (SyncHorizontalScrollView) findViewById(R.id.title_horsv);
        contentHorsv = (SyncHorizontalScrollView) findViewById(R.id.content_horsv);
        // 设置两个水平控件的联动
        titleHorsv.setScrollView(contentHorsv);
        contentHorsv.setScrollView(titleHorsv);
        // 添加左边的数据
        leftContainerView.setBackgroundColor(Color.YELLOW);
        initLeftData();
        MyLeftAdapter adapter = new MyLeftAdapter(this, leftlList);
        leftListView.setAdapter(adapter);
        UtilTools.setListViewHeightBasedOnChildren(leftListView);
        // 添加右边的数据
        rightContainerView.setBackgroundColor(Color.GRAY);
        initRightData();
        MyRightAdapter myRightAdapter = new MyRightAdapter(this,models);
        rightListView.setAdapter(myRightAdapter);
        //保证能够获取到正常的高度
        UtilTools.setListViewHeightBasedOnChildren(rightListView);
    }

    private void initRightData() {
        models=new ArrayList<RightModel>();
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
        models.add(new RightModel("111", "222", "333", "444", "555", "666","777","888","999","000","111"));
    }
    private void initLeftData() {
        leftlList=new ArrayList<String>();
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
        leftlList.add("aaaa");
    }
}
