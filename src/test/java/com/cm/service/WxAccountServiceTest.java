package com.cm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cm.Application;
import com.cm.dao.model.wechatmanage.WxAccount;
import com.smile.wechat.model.pojo.WechatAccount;
import com.smile.wechat.service.IWechatAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class WxAccountServiceTest {

	@Autowired
	private IWechatAccountService wechatAccountService;
	
	@Test
	public void loadAccountList(){
		List<WxAccount> list = wechatAccountService.getAccountList();
		if(list!=null){
			System.out.println(list.toString());
		}else{
			System.out.println("list is null");
		}
		WechatAccount wa = wechatAccountService.getWechatAccountById("wj_test");
		System.out.println(wa);
	}
}
