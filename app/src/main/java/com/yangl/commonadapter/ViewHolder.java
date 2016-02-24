package com.yangl.commonadapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yl on 16/2/24.
 */
public class ViewHolder {
    private SparseArray<View> mViews;
    private View mConvertView;

    private Context mContext;

    public ViewHolder(Context context,int resId,ViewGroup viewGroup,int position) {
        mViews = new SparseArray<View>();
        mConvertView = LayoutInflater.from(context).inflate(resId,viewGroup);
        mConvertView.setTag(this);

    }

    public static ViewHolder get(Context context,View convertView,ViewGroup parent,int layoutId,int position){
        if (convertView == null){
            return new ViewHolder(context,layoutId,null,position);
        }else {
            ViewHolder holder = (ViewHolder)convertView.getTag();
            return holder;
        }
    }

    public View getConvertView(){
        return mConvertView;
    }

    public <T extends View> T getView(int viewId){
       View view = mViews.get(viewId);
        if (view == null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return (T)view;
    }

    public ViewHolder setText(int viewId,String text){
        TextView textView = (TextView)getView(viewId);
        textView.setText(text);
        return this;
    }

    public ViewHolder setImage(int viewId,Bitmap bitmap){
        ImageView imageView = (ImageView)getView(viewId);
        imageView.setImageBitmap(bitmap);
        return this;
    }


}
