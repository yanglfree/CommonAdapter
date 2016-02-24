package com.yangl.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by yl on 16/2/24.
 */
public abstract class CommonAdapter<T> extends BaseAdapter{

    private LayoutInflater mInflater;
    private List<T> mDatas;
    private Context mContext;

    public CommonAdapter(Context context,List<T> datas) {
        this.mDatas = datas;
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = ViewHolder.get(mContext, convertView, parent, R.layout.item_listview, position);
        convert(holder,mDatas.get(position));
        return holder.getConvertView();
    }

    public abstract void convert(ViewHolder holder,T t);
}
