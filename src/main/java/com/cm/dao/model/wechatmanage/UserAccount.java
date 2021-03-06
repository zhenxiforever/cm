package com.cm.dao.model.wechatmanage;

import java.io.Serializable;

public class UserAccount implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 用户id
     * @table : wechatmanage..user_account
     * @column : USERID :VARCHAR
     */
    private String userid;

    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 公众号id
     * @table : wechatmanage..user_account
     * @column : ACCOUNTID :VARCHAR
     */
    private String accountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechatmanage..user_account
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..user_account.USERID:[用户id]
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
     * @return wechatmanage..user_account.ACCOUNTID:[公众号id]
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * set method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @param accountid  公众号id
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }
}