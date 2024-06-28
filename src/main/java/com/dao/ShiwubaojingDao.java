package com.dao;

import com.entity.ShiwubaojingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwubaojingVO;
import com.entity.view.ShiwubaojingView;


/**
 * 事务报警
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShiwubaojingDao extends BaseMapper<ShiwubaojingEntity> {
	
	List<ShiwubaojingVO> selectListVO(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
	
	ShiwubaojingVO selectVO(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
	
	List<ShiwubaojingView> selectListView(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);

	List<ShiwubaojingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
	
	ShiwubaojingView selectView(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
	
}
