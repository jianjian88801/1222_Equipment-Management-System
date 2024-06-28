package com.dao;

import com.entity.ShebeidianjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeidianjianVO;
import com.entity.view.ShebeidianjianView;


/**
 * 设备点检
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeidianjianDao extends BaseMapper<ShebeidianjianEntity> {
	
	List<ShebeidianjianVO> selectListVO(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
	
	ShebeidianjianVO selectVO(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
	
	List<ShebeidianjianView> selectListView(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);

	List<ShebeidianjianView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
	
	ShebeidianjianView selectView(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
	
}
