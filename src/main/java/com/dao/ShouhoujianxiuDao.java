package com.dao;

import com.entity.ShouhoujianxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhoujianxiuVO;
import com.entity.view.ShouhoujianxiuView;


/**
 * 售后检修
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShouhoujianxiuDao extends BaseMapper<ShouhoujianxiuEntity> {
	
	List<ShouhoujianxiuVO> selectListVO(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
	
	ShouhoujianxiuVO selectVO(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
	
	List<ShouhoujianxiuView> selectListView(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);

	List<ShouhoujianxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
	
	ShouhoujianxiuView selectView(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
	
}
