package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2019/5/7.
 */

public class City extends DataSupport{
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //记录市的名字
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    //记录市的代号
    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    //记录当前市所属省的ID值
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}
