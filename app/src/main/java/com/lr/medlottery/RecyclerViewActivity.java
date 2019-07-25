package com.lr.medlottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lr.medlottery.adapter.MatchRecycleAdapter;
import com.lr.medlottery.bean.MatchBean;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<MatchBean> matchList = new ArrayList<MatchBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initMatches();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        MatchRecycleAdapter adapter = new MatchRecycleAdapter(matchList);
        recyclerView.setAdapter(adapter);
    }

    private void initMatches() {
        MatchBean apple = new MatchBean(R.drawable.yingchao,"阿根廷 VS 智利1", "07/09 15:30", "不败");
        matchList.add(apple);
        MatchBean banana = new MatchBean(R.drawable.dejia,"阿根廷 VS 智利2", "07/09 15:30", "不败");
        matchList.add(banana);
        MatchBean orange = new MatchBean(R.drawable.fajia,"阿根廷 VS 智利3", "07/09 15:30", "不败");
        matchList.add(orange);
        MatchBean watermelon = new MatchBean(R.drawable.xijia,"阿根廷 VS 智利4", "07/09 15:30", "不败");
        matchList.add(watermelon);
        MatchBean pear = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利5", "07/09 15:30", "不败");
        matchList.add(pear);
        MatchBean grape = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利6", "07/09 15:30", "不败");
        matchList.add(grape);
        MatchBean pineapple = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利7", "07/09 15:30", "不败");
        matchList.add(pineapple);
        MatchBean strawberry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利8", "07/09 15:30", "不败");
        matchList.add(strawberry);
        MatchBean cherry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利9", "07/09 15:30", "不败");
        matchList.add(cherry);
        MatchBean mango = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利10", "07/09 15:30", "不败");
        matchList.add(mango);
        cherry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利11", "07/09 15:30", "不败");
        matchList.add(cherry);
        mango = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利12", "07/09 15:30", "不败");
        matchList.add(mango);
    }
}