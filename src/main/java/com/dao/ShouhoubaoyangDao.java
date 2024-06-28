package com.dao;

import com.entity.ShouhoubaoyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhoubaoyangVO;
import com.entity.view.ShouhoubaoyangView;


/**
 * 售后保养
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShouhoubaoyangDao extends BaseMapper<ShouhoubaoyangEntity> {
	
	List<ShouhoubaoyangVO> selectListVO(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
	
	ShouhoubaoyangVO selectVO(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
	
	List<ShouhoubaoyangView> selectListView(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);

	List<ShouhoubaoyangView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
	
	ShouhoubaoyangView selectView(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
	
}
