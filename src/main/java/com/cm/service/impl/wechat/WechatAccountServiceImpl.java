package com.cm.service.impl.wechat;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cm.dao.mapper.wechatmanage.WxAccountMapper;
import com.cm.dao.model.wechatmanage.WxAccount;
import com.cm.service.impl.BaseService;
import com.smile.wechat.model.pojo.WechatAccount;
import com.smile.wechat.service.IWechatAccountService;

@Service
public class WechatAccountServiceImpl extends BaseService implements IWechatAccountService {

	private static Logger logger = Logger.getLogger(WechatAccountServiceImpl.class);
	
//	private WxAccountMapper wxAccountMapper;
	
	@Override
	public List<WxAccount> getAccountList() {
		// TODO Auto-generated method stub
		WxAccountMapper wxAccountMapper = sqlSession.getMapper(WxAccountMapper.class);
		List<WxAccount> wxAccountList = wxAccountMapper.getWechatAccountList();
		return wxAccountList;
	}

	@Override
	public WechatAccount getWechatAccountById(String accountId) {
		// TODO Auto-generated method stub
		WxAccountMapper wxAccountMapper = sqlSession.getMapper(WxAccountMapper.class);
		WxAccount wxAccount = wxAccountMapper.getWechatAccountById(accountId);
		return wxAccount;
	}

}
