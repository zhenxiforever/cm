package com.smile.wechat.util;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/**
 * String 工具类
 * 
 * @project SmileWechat
 * @author smile
 * @createDate 2016年9月7日
 */
public class StringUtils {

	/**
	 * 是否为空，集合判empty，字符串不为空字符串，其他类型不为null
	 * @author smile
	 * @date 2016年9月7日
	 * @param obj
	 * @return boolean
	 */
	public static boolean isBlankOrEmpty(Object obj){
		if(obj == null){
			return true;
		}else if(obj instanceof Collection) {
			@SuppressWarnings("rawtypes")
			Collection collection = (Collection) obj;
			return collection.isEmpty();
		}else if(obj instanceof String){
			String str = (String) obj;
			return "".equals(str.trim());
		}else if (obj instanceof CharSequence){
			return ((CharSequence) obj).length() == 0;
		}else if (obj instanceof Map){
			return ((Map) obj).isEmpty();
		}else if(obj instanceof Object[]){
			Object[] object = (Object[]) obj;
			if (object.length == 0) {
				return true;
			}
			boolean empty = true;
			for (int i = 0; i < object.length; i++) {
				if (!isBlankOrEmpty(object[i])) {
					empty = false;
					break;
				}
			}
			return empty;
		}
		return false;
	}
	
	/**
	 * 
	 *
	 * @author smile
	 * @data 2016年12月20日
	 * @param str
	 * @return 
	 * @return boolean
	 */
	public static boolean isEmpty(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}
	
	public static String getUUID(){
		UUID uuid=UUID.randomUUID();
		String id=uuid.toString().replace("-", "").toUpperCase();
		return id;
	}
}
