package com.cm.config;


//@Component  
//@ConfigurationProperties(prefix="weixin",locations="classpath:config/wechat.properties") 
public class WechatPropertiesConfig {

	private String server_prefix;
	
	private String token_suffix;
	
	private String user_info_suffix;
	
	private String user_get_suffix;
	
	private String message_custom_send_suffix;
	
	private String menu_create_suffix;
	
	private String groups_get_suffix;
	
	private String groups_create_suffix;
	
	private String groups_update_suffix;
	
	private String groups_members_update_suffix;
	
	private String qrcode_create_suffix;
	
	private String qrcode_show_url;
	
	private String send_template_msg_suffix;
	
	private String media_upload;
	
	private String connect_oauth2_authorize_info;
	
	private String connect_oauth2_authorize_base;
	
	private String connect_oauth2_access_token;
	
	private String connect_oauth2_userinfo;

	public String getServer_prefix() {
		return server_prefix;
	}

	public void setServer_prefix(String server_prefix) {
		this.server_prefix = server_prefix;
	}

	public String getToken_suffix() {
		return token_suffix;
	}

	public void setToken_suffix(String token_suffix) {
		this.token_suffix = token_suffix;
	}

	public String getUser_info_suffix() {
		return user_info_suffix;
	}

	public void setUser_info_suffix(String user_info_suffix) {
		this.user_info_suffix = user_info_suffix;
	}

	public String getUser_get_suffix() {
		return user_get_suffix;
	}

	public void setUser_get_suffix(String user_get_suffix) {
		this.user_get_suffix = user_get_suffix;
	}

	public String getMessage_custom_send_suffix() {
		return message_custom_send_suffix;
	}

	public void setMessage_custom_send_suffix(String message_custom_send_suffix) {
		this.message_custom_send_suffix = message_custom_send_suffix;
	}

	public String getMenu_create_suffix() {
		return menu_create_suffix;
	}

	public void setMenu_create_suffix(String menu_create_suffix) {
		this.menu_create_suffix = menu_create_suffix;
	}

	public String getGroups_get_suffix() {
		return groups_get_suffix;
	}

	public void setGroups_get_suffix(String groups_get_suffix) {
		this.groups_get_suffix = groups_get_suffix;
	}

	public String getGroups_create_suffix() {
		return groups_create_suffix;
	}

	public void setGroups_create_suffix(String groups_create_suffix) {
		this.groups_create_suffix = groups_create_suffix;
	}

	public String getGroups_update_suffix() {
		return groups_update_suffix;
	}

	public void setGroups_update_suffix(String groups_update_suffix) {
		this.groups_update_suffix = groups_update_suffix;
	}

	public String getGroups_members_update_suffix() {
		return groups_members_update_suffix;
	}

	public void setGroups_members_update_suffix(String groups_members_update_suffix) {
		this.groups_members_update_suffix = groups_members_update_suffix;
	}

	public String getQrcode_create_suffix() {
		return qrcode_create_suffix;
	}

	public void setQrcode_create_suffix(String qrcode_create_suffix) {
		this.qrcode_create_suffix = qrcode_create_suffix;
	}

	public String getQrcode_show_url() {
		return qrcode_show_url;
	}

	public void setQrcode_show_url(String qrcode_show_url) {
		this.qrcode_show_url = qrcode_show_url;
	}

	public String getSend_template_msg_suffix() {
		return send_template_msg_suffix;
	}

	public void setSend_template_msg_suffix(String send_template_msg_suffix) {
		this.send_template_msg_suffix = send_template_msg_suffix;
	}

	public String getMedia_upload() {
		return media_upload;
	}

	public void setMedia_upload(String media_upload) {
		this.media_upload = media_upload;
	}

	public String getConnect_oauth2_authorize_info() {
		return connect_oauth2_authorize_info;
	}

	public void setConnect_oauth2_authorize_info(
			String connect_oauth2_authorize_info) {
		this.connect_oauth2_authorize_info = connect_oauth2_authorize_info;
	}

	public String getConnect_oauth2_authorize_base() {
		return connect_oauth2_authorize_base;
	}

	public void setConnect_oauth2_authorize_base(
			String connect_oauth2_authorize_base) {
		this.connect_oauth2_authorize_base = connect_oauth2_authorize_base;
	}

	public String getConnect_oauth2_access_token() {
		return connect_oauth2_access_token;
	}

	public void setConnect_oauth2_access_token(String connect_oauth2_access_token) {
		this.connect_oauth2_access_token = connect_oauth2_access_token;
	}

	public String getConnect_oauth2_userinfo() {
		return connect_oauth2_userinfo;
	}

	public void setConnect_oauth2_userinfo(String connect_oauth2_userinfo) {
		this.connect_oauth2_userinfo = connect_oauth2_userinfo;
	}
	
}
