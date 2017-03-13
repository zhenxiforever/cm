package com.cm.dao.model.wechatmanage;

import java.io.Serializable;
import java.util.Date;

import com.smile.wechat.model.pojo.WechatAccount;

public class WxAccount extends WechatAccount implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 账号 ACCOUNTID
     * @table : wechatmanage..wx_account
     * @column : ID :VARCHAR
     */
//    private String id;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 名称
     * @table : wechatmanage..wx_account
     * @column : NAME :VARCHAR
     */
//    private String name;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 schema ，对应各自的公众号数据库schema
     * @table : wechatmanage..wx_account
     * @column : ACCOUNTSCHEMA :VARCHAR
     */
//    private String accountschema;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 APPID
     * @table : wechatmanage..wx_account
     * @column : APPID :VARCHAR
     */
//    private String appid;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 APPSECRET
     * @table : wechatmanage..wx_account
     * @column : APPSECRET :VARCHAR
     */
//    private String appsecret;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 domain
     * @table : wechatmanage..wx_account
     * @column : AUTHDOMAIN :VARCHAR
     */
//    private String authdomain;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 回调URL
     * @table : wechatmanage..wx_account
     * @column : URL :VARCHAR
     */
//    private String url;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 设置token
     * @table : wechatmanage..wx_account
     * @column : TOKEN :VARCHAR
     */
//    private String token;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号消息加密 密钥
     * @table : wechatmanage..wx_account
     * @column : AESKEY :VARCHAR
     */
//    private String aeskey;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号 头像url
     * @table : wechatmanage..wx_account
     * @column : PICURL :VARCHAR
     */
//    private String picurl;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 是否禁用；1:禁用；0:启用
     * @table : wechatmanage..wx_account
     * @column : ENABLE :INTEGER
     */
//    private Integer enable;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号创建人
     * @table : wechatmanage..wx_account
     * @column : CREATOR :VARCHAR
     */
    private String creator;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号创建时间
     * @table : wechatmanage..wx_account
     * @column : CREATETIME :TIMESTAMP
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechatmanage..wx_account
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.ID:[公众号 账号 ACCOUNTID]
     */
    public String getId() {
        return id;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param id  公众号 账号 ACCOUNTID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.NAME:[公众号 名称]
     */
    public String getName() {
        return name;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param name  公众号 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.ACCOUNTSCHEMA:[公众号 schema ，对应各自的公众号数据库schema]
     */
    public String getAccountschema() {
        return accountschema;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param accountschema  公众号 schema ，对应各自的公众号数据库schema
     */
    public void setAccountschema(String accountschema) {
        this.accountschema = accountschema == null ? null : accountschema.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.APPID:[公众号 APPID]
     */
    public String getAppid() {
        return appid;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param appid  公众号 APPID
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.APPSECRET:[公众号 APPSECRET]
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param appsecret  公众号 APPSECRET
     */
    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.AUTHDOMAIN:[公众号 domain]
     */
    public String getAuthdomain() {
        return authdomain;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param authdomain  公众号 domain
     */
    public void setAuthdomain(String authdomain) {
        this.authdomain = authdomain == null ? null : authdomain.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.URL:[公众号 回调URL]
     */
    public String getUrl() {
        return url;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param url  公众号 回调URL
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.TOKEN:[公众号 设置token]
     */
    public String getToken() {
        return token;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param token  公众号 设置token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.AESKEY:[公众号消息加密 密钥]
     */
    public String getAeskey() {
        return aeskey;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param aeskey  公众号消息加密 密钥
     */
    public void setAeskey(String aeskey) {
        this.aeskey = aeskey == null ? null : aeskey.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.PICURL:[公众号 头像url]
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param picurl  公众号 头像url
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.ENABLE:[是否禁用；1:禁用；0:启用]
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param enable  是否禁用；1:禁用；0:启用
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.CREATOR:[公众号创建人]
     */
    public String getCreator() {
        return creator;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param creator  公众号创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..wx_account.CREATETIME:[公众号创建时间]
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param createtime  公众号创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}