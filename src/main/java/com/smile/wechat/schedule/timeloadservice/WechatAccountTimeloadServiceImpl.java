package com.smile.wechat.schedule.timeloadservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.dao.model.wechatmanage.WxAccount;
import com.smile.wechat.model.pojo.WechatAccount;
import com.smile.wechat.schedule.TimeLoading;
import com.smile.wechat.schedule.helper.WechatAccountHelper;
import com.smile.wechat.service.IWechatAccountService;

/**
 * 从数据库加载微信帐号信息
 * 
 * @project cm
 * @author smile
 * @date 2017年2月25日
 */
@Service
public class WechatAccountTimeloadServiceImpl implements TimeLoading {

	@Autowired
	private IWechatAccountService wechatAccountService;
	
	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		if(wechatAccountService!=null){
			List<WxAccount> list = wechatAccountService.getAccountList();
			if(list!=null){
				for(WechatAccount account:list){
					String appId = account.getAppid();
					String appSecret = account.getAeskey();
					if(appId!=null&&appSecret!=null){
						WechatAccountHelper.put(account);
					}
				}
			}
		}
	}

}
