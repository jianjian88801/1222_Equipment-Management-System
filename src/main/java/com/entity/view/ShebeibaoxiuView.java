package com.entity.view;

import com.entity.ShebeibaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:23
 */
@TableName("shebeibaoxiu")
public class ShebeibaoxiuView  extends ShebeibaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeibaoxiuView(){
	}
 
 	public ShebeibaoxiuView(ShebeibaoxiuEntity shebeibaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, shebeibaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
