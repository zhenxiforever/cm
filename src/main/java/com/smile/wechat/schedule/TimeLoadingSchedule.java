package com.smile.wechat.schedule;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;

public class TimeLoadingSchedule {

	private static final Logger log = Logger.getLogger(TimeLoadingSchedule.class);
	private final Set<TimeLoading> minuteLoadingList = new HashSet<TimeLoading>();
	private ScheduledExecutorService service;
	
	public void init(WebApplicationContext wac){
		log.info("定时任务初始化开始......");
		
		minuteLoadingList.add(wac.getBean("wechatAccountTimeloadServiceImpl", TimeLoading.class));
		
		service=Executors.newScheduledThreadPool(1);
		//10分钟加载一次
		service.scheduleWithFixedDelay(new Runnable(){
			//private boolean running = false;
			public void run() {
				//if (!running){
					//running = true;
					log.info("分钟定时加载数据开始..................");
					Iterator<TimeLoading> it = minuteLoadingList.iterator();
					while(it.hasNext()){
						TimeLoading tl = it.next();
						try {
							tl.loadData();
						} catch (Exception e) {						
							log.error("Exception:",e);
						}
					}
					log.info("分钟定时加载完毕......");
					//running = false;
				//}
			}
		},0, 10, TimeUnit.MINUTES);
		log.info("定时任务初始化完成......");
	}
}
