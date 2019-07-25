package com.lr.medlottery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lr.medlottery.R;
import com.lr.medlottery.bean.MatchBean;

import java.util.List;

public class MatchListViewAdapter extends ArrayAdapter {

    private final int resourceId;

    public MatchListViewAdapter(Context context, int textViewResourceId, List<MatchBean> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 提升ListView的运行效率
        MatchBean matchBean = (MatchBean) getItem(position);
        View view;
        if (convertView == null) {
            // 如果convertView是null，则使用LayoutInflater去加载布局
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        } else {
            // 如果不为null，重复利用convertView
            view = convertView;
        }

        //获取该布局内的比赛时间
        TextView matchTime = view.findViewById(R.id.match_time);
        //获取该布局内的图片视图
        ImageView matchImage = view.findViewById(R.id.match_image);
        //获取该布局内的文本视图
        TextView matchName = view.findViewById(R.id.match_name);
        //获取该布局内的推荐结果
        TextView matchRecommend = view.findViewById(R.id.match_recommend);

        //为图片视图设置图片资源：图片
        matchImage.setImageResource(matchBean.getImageId());
        //为文本视图设置文本内容:比赛名称
        matchName.setText(matchBean.getName());
        //为文本视图设置文本内容：比赛时间
        matchTime.setText(matchBean.getMatchTime());
        //为文本视图设置文本内容：推荐结果
        matchRecommend.setText(matchBean.getMatchRecommend());
        return view;
    }
}