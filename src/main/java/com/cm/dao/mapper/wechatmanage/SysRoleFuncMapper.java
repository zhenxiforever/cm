package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysRoleFuncKey;

public interface SysRoleFuncMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param key
     * wechatmanage..sys_role_func
     */
    int deleteByPrimaryKey(SysRoleFuncKey key);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_role_func
     */
    int insert(SysRoleFuncKey record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_role_func
     */
    int insertSelective(SysRoleFuncKey record);
}