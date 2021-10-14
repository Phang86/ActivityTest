package com.example.activitytest.weixin;

public class Entity {
    private String name;
    private int imageid;
    private String xiaoxi;

    public String getXiaoxi() {
        return xiaoxi;
    }

    public void setXiaoxi(String xiaoxi) {
        this.xiaoxi = xiaoxi;
    }

    public Entity(String name, int imageid, String xiaoxi) {
        this.name = name;
        this.imageid = imageid;
        this.xiaoxi = xiaoxi;
    }

    public String getName() {
        return name;
    }

    public int getImageid() {
        return imageid;
    }

}
