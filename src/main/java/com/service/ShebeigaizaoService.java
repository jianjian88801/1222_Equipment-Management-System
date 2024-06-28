package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeigaizaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeigaizaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeigaizaoView;


/**
 * 设备改造
 *
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public interface ShebeigaizaoService extends IService<ShebeigaizaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeigaizaoVO> selectListVO(Wrapper<ShebeigaizaoEntity> wrapper);
   	
   	ShebeigaizaoVO selectVO(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
   	
   	List<ShebeigaizaoView> selectListView(Wrapper<ShebeigaizaoEntity> wrapper);
   	
   	ShebeigaizaoView selectView(@Param("ew") Wrapper<ShebeigaizaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeigaizaoEntity> wrapper);
   	
}

