package com.cm.dao.mapper.wechatmanage;

import com.cm.dao.model.wechatmanage.SysFuncUrl;
import com.cm.dao.model.wechatmanage.SysFuncUrlKey;

public interface SysFuncUrlMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param key
     * wechatmanage..sys_func_url
     */
    int deleteByPrimaryKey(SysFuncUrlKey key);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_func_url
     */
    int insert(SysFuncUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechatmanage..sys_func_url
     */
    int insertSelective(SysFuncUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param key
     * wechatmanage..sys_func_url
     */
    SysFuncUrl selectByPrimaryKey(SysFuncUrlKey key);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechatmanage..sys_func_url
     */
    int updateByPrimaryKeySelective(SysFuncUrl record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechatmanage..sys_func_url
     */
    int updateByPrimaryKey(SysFuncUrl record);
}