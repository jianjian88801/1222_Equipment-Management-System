package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwubaojingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwubaojingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwubaojingView;


/**
 * 事务报警
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShiwubaojingService extends IService<ShiwubaojingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwubaojingVO> selectListVO(Wrapper<ShiwubaojingEntity> wrapper);
   	
   	ShiwubaojingVO selectVO(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
   	
   	List<ShiwubaojingView> selectListView(Wrapper<ShiwubaojingEntity> wrapper);
   	
   	ShiwubaojingView selectView(@Param("ew") Wrapper<ShiwubaojingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwubaojingEntity> wrapper);
   	
}

