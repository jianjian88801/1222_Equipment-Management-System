package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeianzhuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeianzhuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeianzhuangView;


/**
 * 设备安装
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeianzhuangService extends IService<ShebeianzhuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeianzhuangVO> selectListVO(Wrapper<ShebeianzhuangEntity> wrapper);
   	
   	ShebeianzhuangVO selectVO(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
   	
   	List<ShebeianzhuangView> selectListView(Wrapper<ShebeianzhuangEntity> wrapper);
   	
   	ShebeianzhuangView selectView(@Param("ew") Wrapper<ShebeianzhuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeianzhuangEntity> wrapper);
   	
}

