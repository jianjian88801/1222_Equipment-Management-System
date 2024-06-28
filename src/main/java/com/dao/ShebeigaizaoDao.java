package com.dao;

import com.entity.ShebeigaizaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeigaizaoVO;
import com.entity.view.ShebeigaizaoView;


/**
 * 设备改造
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeigaizaoDao extends BaseMapper<ShebeigaizaoEntity> {
	
	List<ShebeigaizaoVO> selectListVO(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
	
	ShebeigaizaoVO selectVO(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
	
	List<ShebeigaizaoView> selectListView(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);

	List<ShebeigaizaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
	
	ShebeigaizaoView selectView(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
	
}
