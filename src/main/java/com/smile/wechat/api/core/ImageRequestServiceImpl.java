package com.smile.wechat.api.core;

import javax.servlet.http.HttpServletRequest;

import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;
import com.smile.wechat.model.message.response.impl.TextResponseMessage;

/**
 * 图片消息对象服务
 * 
 * @project wechatCore
 * @author smile
 * @createDate 2016年6月27日
 */
public class ImageRequestServiceImpl extends AbstractRequestService  {
	
	@Override
	public ResponseMessage handle(HttpServletRequest request,RequestMessage requestMessage) throws Exception {
		TextResponseMessage responseMessage = new TextResponseMessage(requestMessage);
		responseMessage.setContent("图片默认回复");
		return responseMessage;
	}

}
