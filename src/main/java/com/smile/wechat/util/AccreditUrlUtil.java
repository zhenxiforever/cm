package com.smile.wechat.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

import com.cm.config.SystemParameterHelper;
import com.cm.util.SpringBeanUtil;
import com.smile.wechat.constant.SysConfParam;
import com.smile.wechat.constant.WechatPropsParam;
import com.smile.wechat.model.pojo.WechatAccount;
import com.smile.wechat.service.IWechatAccountService;

/**
 * 组装微信授权URL工具类
 * 
 */
public class AccreditUrlUtil {
	
	private static Logger logger = Logger.getLogger(AccreditUrlUtil.class);
	
//	private static WechatPropertiesConfig wechatProperties = (WechatPropertiesConfig) SpringBeanUtil.getBean("wechatPropertiesConfig");
	
	/**
	 * 组装微信Base授权URL
	 * @param paramsUrl
	 * @param accountid
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String getWXBaseAuthURL(String paramsUrl, String accountid,String params) throws Exception {
		String url = "";
		if(accountid!=null && !"".equals(accountid)){
			url = getWXAuthURL(WechatPropsParam.WEIXIN_CONNECT_OAUTH2_AUTHORIZE_BASE ,paramsUrl, accountid, params);
		}else{
			url = getWXAuthURLNoAccount(WechatPropsParam.WEIXIN_CONNECT_OAUTH2_AUTHORIZE_BASE, paramsUrl, params);
		}
		logger.info("-------------oauth2 authorize base url:" + url);
		return url;
	}	

	/**
	 * 组装微信Base授权URL
	 * @param paramsUrl
	 * @param accountid
	 * @return
	 * @throws Exception
	 */
	public static String getWXBaseAuthURL(String paramsUrl,
			String accountid) throws Exception {

		return getWXBaseAuthURL(paramsUrl, accountid,null);
	}
	
	/**
	 * 组装微信Info授权URL
	 * @param paramsUrl
	 * @param accountid
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String getWXInfoAuthURL(String paramsUrl, String accountid,String params) throws Exception {
		
		String url = getWXAuthURL(WechatPropsParam.WEIXIN_CONNECT_OAUTH2_AUTHORIZE_INFO ,paramsUrl, accountid, params);
		logger.info("-------------oauth2 authorize info url:" + url);
		return url;
	}	

	/**
	 * 组装微信Info授权URL
	 * @param paramsUrl
	 * @param accountid
	 * @return
	 * @throws Exception
	 */
	public static String getWXInfoAuthURL(String paramsUrl,
			String accountid) throws Exception {
		return getWXInfoAuthURL(paramsUrl, accountid,null);
	}
	
	/**
	 * 组装微信授权URL
	 * @param authType
	 * @param paramsUrl
	 * @param accountid
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws UnsupportedEncodingException
	 */
	private static String getWXAuthURL(String authType,String paramsUrl, String accountid,
			String params) throws Exception, UnsupportedEncodingException {
		if(StringUtils.isEmpty(paramsUrl)){
			logger.info("-------------AccreditUrlUtil,paramsUrl is null");
			return "";
		}
		if(StringUtils.isEmpty(accountid)){
			logger.info("-------------AccreditUrlUtil,accountid is null");
			return "";
		}
		String url = SystemParameterHelper.getValue(SysConfParam.WX_WEB_SERVER_OAUTH_URL)
				+ SystemParameterHelper.getValue(SysConfParam.WX_WEB_SERVER_CONTEXT)
				+ paramsUrl + "?t=" + System.currentTimeMillis();
		url = url + "&accountId=" + accountid;
		if (params != null) {
			url = url + "&params=" + params;
		}
		
		IWechatAccountService wechatccountDao = (IWechatAccountService) SpringBeanUtil.getBean("wechatAccountService");		
		WechatAccount account = wechatccountDao.getWechatAccountById(accountid);
		if(account==null){
			logger.info("-------------AccreditUrlUtil,check wxb_wechat_account table has data accountid="+accountid);
			return "";
		}
		url = URLEncoder.encode(url, "UTF-8");
		String wx_auth_url = WechatPropsUtil.getProperty(authType);
		url = String.format(wx_auth_url, account.getAppid(), url);
		return url;
	}
	/**
	 * 组装微信授权URL
	 * @param authType
	 * @param paramsUrl
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws UnsupportedEncodingException
	 */
	private static String getWXAuthURLNoAccount(String authType,String paramsUrl,
			String params) throws Exception, UnsupportedEncodingException {
		if(StringUtils.isEmpty(paramsUrl)){
			logger.info("-------------AccreditUrlUtil,paramsUrl is null");
			return "";
		}
		String appid = SystemParameterHelper.getValue(SysConfParam.APPID);
		String url = SystemParameterHelper
				.getValue(SysConfParam.WX_WEB_SERVER_OAUTH_URL)
				+ SystemParameterHelper
				.getValue(SysConfParam.WX_WEB_SERVER_CONTEXT)
				+ paramsUrl + "?t=" + System.currentTimeMillis();
		if (params != null) {
			url = url + "&" +params;
		}
		
		url = URLEncoder.encode(url, "UTF-8");
		String wx_auth_url = WechatPropsUtil.getProperty(authType);
		url = String.format(wx_auth_url, appid, url);
		return url;
	}

}
