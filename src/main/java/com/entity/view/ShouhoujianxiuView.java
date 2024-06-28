package com.entity.view;

import com.entity.ShouhoujianxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 售后检修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
@TableName("shouhoujianxiu")
public class ShouhoujianxiuView  extends ShouhoujianxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhoujianxiuView(){
	}
 
 	public ShouhoujianxiuView(ShouhoujianxiuEntity shouhoujianxiuEntity){
 	try {
			BeanUtils.copyProperties(this, shouhoujianxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
