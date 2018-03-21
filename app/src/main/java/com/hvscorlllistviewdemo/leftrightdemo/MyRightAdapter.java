package com.hvscorlllistviewdemo.leftrightdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hvscorlllistviewdemo.R;

import java.util.List;

public class MyRightAdapter extends BaseAdapter {
	private Context context;
	List<RightModel> list;

	public MyRightAdapter(Context context, List<RightModel> models) {
		super();
		this.context = context;
		this.list = models;
	}

	@Override
	public int getCount() {
		if (list!=null) {
			return list.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		if (list!=null) {
			return list.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHold viewHold;
		if (convertView==null) {
			viewHold=new ViewHold();
			convertView=LayoutInflater.from(context).inflate(R.layout.layout_right_tab, null);
			viewHold.textView0=(TextView) convertView.findViewById(R.id.item0);
			viewHold.textView1=(TextView) convertView.findViewById(R.id.item1);
			viewHold.textView2=(TextView) convertView.findViewById(R.id.item2);
			viewHold.textView3=(TextView) convertView.findViewById(R.id.item3);
			viewHold.textView4=(TextView) convertView.findViewById(R.id.item4);
			viewHold.textView5=(TextView) convertView.findViewById(R.id.item5);
			viewHold.textView6=(TextView) convertView.findViewById(R.id.item6);
			viewHold.textView7=(TextView) convertView.findViewById(R.id.item7);
			viewHold.textView8=(TextView) convertView.findViewById(R.id.item8);
			viewHold.textView9=(TextView) convertView.findViewById(R.id.item9);
			viewHold.textView10=(TextView) convertView.findViewById(R.id.item10);
			convertView.setTag(viewHold);
		}else {
			viewHold=(ViewHold) convertView.getTag();
		}

		viewHold.textView0.setText(list.get(position).getText0());
		viewHold.textView1.setText(list.get(position).getText1());
		viewHold.textView2.setText(list.get(position).getText2());
		viewHold.textView3.setText(list.get(position).getText3());
		viewHold.textView4.setText(list.get(position).getText4());
		viewHold.textView5.setText(list.get(position).getText5());
		viewHold.textView6.setText(list.get(position).getText6());
		viewHold.textView7.setText(list.get(position).getText7());
		viewHold.textView8.setText(list.get(position).getText8());
		viewHold.textView9.setText(list.get(position).getText9());
		viewHold.textView10.setText(list.get(position).getText10());
		return convertView;
	}

	static class ViewHold{

		TextView textView0,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
	}

}
