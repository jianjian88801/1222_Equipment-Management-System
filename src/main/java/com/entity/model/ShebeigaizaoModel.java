package com.entity.model;

import com.entity.ShebeigaizaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备改造
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public class ShebeigaizaoModel  implements Serializable {
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
	 * 改造原因
	 */
	
	private String gaizaoyuanyin;
		
	/**
	 * 改造内容
	 */
	
	private String gaizaoneirong;
		
	/**
	 * 验收情况
	 */
	
	private String yanshouqingkuang;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
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
	 * 设置：改造原因
	 */
	 
	public void setGaizaoyuanyin(String gaizaoyuanyin) {
		this.gaizaoyuanyin = gaizaoyuanyin;
	}
	
	/**
	 * 获取：改造原因
	 */
	public String getGaizaoyuanyin() {
		return gaizaoyuanyin;
	}
				
	
	/**
	 * 设置：改造内容
	 */
	 
	public void setGaizaoneirong(String gaizaoneirong) {
		this.gaizaoneirong = gaizaoneirong;
	}
	
	/**
	 * 获取：改造内容
	 */
	public String getGaizaoneirong() {
		return gaizaoneirong;
	}
				
	
	/**
	 * 设置：验收情况
	 */
	 
	public void setYanshouqingkuang(String yanshouqingkuang) {
		this.yanshouqingkuang = yanshouqingkuang;
	}
	
	/**
	 * 获取：验收情况
	 */
	public String getYanshouqingkuang() {
		return yanshouqingkuang;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
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
