package com.hvscorlllistviewdemo.leftrightdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

/**
 * 设置水平滚动控件和要联动的控件建立联动
 * Created by willkong on 2016/11/16.
 */

public class SyncHorizontalScrollView extends HorizontalScrollView{
    private View mView;

    public SyncHorizontalScrollView(Context context) {
        this(context,null);
    }

    public SyncHorizontalScrollView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SyncHorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        //设置控件滚动监听，得到滚动的距离，然后让传进来的view也设置相同的滚动具体
        if(mView!=null) {
            mView.scrollTo(l, t);
        }
    }

    /**
     * 设置跟它联动的view
     * @param view
     */
    public void setScrollView(View view) {
        mView = view;
    }
}
