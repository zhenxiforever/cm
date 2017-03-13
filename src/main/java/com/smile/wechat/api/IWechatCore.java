package com.smile.wechat.api;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.smile.wechat.exception.WechatException;
import com.smile.wechat.model.pojo.NewsItem;
import com.smile.wechat.model.pojo.TradeResultFromWechat;
import com.smile.wechat.model.pojo.WechatAccount;
import com.smile.wechat.model.pojo.WechatGroup;
import com.smile.wechat.model.pojo.WechatMenu;
import com.smile.wechat.model.pojo.WechatUser;
import com.smile.wechat.model.pojo.WechatUserOpenid;


public interface IWechatCore {


	public WechatAccount getWechatAccount();

	public void setWechatAccount(WechatAccount wechatAccount);
	
	/**
	 * 获取用户基本信息，返回null代表此用户没有关注该公众号，拉取不到其余信息。
	 * 
	 * @param open_id
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   WechatUser getWXUserInfo(String openId) throws WechatException,
			JSONException ;
	
	/**
	 * 获取关注者列表
	 * 关注者列表由一串OpenID（加密后的微信号，每个用户对每个公众号的OpenID是唯一的）组成。
	 * 
	 * @param next_openid 第一个拉取的OPENID，不填默认从头开始拉取
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   WechatUserOpenid getWXUserOpenId(String next_openid) throws WechatException,
			JSONException ;
	
	/**
	 * 发送客服文本消息
	 * 当用户主动发消息给公众号的时候（包括发送信息、点击自定义菜单、订阅事件、扫描二维码事件、支付成功事件、用户维权），
	 * 微信将会把消息数据推送给开发者，
	 * 开发者在一段时间内（目前修改为48小时）可以调用客服消息接口，
	 * 通过POST一个JSON数据包来发送消息给普通用户，在48小时内不限制发送次数。
	 * 
	 * @param open_id
	 * @param content
	 * @throws WechatException
	 * @throws JSONException
	 */
	public  void sendCustomTextMsg(String openId, String content)
			throws WechatException, JSONException ;
	
	/**
	 * 发送客服多图文消息
	 * 
	 * @param open_id
	 * @param newsItems
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   void sendCustomMultiGraphicMsg(String openId,
			List<NewsItem> newsItems) throws WechatException, JSONException ;
	
	
	/**
	 * 创建菜单
	 * 1、自定义菜单最多包括3个一级菜单，每个一级菜单最多包含5个二级菜单。
	 * 2、一级菜单最多4个汉字，二级菜单最多7个汉字，多出来的部分将会以“...”代替。
	 * 3、创建自定义菜单后，由于微信客户端缓存，需要24小时微信客户端才会展现出来。测试时可以尝试取消关注公众账号后再次关注，则可以看到创建后的效果。
	 * 参数说明：
	 * button	 必须	 一级菜单数组，个数应为1~3个,最多4个汉字(不超过16个字节)
	 * sub_button	 否	 二级菜单数组，个数应为1~5个,最多7个汉字(不超过40个字节)
	 * type	 必须	 菜单的响应动作类型
	 * name	必须	 菜单标题，不超过16个字节，子菜单不超过40个字节
	 * key	 click等点击类型必须	 菜单KEY值，用于消息接口推送，不超过128字节
	 * url	 view类型必须	 网页链接，用户点击菜单可打开链接，不超过256字节
	 * media_id	 media_id类型和view_limited类型必须	 调用新增永久素材接口返回的合法media_id
	 * 
	 * @param menu_list
	 * @throws JSONException
	 * @throws WechatException
	 */
	public   void createWXMenu(List<WechatMenu> menu_list) throws JSONException,
			WechatException ;
	
	/**
	 * 查询分组
	 * 
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   List<WechatGroup> getWXGroups() throws WechatException, JSONException ;
	
	
	/**
	 * 创建分组
	 * 
	 * @param name
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   int createWXGroup(String name) throws WechatException, JSONException ;
	
	
	/**
	 * 修改分组名
	 * 
	 * @param id
	 * @param name
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   int updateWXGroup(int id, String name) throws WechatException,
			JSONException ;
	
	/**
	 * 移动用户分组
	 * 
	 * @param open_id
	 * @param to_group_id
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   void updateWXGroupMember(String open_id, int to_group_id)
			throws WechatException, JSONException ;
	
	/**
	 * 创建带参数二维码
	 * 目前有2种类型的二维码：
	 * 1、临时二维码，有过期时间，最长可设置7天（即604800秒）后过期，能够生成较多数量。主要用于帐号绑定等不要求二维码永久保存的业务场景
	 * 2、永久二维码，无过期时间，目前最多10万个。主要用于适用于帐号绑定、用户来源统计等场景。
	 * 获取带参数的二维码的过程包括两步，首先创建二维码ticket，然后凭借ticket到指定URL换取二维码。
	 * 每次创建二维码ticket需要提供一个开发者自行设定的参数（scene_id）
	 * 
	 * @param action_type 0:临时二维码  1:永久二维码
	 * @param expire_seconds 该二维码有效时间，以秒为单位。 最大不超过604800（即7天）
	 * @param scene_id 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
	 * @return
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   String createQrcode(int action_type, int expire_seconds, int scene_id)
			throws WechatException, JSONException ;
	
	/**
	 * 发送模板信息
	 * @param jsonstr
	 * @throws WechatException
	 * @throws JSONException
	 */
	public   TradeResultFromWechat sendTemplateMsg(String jsonstr) throws WechatException,
			JSONException ;
	
	/**
	 * 上传多媒体
	 * 
	 * @param mediaType 图片(image),语音(voice),视频(video),普通文件(file)
	 * @param mediaPath 媒体文件路径
	 * @return
	 * @throws Exception
	 */
	public   JSONObject uploadMedia(String mediaType, String mediaPath)
			throws Exception ;
	
	
}
