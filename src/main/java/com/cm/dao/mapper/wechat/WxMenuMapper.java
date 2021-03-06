package com.cm.dao.mapper.wechat;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cm.dao.model.wechat.WxMenu;
import com.smile.wechat.model.pojo.WechatMenu;

public interface WxMenuMapper {
    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键删除数据库的记录
     *
     * @param id
     * wechat..wx_menu
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechat..wx_menu
     */
    int insert(WxMenu record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 插入数据库记录
     *
     * @param record
     * wechat..wx_menu
     */
    int insertSelective(WxMenu record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键获取一条数据库记录
     *
     * @param id
     * wechat..wx_menu
     */
    WxMenu queryMenuById(@Param("schema")String schema,@Param("id")String id);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新部分数据库记录
     *
     * @param record
     * wechat..wx_menu
     */
    int updateByPrimaryKeySelective(WxMenu record);

    /**
     * @author lenovo
     * This element is automatically generated by MyBatis Generator, do not modify. Tue Dec 20 14:01:40 CST 2016
     * 根据主键来更新数据库记录
     *
     * @param record
     * wechat..wx_menu
     */
    int updateByPrimaryKey(WxMenu record);
    
    /**
	 * 根据公众号id 获取公众号父菜单下子菜单列表
	 * @author smile
	 * @date 2016年6月28日
	 * @param accountid
	 * @param parent_id
	 * @return List<WechatMenu>
	 */
	public List<WxMenu> queryMenuListByParentId(@Param("schema")String schema,@Param("parentid")String parent_id);
}