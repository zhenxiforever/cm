package com.smile.wechat.api.core;

import javax.servlet.http.HttpServletRequest;

import com.smile.wechat.api.IRequestService;
import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;

/**
 * 模版消息结果 事件推送消息对象服务
 * 
 * @author smile
 * @date 2016年6月29日
 */
public class TemplateEventRequestServiceImpl implements IRequestService {

	@Override
	public ResponseMessage handle(HttpServletRequest request,
			RequestMessage requestMessage) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
