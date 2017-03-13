package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysUrl;

public interface SysUrlMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param id
     * wechatmanage..sys_url
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_url
     */
    int insert(SysUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_url
     */
    int insertSelective(SysUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param id
     * wechatmanage..sys_url
     */
    SysUrl selectByPrimaryKey(Integer id);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechatmanage..sys_url
     */
    int updateByPrimaryKeySelective(SysUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechatmanage..sys_url
     */
    int updateByPrimaryKey(SysUrl record);
}