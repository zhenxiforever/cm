package com.cm.dao.model.wechatmanage;

import java.io.Serializable;

public class SysFuncUrl extends SysFuncUrlKey implements Serializable {
    /**
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     * 是否禁用；1:禁用；0:启用
     * @table : wechatmanage..sys_func_url
     * @column : DISABLE :INTEGER
     */
    private Integer disable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechatmanage..sys_func_url
     *
     * @mbggenerated Tue Dec 20 14:01:40 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     * @author : lenovo
     * This field was generated by MyBatis Generator. Tue Dec 20 14:01:40 CST 2016
     *
     * @return wechatmanage..sys_func_url.DISABLE:[是否禁用；1:禁用；0:启用]
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