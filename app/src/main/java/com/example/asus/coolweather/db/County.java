package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2019/5/7.
 */

public class County extends DataSupport{
    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //记录县的名字
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    //记录县所对应的天气id
    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    //记录当前县所属市的id值
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
