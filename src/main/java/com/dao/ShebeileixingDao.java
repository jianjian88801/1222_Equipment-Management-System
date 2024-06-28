package com.dao;

import com.entity.ShebeileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeileixingVO;
import com.entity.view.ShebeileixingView;


/**
 * 设备类型
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeileixingDao extends BaseMapper<ShebeileixingEntity> {
	
	List<ShebeileixingVO> selectListVO(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	
	ShebeileixingVO selectVO(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	
	List<ShebeileixingView> selectListView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);

	List<ShebeileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	
	ShebeileixingView selectView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	
}
