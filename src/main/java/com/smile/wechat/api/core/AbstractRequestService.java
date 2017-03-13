package com.smile.wechat.api.core;

import org.apache.log4j.Logger;

import com.smile.wechat.api.IRequestService;
import com.smile.wechat.model.message.request.RequestMessage;
import com.smile.wechat.model.message.response.ResponseMessage;
import com.smile.wechat.model.message.response.impl.TextResponseMessage;

/**
 * 请求消息对象分发接口的抽象类实现
 * 核心功能：提供统一请求消息处理
 * 
 * @project wechatCore
 * @author smile
 * @createDate 2016年6月27日
 */
public abstract class AbstractRequestService implements IRequestService{
	
	private static Logger logger = Logger.getLogger(AbstractRequestService.class);

	/**
	 * 业务组件处理接口
	 * @param requestMessage
	 * @param content
	 * @return
	 * @throws Exception 
	 */
	public ResponseMessage handle(RequestMessage requestMessage,String content) throws Exception {
		ResponseMessage responseMessage=null;
		if(content!=null){
			if(content.startsWith("module")){//进入组件处理
				responseMessage=moduleProcess(requestMessage, content);
			}else{
				responseMessage = new TextResponseMessage(requestMessage);
				responseMessage.setContent(content);
			}
		}
		return responseMessage;
	}

	/**
	 * 业务组件处理
	 * @param requestMessage
	 * @param content
	 * @return
	 */
	private ResponseMessage moduleProcess(RequestMessage requestMessage,String content){
		String module_id = content.split(":")[1];
		logger.info("Module Key:"+content);
		ResponseMessage responseMessage = new TextResponseMessage(requestMessage);
		responseMessage.setContent(content);
		return responseMessage;
	}	
}
