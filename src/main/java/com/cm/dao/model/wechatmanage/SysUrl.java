package com.cm.dao.model.wechatmanage;

import java.io.Serializable;

public class SysUrl implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 主键id
     * @table : wechatmanage..sys_url
     * @column : ID :INTEGER
     */
    private Integer id;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 请求URL
     * @table : wechatmanage..sys_url
     * @column : URL :VARCHAR
     */
    private String url;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 请求名称
     * @table : wechatmanage..sys_url
     * @column : NAME :VARCHAR
     */
    private String name;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 暂未知
     * @table : wechatmanage..sys_url
     * @column : LOG_FLAG :INTEGER
     */
    private Integer logFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechatmanage..sys_url
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_url.ID:[主键id]
     */
    public Integer getId() {
        return id;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param id  主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_url.URL:[请求URL]
     */
    public String getUrl() {
        return url;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param url  请求URL
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_url.NAME:[请求名称]
     */
    public String getName() {
        return name;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param name  请求名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_url.LOG_FLAG:[暂未知]
     */
    public Integer getLogFlag() {
        return logFlag;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param logFlag  暂未知
     */
    public void setLogFlag(Integer logFlag) {
        this.logFlag = logFlag;
    }
}