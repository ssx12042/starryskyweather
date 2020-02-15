package com.ssx.starryskyweather.db;

import org.litepal.crud.DataSupport;

/**
 * 存放县（区）的数据信息
 */
public class County extends DataSupport {

    private int id;
    private String countyName; // 县（区）的名字
    private String weatherId; // 县（区）对应的天气id
    private int cityId; // 当前县（区）所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
