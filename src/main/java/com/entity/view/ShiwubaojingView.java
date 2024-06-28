package com.entity.view;

import com.entity.ShiwubaojingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事务报警
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
@TableName("shiwubaojing")
public class ShiwubaojingView  extends ShiwubaojingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwubaojingView(){
	}
 
 	public ShiwubaojingView(ShiwubaojingEntity shiwubaojingEntity){
 	try {
			BeanUtils.copyProperties(this, shiwubaojingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
