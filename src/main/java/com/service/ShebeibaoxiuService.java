package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeibaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeibaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeibaoxiuView;


/**
 * 设备报修
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShebeibaoxiuService extends IService<ShebeibaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeibaoxiuVO> selectListVO(Wrapper<ShebeibaoxiuEntity> wrapper);
   	
   	ShebeibaoxiuVO selectVO(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
   	
   	List<ShebeibaoxiuView> selectListView(Wrapper<ShebeibaoxiuEntity> wrapper);
   	
   	ShebeibaoxiuView selectView(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeibaoxiuEntity> wrapper);
   	
}

