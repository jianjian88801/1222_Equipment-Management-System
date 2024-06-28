package com.entity.model;

import com.entity.ShebeirunhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备润滑
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public class ShebeirunhuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 设备类型
	 */
	
	private String shebeileixing;
		
	/**
	 * 润滑部位
	 */
	
	private String runhuabuwei;
		
	/**
	 * 润滑油种类
	 */
	
	private String runhuayouzhonglei;
		
	/**
	 * 加油量
	 */
	
	private String jiayouliang;
		
	/**
	 * 润滑周期
	 */
	
	private String runhuazhouqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备类型
	 */
	 
	public void setShebeileixing(String shebeileixing) {
		this.shebeileixing = shebeileixing;
	}
	
	/**
	 * 获取：设备类型
	 */
	public String getShebeileixing() {
		return shebeileixing;
	}
				
	
	/**
	 * 设置：润滑部位
	 */
	 
	public void setRunhuabuwei(String runhuabuwei) {
		this.runhuabuwei = runhuabuwei;
	}
	
	/**
	 * 获取：润滑部位
	 */
	public String getRunhuabuwei() {
		return runhuabuwei;
	}
				
	
	/**
	 * 设置：润滑油种类
	 */
	 
	public void setRunhuayouzhonglei(String runhuayouzhonglei) {
		this.runhuayouzhonglei = runhuayouzhonglei;
	}
	
	/**
	 * 获取：润滑油种类
	 */
	public String getRunhuayouzhonglei() {
		return runhuayouzhonglei;
	}
				
	
	/**
	 * 设置：加油量
	 */
	 
	public void setJiayouliang(String jiayouliang) {
		this.jiayouliang = jiayouliang;
	}
	
	/**
	 * 获取：加油量
	 */
	public String getJiayouliang() {
		return jiayouliang;
	}
				
	
	/**
	 * 设置：润滑周期
	 */
	 
	public void setRunhuazhouqi(String runhuazhouqi) {
		this.runhuazhouqi = runhuazhouqi;
	}
	
	/**
	 * 获取：润滑周期
	 */
	public String getRunhuazhouqi() {
		return runhuazhouqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
