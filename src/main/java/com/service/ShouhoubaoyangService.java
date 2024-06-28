package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhoubaoyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhoubaoyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhoubaoyangView;


/**
 * 售后保养
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShouhoubaoyangService extends IService<ShouhoubaoyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhoubaoyangVO> selectListVO(Wrapper<ShouhoubaoyangEntity> wrapper);
   	
   	ShouhoubaoyangVO selectVO(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
   	
   	List<ShouhoubaoyangView> selectListView(Wrapper<ShouhoubaoyangEntity> wrapper);
   	
   	ShouhoubaoyangView selectView(@Param("ew") Wrapper<ShouhoubaoyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhoubaoyangEntity> wrapper);
   	
}

