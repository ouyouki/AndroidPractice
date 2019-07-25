package com.lr.medlottery.bean;

public class MatchBean {

    private int imageId;
    private String name;
    private String matchTime;
    private String matchRecommend;


    public MatchBean(int imageId, String name, String matchTime, String matchRecommend) {
        this.imageId = imageId;
        this.name = name;
        this.matchTime = matchTime;
        this.matchRecommend = matchRecommend;

    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public String getMatchRecommend() {
        return matchRecommend;
    }
}