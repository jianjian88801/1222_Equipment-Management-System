package com.entity.view;

import com.entity.ShebeidianjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备点检
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
@TableName("shebeidianjian")
public class ShebeidianjianView  extends ShebeidianjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeidianjianView(){
	}
 
 	public ShebeidianjianView(ShebeidianjianEntity shebeidianjianEntity){
 	try {
			BeanUtils.copyProperties(this, shebeidianjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
