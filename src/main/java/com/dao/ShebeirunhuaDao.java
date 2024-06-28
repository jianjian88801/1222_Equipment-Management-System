package com.dao;

import com.entity.ShebeirunhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeirunhuaVO;
import com.entity.view.ShebeirunhuaView;


/**
 * 设备润滑
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeirunhuaDao extends BaseMapper<ShebeirunhuaEntity> {
	
	List<ShebeirunhuaVO> selectListVO(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
	
	ShebeirunhuaVO selectVO(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
	
	List<ShebeirunhuaView> selectListView(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);

	List<ShebeirunhuaView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
	
	ShebeirunhuaView selectView(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
	
}
