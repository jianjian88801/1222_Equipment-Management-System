package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeirunhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeirunhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeirunhuaView;


/**
 * 设备润滑
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeirunhuaService extends IService<ShebeirunhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeirunhuaVO> selectListVO(Wrapper<ShebeirunhuaEntity> wrapper);
   	
   	ShebeirunhuaVO selectVO(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
   	
   	List<ShebeirunhuaView> selectListView(Wrapper<ShebeirunhuaEntity> wrapper);
   	
   	ShebeirunhuaView selectView(@Param("ew") Wrapper<ShebeirunhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeirunhuaEntity> wrapper);
   	
}

