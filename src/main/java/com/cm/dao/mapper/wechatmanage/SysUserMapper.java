package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysUser;

public interface SysUserMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param userid
     * wechatmanage..sys_user
     */
    int deleteByPrimaryKey(String userid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_user
     */
    int insert(SysUser record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_user
     */
    int insertSelective(SysUser record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param userid
     * wechatmanage..sys_user
     */
    SysUser selectByPrimaryKey(String userid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechatmanage..sys_user
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechatmanage..sys_user
     */
    int updateByPrimaryKey(SysUser record);
}