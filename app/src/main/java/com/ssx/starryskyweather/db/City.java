package com.ssx.starryskyweather.db;

import org.litepal.crud.DataSupport;

/**
 * 存放城市的数据信息
 */
public class City extends DataSupport {

    private int id;
    private String cityName; // 市的名字
    private int cityCode; // 市的代码
    private int provinceId; // 当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
