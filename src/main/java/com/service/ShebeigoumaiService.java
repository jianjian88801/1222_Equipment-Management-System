package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeigoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeigoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeigoumaiView;


/**
 * 设备购买
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface ShebeigoumaiService extends IService<ShebeigoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeigoumaiVO> selectListVO(Wrapper<ShebeigoumaiEntity> wrapper);
   	
   	ShebeigoumaiVO selectVO(@Param("ew") Wrapper<ShebeigoumaiEntity> wrapper);
   	
   	List<ShebeigoumaiView> selectListView(Wrapper<ShebeigoumaiEntity> wrapper);
   	
   	ShebeigoumaiView selectView(@Param("ew") Wrapper<ShebeigoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeigoumaiEntity> wrapper);
   	
}

