package com.smile.wechat.api.core;

import javax.servlet.http.HttpServletRequest;

import com.smile.wechat.api.IRequestService;
import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;
import com.smile.wechat.model.message.response.impl.TextResponseMessage;

/**
 *  小视频消息对象服务
 * 
 * @author smile
 * @date 2016年6月29日
 */
public class ShortvideoRequestServiceImpl implements IRequestService {

	@Override
	public ResponseMessage handle(HttpServletRequest request,
			RequestMessage requestMessage) throws Exception {
		TextResponseMessage responseMessage = new TextResponseMessage(
				requestMessage);
		responseMessage.setContent("短视频消息回复");
		return responseMessage;
	}

}
