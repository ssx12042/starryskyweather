package com.ssx.starryskyweather.db;

import org.litepal.crud.DataSupport;

/**
 * 存放省份的数据信息
 */
public class Province extends DataSupport {

    private int id; // id是每个实体类中都应该有的字段
    private String provinceName; // 省的名字
    private int provinceCode; // 省的代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
