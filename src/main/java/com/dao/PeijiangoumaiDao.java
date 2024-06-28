package com.dao;

import com.entity.PeijiangoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijiangoumaiVO;
import com.entity.view.PeijiangoumaiView;


/**
 * 配件购买
 * 
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface PeijiangoumaiDao extends BaseMapper<PeijiangoumaiEntity> {
	
	List<PeijiangoumaiVO> selectListVO(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
	
	PeijiangoumaiVO selectVO(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
	
	List<PeijiangoumaiView> selectListView(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);

	List<PeijiangoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
	
	PeijiangoumaiView selectView(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
	
}
