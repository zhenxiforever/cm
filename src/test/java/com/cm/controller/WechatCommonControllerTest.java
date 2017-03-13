package com.cm.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cm.Application;
import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringApplicationConfiguration(classes = Application.class)  
@WebAppConfiguration 
public class WechatCommonControllerTest {

	MockMvc mvc;
	
	@Autowired  
    WebApplicationContext webApplicationConnect;
	
	@Before  
    public void setUp() throws JsonProcessingException {  
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();  
    }
	
	
	@Test
	public void testDoGet() throws Exception{
		String echostr = "";  
        String uri = "/WECHAT/HANDLE";  
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON).param("accountId", "wj_test").param("echostr", echostr))
                .andReturn();  
        int status = mvcResult.getResponse().getStatus();  
        String content = mvcResult.getResponse().getContentAsString();  
  
        Assert.assertTrue("错误，正确的返回值为200", status == 200);  
        Assert.assertFalse("错误，正确的返回值为200", status != 200);  
        Assert.assertTrue("数据一致", echostr.equals(content));  
        Assert.assertFalse("数据不一致", !echostr.equals(content)); 
	}
}
