package com.cm.dao.model.wechat;

import java.io.Serializable;
import java.util.Date;

public class WxQrcode implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 二维码id
     * @table : wechat..wx_qrcode
     * @column : QRCODEID :VARCHAR
     */
    private String qrcodeid;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 二维码tiket，用于换取二维码
     * @table : wechat..wx_qrcode
     * @column : TICKET :VARCHAR
     */
    private String ticket;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 
     * @table : wechat..wx_qrcode
     * @column : CHANNEL :VARCHAR
     */
    private String channel;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 二维码类型
     * @table : wechat..wx_qrcode
     * @column : ACTIONTYPE :INTEGER
     */
    private Integer actiontype;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 有效时间
     * @table : wechat..wx_qrcode
     * @column : EXPIRESECONDS :INTEGER
     */
    private Integer expireseconds;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 场景值id
     * @table : wechat..wx_qrcode
     * @column : SCENEID :INTEGER
     */
    private Integer sceneid;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 场景值id，字符串类型。仅用于永久二维码
     * @table : wechat..wx_qrcode
     * @column : SCENESTR :VARCHAR
     */
    private String scenestr;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 状态
     * @table : wechat..wx_qrcode
     * @column : ONLINESTATUS :INTEGER
     */
    private Integer onlinestatus;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 创建时间
     * @table : wechat..wx_qrcode
     * @column : CREATETIME :TIMESTAMP
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat..wx_qrcode
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * 微信用户所属服务号应用id
     */
    private String accountid;
    /**
     * 微信用户所属服务号应用schema
     */
    private String schema;
    
    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.QRCODEID:[二维码id]
     */
    public String getQrcodeid() {
        return qrcodeid;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param qrcodeid  二维码id
     */
    public void setQrcodeid(String qrcodeid) {
        this.qrcodeid = qrcodeid == null ? null : qrcodeid.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.TICKET:[二维码tiket，用于换取二维码]
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param ticket  二维码tiket，用于换取二维码
     */
    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.CHANNEL:[]
     */
    public String getChannel() {
        return channel;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param channel  
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.ACTIONTYPE:[二维码类型]
     */
    public Integer getActiontype() {
        return actiontype;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param actiontype  二维码类型
     */
    public void setActiontype(Integer actiontype) {
        this.actiontype = actiontype;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.EXPIRESECONDS:[有效时间]
     */
    public Integer getExpireseconds() {
        return expireseconds;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param expireseconds  有效时间
     */
    public void setExpireseconds(Integer expireseconds) {
        this.expireseconds = expireseconds;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.SCENEID:[场景值id]
     */
    public Integer getSceneid() {
        return sceneid;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param sceneid  场景值id
     */
    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.SCENESTR:[场景值id，字符串类型。仅用于永久二维码]
     */
    public String getScenestr() {
        return scenestr;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param scenestr  场景值id，字符串类型。仅用于永久二维码
     */
    public void setScenestr(String scenestr) {
        this.scenestr = scenestr == null ? null : scenestr.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.ONLINESTATUS:[状态]
     */
    public Integer getOnlinestatus() {
        return onlinestatus;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param onlinestatus  状态
     */
    public void setOnlinestatus(Integer onlinestatus) {
        this.onlinestatus = onlinestatus;
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechat..wx_qrcode.CREATETIME:[创建时间]
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param createtime  创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    
    /**
     * 微信用户所属服务号应用id
     */
	public String getAccountid() {
		return accountid;
	}

	/**
     * 微信用户所属服务号应用id
     */
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	/**
     * 微信用户所属服务号应用schema
     */
	public String getSchema() {
		return schema;
	}

	/**
     * 微信用户所属服务号应用schema
     */
	public void setSchema(String schema) {
		this.schema = schema;
	}
}