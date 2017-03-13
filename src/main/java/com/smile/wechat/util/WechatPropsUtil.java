package com.smile.wechat.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;

/**
 * 配置文件工具类
 * 
 */
public class WechatPropsUtil {

	private static final Logger log = Logger.getLogger(WechatPropsUtil.class);
	private static final String WECHAT_DEFAULT_PROPERTIES_FILE = "wechat.properties";

	private static Properties props = null;

	public static String getProperty(String key) {
		return props.getProperty(key);
	}

	public static void doConfigure(){
		if(props==null){
			props = new Properties();
			URL classPathURL = WechatPropsUtil.class.getClass().getResource("/"+WECHAT_DEFAULT_PROPERTIES_FILE);
			if(classPathURL==null){
				URL currentURL = WechatPropsUtil.class.getClass().getResource(WECHAT_DEFAULT_PROPERTIES_FILE);
				doConfigure(currentURL);
			}else{
				doConfigure(classPathURL);
			}
			
		}
	}
	
	public static void doConfigure(String configFileName) {
		props = new Properties();
		FileInputStream istream = null;
		try {
			istream = new FileInputStream(configFileName);
			props.load(istream);
			istream.close();
		} catch (Exception e) {
			if (e instanceof InterruptedIOException
					|| e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
			LogLog.error("Could not read configuration file [" + configFileName
					+ "].", e);
			LogLog.error("Ignoring configuration file [" + configFileName
					+ "].");
			return;
		} finally {
			if (istream != null) {
				try {
					istream.close();
				} catch (InterruptedIOException ignore) {
					Thread.currentThread().interrupt();
				} catch (Throwable ignore) {
				}

			}
		}
	}

	public static void doConfigure(InputStream inputStream) {
		props = new Properties();
		try {
			props.load(inputStream);
		} catch (IOException e) {
			if (e instanceof InterruptedIOException) {
				Thread.currentThread().interrupt();
			}
			LogLog.error(
					"Could not read Wechat configuration file from InputStream ["
							+ inputStream + "].", e);
			LogLog.error("Ignoring configuration InputStream [" + inputStream
					+ "].");
			return;
		}
	}

	public static void doConfigure(URL configURL) {
		props = new Properties();
		LogLog.debug("Reading Wechat configuration from URL " + configURL);
		InputStream istream = null;
		URLConnection uConn = null;
		try {
			uConn = configURL.openConnection();
			uConn.setUseCaches(false);
			istream = uConn.getInputStream();
			props.load(istream);
		} catch (Exception e) {
			if (e instanceof InterruptedIOException
					|| e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
			LogLog.error("Could not read Wechat configuration file from URL ["
					+ configURL + "].", e);
			LogLog.error("Ignoring configuration file [" + configURL + "].");
			return;
		} finally {
			if (istream != null) {
				try {
					istream.close();
				} catch (InterruptedIOException ignore) {
					Thread.currentThread().interrupt();
				} catch (IOException ignore) {
				} catch (RuntimeException ignore) {
				}
			}
		}
	}
}
