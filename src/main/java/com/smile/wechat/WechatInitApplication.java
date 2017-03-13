package com.smile.wechat;

import org.springframework.web.context.WebApplicationContext;

import com.smile.wechat.schedule.TimeLoadingSchedule;

public class WechatInitApplication {
	
	public static void contextInitialized(WebApplicationContext context){
		new TimeLoadingSchedule().init(context);
	}

}
