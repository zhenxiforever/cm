package com.smile.wechat.schedule.helper;

import java.util.HashMap;
import java.util.Map;

import com.smile.wechat.api.IWechatCore;
import com.smile.wechat.api.core.WechatCoreUtil;
import com.smile.wechat.model.pojo.WechatAccount;

public class WechatAccountHelper {

private static Map<String, IWechatCore> account_comm_map = new HashMap<String, IWechatCore>();
	
	public static IWechatCore getWeChatUtil(String accountId) throws Exception {
		IWechatCore weChatCore = account_comm_map.get(accountId);
		return weChatCore;
	}

	public static void put(WechatAccount weixinAccount) {
		IWechatCore comm = account_comm_map.get(weixinAccount.getId());
		if (comm == null) {
			comm = new WechatCoreUtil(weixinAccount);
			account_comm_map.put(weixinAccount.getId(), comm);
		} else if (!comm.getWechatAccount().equals(weixinAccount)) {
			comm.setWechatAccount(weixinAccount);
		}
	}
}
