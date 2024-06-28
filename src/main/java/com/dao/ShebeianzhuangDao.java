package com.dao;

import com.entity.ShebeianzhuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeianzhuangVO;
import com.entity.view.ShebeianzhuangView;


/**
 * 设备安装
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeianzhuangDao extends BaseMapper<ShebeianzhuangEntity> {
	
	List<ShebeianzhuangVO> selectListVO(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
	
	ShebeianzhuangVO selectVO(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
	
	List<ShebeianzhuangView> selectListView(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);

	List<ShebeianzhuangView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
	
	ShebeianzhuangView selectView(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
	
}
