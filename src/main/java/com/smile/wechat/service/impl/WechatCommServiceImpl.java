package com.smile.wechat.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smile.wechat.api.IWechatCore;
import com.smile.wechat.constant.WechatErrorCode;
import com.smile.wechat.exception.WechatException;
import com.smile.wechat.model.pojo.NewsItem;
import com.smile.wechat.model.pojo.ResultMsgFromWechat;
import com.smile.wechat.model.pojo.TradeResultFromWechat;
import com.smile.wechat.model.pojo.WechatMenu;
import com.smile.wechat.model.pojo.WechatUser;
import com.smile.wechat.model.pojo.WechatUserOpenid;
import com.smile.wechat.schedule.helper.WechatAccountHelper;
import com.smile.wechat.service.IWechatCommService;

@Service
public class WechatCommServiceImpl implements IWechatCommService {

	@Override
	public WechatUser getUserInfo(String accountId, String openid)
			throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				return wechatCore.getWXUserInfo(openid);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public int createWXGroup(String accountId, String group_name)
			throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				return wechatCore.createWXGroup(group_name);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public ResultMsgFromWechat updateWXGroup(String accountId, int group_id,
			String group_name) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				int groupId = wechatCore.updateWXGroup(group_id,group_name);
				return new ResultMsgFromWechat(groupId==group_id);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public ResultMsgFromWechat updateWXGroupMember(String accountId,
			int to_group_id, String... open_id_list) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				for(String open_id:open_id_list)
					wechatCore.updateWXGroupMember(open_id, to_group_id);
				return new ResultMsgFromWechat(true);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public String createQrcode(String accountId, int action_type,
			int expire_seconds, int scene_id) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				return wechatCore.createQrcode(action_type,expire_seconds,scene_id);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public ResultMsgFromWechat sendCustomTextMsg(String accountId,
			String openid, String content) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				wechatCore.sendCustomTextMsg(openid,content);
				return new ResultMsgFromWechat(true);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public ResultMsgFromWechat sendCustomMultiGraphicMsg(String accountId,
			String open_id, List<NewsItem> newsItems) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				wechatCore.sendCustomMultiGraphicMsg(open_id,newsItems);
				return new ResultMsgFromWechat(true);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public ResultMsgFromWechat createWXMenu(String accountId,
			List<WechatMenu> menu_list) throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				wechatCore.createWXMenu(menu_list);
				return new ResultMsgFromWechat(true);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public WechatUserOpenid getWXUserOpenId(String accountId, String next_openid)
			throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				return wechatCore.getWXUserOpenId(next_openid);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

	@Override
	public TradeResultFromWechat sendMsgTrade(String json, String accountId)
			throws WechatException {
		try {
			IWechatCore wechatCore = WechatAccountHelper.getWeChatUtil(accountId);
			if(wechatCore!=null){
				return wechatCore.sendTemplateMsg(json);
			}else{
				throw new WechatException(WechatErrorCode.ACCOUNT_NOT_EXIST,"未获取到帐号["+accountId+"]对应的wechat处理类!");
			}
		}catch (WechatException e) {
			throw e;
		}catch (Exception e) {
			throw new WechatException("获取用户信息失败",e);
		}
	}

}
