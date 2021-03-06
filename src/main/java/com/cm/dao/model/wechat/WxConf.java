package com.cm.dao.model.wechat;

import java.io.Serializable;

public class WxConf implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 参数配置key
     * @table : wechat..wx_conf
     * @column : WX_KEY :VARCHAR
     */
    private String wxKey;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 参数配置值
     * @table : wechat..wx_conf
     * @column : WX_VALUE :VARCHAR
     */
    private String wxValue;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 参数描述
     * @table : wechat..wx_conf
     * @column : WX_DESC :VARCHAR
     */
    private String wxDesc;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 参数排序
     * @table : wechat..wx_conf
     * @column : WX_SORT :INTEGER
     */
    private Integer wxSort;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 参数标识
     * @table : wechat..wx_conf
     * @column : WX_FLAG :INTEGER
     */
    private Integer wxFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat..wx_conf
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * 微信用户所属服务号应用id
     */
    private String accountid;
    /**
     * 微信用户所属服务号应用schema
     */
    private String schema;
    
    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_conf.WX_KEY:[参数配置key]
     */
    public String getWxKey() {
        return wxKey;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param wxKey  参数配置key
     */
    public void setWxKey(String wxKey) {
        this.wxKey = wxKey == null ? null : wxKey.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_conf.WX_VALUE:[参数配置值]
     */
    public String getWxValue() {
        return wxValue;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param wxValue  参数配置值
     */
    public void setWxValue(String wxValue) {
        this.wxValue = wxValue == null ? null : wxValue.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_conf.WX_DESC:[参数描述]
     */
    public String getWxDesc() {
        return wxDesc;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param wxDesc  参数描述
     */
    public void setWxDesc(String wxDesc) {
        this.wxDesc = wxDesc == null ? null : wxDesc.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_conf.WX_SORT:[参数排序]
     */
    public Integer getWxSort() {
        return wxSort;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param wxSort  参数排序
     */
    public void setWxSort(Integer wxSort) {
        this.wxSort = wxSort;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_conf.WX_FLAG:[参数标识]
     */
    public Integer getWxFlag() {
        return wxFlag;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param wxFlag  参数标识
     */
    public void setWxFlag(Integer wxFlag) {
        this.wxFlag = wxFlag;
    }
    
    /**
     * 微信用户所属服务号应用id
     */
	public String getAccountid() {
		return accountid;
	}

	/**
     * 微信用户所属服务号应用id
     */
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	/**
     * 微信用户所属服务号应用schema
     */
	public String getSchema() {
		return schema;
	}

	/**
     * 微信用户所属服务号应用schema
     */
	public void setSchema(String schema) {
		this.schema = schema;
	}
}