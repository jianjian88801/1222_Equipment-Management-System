package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeidianjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeidianjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeidianjianView;


/**
 * 设备点检
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeidianjianService extends IService<ShebeidianjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeidianjianVO> selectListVO(Wrapper<ShebeidianjianEntity> wrapper);
   	
   	ShebeidianjianVO selectVO(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
   	
   	List<ShebeidianjianView> selectListView(Wrapper<ShebeidianjianEntity> wrapper);
   	
   	ShebeidianjianView selectView(@Param("ew") Wrapper<ShebeidianjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeidianjianEntity> wrapper);
   	
}

