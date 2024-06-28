package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhoujianxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhoujianxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhoujianxiuView;


/**
 * 售后检修
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShouhoujianxiuService extends IService<ShouhoujianxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhoujianxiuVO> selectListVO(Wrapper<ShouhoujianxiuEntity> wrapper);
   	
   	ShouhoujianxiuVO selectVO(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
   	
   	List<ShouhoujianxiuView> selectListView(Wrapper<ShouhoujianxiuEntity> wrapper);
   	
   	ShouhoujianxiuView selectView(@Param("ew") Wrapper<ShouhoujianxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhoujianxiuEntity> wrapper);
   	
}

