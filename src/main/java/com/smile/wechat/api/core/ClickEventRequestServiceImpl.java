package com.smile.wechat.api.core;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.cm.dao.mapper.wechat.WxMenuMapper;
import com.cm.dao.model.wechat.WxMenu;
import com.smile.wechat.model.message.request.EventRequestMessage;
import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;

/**
 * 上报菜单事件请求服务
 * 
 * @project wechatCore
 * @author smile
 * @createDate 2016年6月27日
 */
public class ClickEventRequestServiceImpl extends AbstractRequestService {	

	private static Logger logger = Logger.getLogger(ClickEventRequestServiceImpl.class);

	private WxMenuMapper wxMenuMapper;
	
	
	@Override
	public ResponseMessage handle(HttpServletRequest request,RequestMessage requestMessage) throws Exception {
		ResponseMessage responseMessage=null;
		EventRequestMessage eventRequestMessage=(EventRequestMessage)requestMessage;
		WxMenu weixinMenu=wxMenuMapper.queryMenuById(requestMessage.getAccountId(),eventRequestMessage.getEventKey());
		if(weixinMenu!=null){
			responseMessage=handle(requestMessage, weixinMenu.getContent());
		}else{
			logger.info("-----weixinMenu is null,please check wxb_menu table data");
		}
		return responseMessage;
	}
	
}
