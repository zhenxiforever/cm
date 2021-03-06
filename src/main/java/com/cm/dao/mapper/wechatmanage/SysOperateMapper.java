package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysOperate;

public interface SysOperateMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param operid
     * wechatmanage..sys_operate
     */
    int deleteByPrimaryKey(Integer operid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_operate
     */
    int insert(SysOperate record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_operate
     */
    int insertSelective(SysOperate record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param operid
     * wechatmanage..sys_operate
     */
    SysOperate selectByPrimaryKey(Integer operid);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechatmanage..sys_operate
     */
    int updateByPrimaryKeySelective(SysOperate record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechatmanage..sys_operate
     */
    int updateByPrimaryKey(SysOperate record);
}