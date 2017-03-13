package com.cm.dao.model.wechatmanage;

import java.io.Serializable;

public class SysUser implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 用户id
     * @table : wechatmanage..sys_user
     * @column : USERID :VARCHAR
     */
    private String userid;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 用户名称
     * @table : wechatmanage..sys_user
     * @column : USERNAME :VARCHAR
     */
    private String username;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 登陆密码
     * @table : wechatmanage..sys_user
     * @column : PASSWORD :VARCHAR
     */
    private String password;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 用户联系方式
     * @table : wechatmanage..sys_user
     * @column : TEL :VARCHAR
     */
    private String tel;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 是否禁用；1:禁用；0:启用
     * @table : wechatmanage..sys_user
     * @column : DISABLE :INTEGER
     */
    private Integer disable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechatmanage..sys_user
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_user.USERID:[用户id]
     */
    public String getUserid() {
        return userid;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param userid  用户id
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_user.USERNAME:[用户名称]
     */
    public String getUsername() {
        return username;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param username  用户名称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_user.PASSWORD:[登陆密码]
     */
    public String getPassword() {
        return password;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param password  登陆密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_user.TEL:[用户联系方式]
     */
    public String getTel() {
        return tel;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param tel  用户联系方式
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_user.DISABLE:[是否禁用；1:禁用；0:启用]
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param disable  是否禁用；1:禁用；0:启用
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }
}