package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2019/5/6.
 */

public class Province extends DataSupport{
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    //记录省的名字
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    //记录省的代号
    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
