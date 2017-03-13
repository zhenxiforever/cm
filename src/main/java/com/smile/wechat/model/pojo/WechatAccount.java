package com.smile.wechat.model.pojo;

import java.io.Serializable;
import java.util.Date;

import com.cm.dao.model.wechatmanage.WxAccount;

/**
 * 微信服务号对象
 * 
 * @author smile
 * @createTime 2015-01-22
 * @history 1.修改时间,修改;修改内容：
 * 
 */
public class WechatAccount implements Serializable {

	private static final long serialVersionUID = -3783293808632853486L;

	protected String id;
	protected String appid;//应用id
	protected String appsecret;//应用密钥
	protected String name;//服务号名称
	protected String authdomain;//应用域名
	protected String url;//回调URL
	protected String token;//令牌
	protected String aeskey;//密钥
	protected String picurl;//应用图片
	protected Integer enable;//启用标志
	
	protected String accountschema;//对应db schema

	public WechatAccount() {
	}
	
	public WechatAccount(String id,String appid,String appsecret,String name, String authdomain, String url,
			String token, String aeskey, String picurl,Integer enable) {
		this.id = id;
		this.appid = appid;
		this.appsecret = appsecret;
		this.name = name;
		this.authdomain = authdomain;
		this.url = url;
		this.token = token;
		this.aeskey = aeskey;
		this.picurl = picurl;
		this.enable = enable;
	}
	
	
	/**
	 * 设置属性：唯一标识
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取属性：唯一标识
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置属性：应用ID
	 * @param appid
	 */
	public void setAppid(String appid) {
		this.appid = appid;
	}

	/**
	 * 获取属性：应用ID
	 * @return
	 */
	public String getAppid() {
		return appid;
	}

	/**
	 * 设置属性：应用秘钥
	 * @param appsecret
	 */
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	/**
	 * 获取属性：应用秘钥
	 * @return
	 */
	public String getAppsecret() {
		return appsecret;
	}

	/**
	 * 获取属性：应用名称
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置属性：应用名称
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 设置属性：授权域名
	 * 
	 * @param
	 */
	public void setAuthdomain(String authdomain) {
		this.authdomain = authdomain;
	}

	/**
	 * 获取属性：授权域名
	 * 
	 * @return
	 */
	public String getAuthdomain() {
		return authdomain;
	}

	/**
	 * 设置属性：回调URL
	 * 
	 * @param
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取属性：回调URL
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置属性：令牌
	 * 
	 * @param
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * 获取属性：令牌
	 * 
	 * @return
	 */
	public String getToken() {
		return token;
	}

	/**
	 * 设置属性：密钥
	 * 
	 * @param
	 */
	public void setAeskey(String aeskey) {
		this.aeskey = aeskey;
	}

	/**
	 * 获取属性：密钥
	 * 
	 * @return
	 */
	public String getAeskey() {
		return aeskey;
	}

	/**
	 * 设置属性：应用图片URL
	 * 
	 * @param
	 */
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	/**
	 * 获取属性：应用图片URL
	 * 
	 * @return
	 */
	public String getPicurl() {
		return picurl;
	}

	/**
	 * 设置属性：启用标志
	 * 
	 * @param
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	/**
	 * 获取属性：启用标志
	 * 
	 * @return
	 */
	public Integer getEnable() {
		return enable;
	}

	public String getAccountschema() {
		return accountschema;
	}

	public void setAccountschema(String accountschema) {
		this.accountschema = accountschema;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj.getClass() != getClass()){
			return false;
		}
		if(obj instanceof WxAccount){
			if(((WxAccount) obj).getAppid().equals(this.getAppid()) && ((WxAccount) obj).getAppsecret().equals(this.getAppsecret())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
