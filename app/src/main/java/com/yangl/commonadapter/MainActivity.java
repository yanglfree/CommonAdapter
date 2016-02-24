package com.yangl.commonadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListview;
    private List<Bean> mDatas = new ArrayList<Bean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDatas();
        CommonAdapter adapter = new CommonAdapter<Bean>(MainActivity.this, mDatas) {
            @Override
            public void convert(ViewHolder holder, Bean bean) {
                ((TextView) holder.getView(R.id.title)).setText(bean.getTitle());
                ((TextView) holder.getView(R.id.desc)).setText(bean.getDesc());
                ((TextView) holder.getView(R.id.time)).setText(bean.getTime());
                ((TextView) holder.getView(R.id.phone)).setText(bean.getPhone());
                holder.setText(R.id.title, bean.getTitle()).setText(R.id.desc, bean.getDesc()).setText(R.id.time, bean.getTime()).setText(R.id.phone, bean.getPhone());
            }
        };
        mListview.setAdapter(adapter);
    }

    private void initViews() {
        mListview = (ListView) findViewById(R.id.listview);
    }


    private void initDatas() {
        Bean bean1 = new Bean("Android开发01", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean2 = new Bean("Android开发02", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean3 = new Bean("Android开发03", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean4 = new Bean("Android开发04", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean5 = new Bean("Android开发05", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean6 = new Bean("Android开发06", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean7 = new Bean("Android开发07", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean8 = new Bean("Android开发08", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");
        Bean bean9 = new Bean("Android开发09", "Java编程语言，是Android开发的基础，Android开发还有四大组件，分别是。。。", "17:00", "10086");

        mDatas.add(bean1);
        mDatas.add(bean2);
        mDatas.add(bean3);
        mDatas.add(bean4);
        mDatas.add(bean5);
        mDatas.add(bean6);
        mDatas.add(bean7);
        mDatas.add(bean8);
        mDatas.add(bean9);
    }
}
