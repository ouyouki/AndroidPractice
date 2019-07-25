package com.lr.medlottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.lr.medlottery.adapter.MatchListViewAdapter;
import com.lr.medlottery.bean.MatchBean;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private List<MatchBean> matchList = new ArrayList<MatchBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        initMatches(); // 初始化水果数据
        MatchListViewAdapter adapter = new MatchListViewAdapter(ListViewActivity.this, R.layout.matches_item, matchList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Clicked Button",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initMatches() {
        MatchBean apple = new MatchBean(R.drawable.yingchao,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(apple);
        MatchBean banana = new MatchBean(R.drawable.dejia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(banana);
        MatchBean orange = new MatchBean(R.drawable.fajia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(orange);
        MatchBean watermelon = new MatchBean(R.drawable.xijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(watermelon);
        MatchBean pear = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(pear);
        MatchBean grape = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(grape);
        MatchBean pineapple = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(pineapple);
        MatchBean strawberry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(strawberry);
        MatchBean cherry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(cherry);
        MatchBean mango = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(mango);
        cherry = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(cherry);
        mango = new MatchBean(R.drawable.yijia,"阿根廷 VS 智利", "07/09 15:30", "不败");
        matchList.add(mango);
    }
}