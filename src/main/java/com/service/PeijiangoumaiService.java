package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijiangoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijiangoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijiangoumaiView;


/**
 * 配件购买
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
public interface PeijiangoumaiService extends IService<PeijiangoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijiangoumaiVO> selectListVO(Wrapper<PeijiangoumaiEntity> wrapper);
   	
   	PeijiangoumaiVO selectVO(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
   	
   	List<PeijiangoumaiView> selectListView(Wrapper<PeijiangoumaiEntity> wrapper);
   	
   	PeijiangoumaiView selectView(@Param("ew") Wrapper<PeijiangoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijiangoumaiEntity> wrapper);
   	
}

