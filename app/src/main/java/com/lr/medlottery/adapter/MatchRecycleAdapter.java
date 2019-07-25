package com.lr.medlottery.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lr.medlottery.R;
import com.lr.medlottery.android.log.Log;
import com.lr.medlottery.bean.MatchBean;

import java.util.List;

public class MatchRecycleAdapter extends RecyclerView.Adapter<MatchRecycleAdapter.ViewHolder> {

    // Log TAG定义
    private static final String TAG = "MatchRecycleAdapter";
    private List<MatchBean> matchList;

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView matchTime;
        private ImageView matchImage;
        private TextView matchName;
        private TextView matchRecommend;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View.
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i(TAG, "点击RecycleView");
                }
            });
            //获取该布局内的比赛时间
            matchTime = view.findViewById(R.id.match_time);
            //获取该布局内的图片视图
            matchImage = view.findViewById(R.id.match_image);
            //获取该布局内的文本视图
            matchName = view.findViewById(R.id.match_name);
            //获取该布局内的推荐结果
            matchRecommend = view.findViewById(R.id.match_recommend);
        }
    }

    public MatchRecycleAdapter(List<MatchBean> matchList) {
        this.matchList = matchList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.matches_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // 解决recyclerView高度不能自适应的问题
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        // 设值
        MatchBean matchBean = matchList.get(position);
        viewHolder.matchImage.setImageResource(matchBean.getImageId());
        viewHolder.matchTime.setText(matchBean.getMatchTime());
        viewHolder.matchName.setText(matchBean.getName());
        viewHolder.matchRecommend.setText(matchBean.getMatchRecommend());
    }

    @Override
    public int getItemCount() {
        if (matchList == null) {
            return 0;
        } else {
            return matchList.size();
        }
    }
}