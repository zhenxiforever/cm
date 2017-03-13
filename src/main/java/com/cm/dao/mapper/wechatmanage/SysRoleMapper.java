package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysRole;

public interface SysRoleMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param roleid
     * wechatmanage..sys_role
     */
    int deleteByPrimaryKey(Integer roleid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_role
     */
    int insert(SysRole record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_role
     */
    int insertSelective(SysRole record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param roleid
     * wechatmanage..sys_role
     */
    SysRole selectByPrimaryKey(Integer roleid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechatmanage..sys_role
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechatmanage..sys_role
     */
    int updateByPrimaryKey(SysRole record);
}