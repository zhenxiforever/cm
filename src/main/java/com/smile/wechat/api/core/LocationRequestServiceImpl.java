package com.smile.wechat.api.core;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.request.impl.LocationRequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;
import com.smile.wechat.model.message.response.impl.TextResponseMessage;

/**
 * 地理位置对象 消息服务
 * 
 * @project wechatCore
 * @author smile
 * @createDate 2016年6月27日
 */
public class LocationRequestServiceImpl extends AbstractRequestService {

	private static Logger logger = Logger.getLogger(LocationRequestServiceImpl.class);

	@Override
	public ResponseMessage handle(HttpServletRequest request,RequestMessage requestMessage)
			throws Exception {

		// TODO 上传地理位置逻辑处理暂时为空，后续根据需要在此处新增业务逻辑处理
		logger.info("------------------LocationRequestServiceImpl not deal");
		LocationRequestMessage locationRequestMessage = (LocationRequestMessage) requestMessage;

		TextResponseMessage responseMessage = new TextResponseMessage(
				requestMessage);

		responseMessage.setContent("地理位置默认信息");

		return responseMessage;
	}

}
