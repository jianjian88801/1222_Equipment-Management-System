package com.entity.vo;

import com.entity.ShebeidianjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备点检
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public class ShebeidianjianVO  implements Serializable {
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
	 * 点检项目
	 */
	
	private String dianjianxiangmu;
		
	/**
	 * 点检内容
	 */
	
	private String dianjianneirong;
		
	/**
	 * 点检日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dianjianriqi;
		
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
	 * 设置：点检项目
	 */
	 
	public void setDianjianxiangmu(String dianjianxiangmu) {
		this.dianjianxiangmu = dianjianxiangmu;
	}
	
	/**
	 * 获取：点检项目
	 */
	public String getDianjianxiangmu() {
		return dianjianxiangmu;
	}
				
	
	/**
	 * 设置：点检内容
	 */
	 
	public void setDianjianneirong(String dianjianneirong) {
		this.dianjianneirong = dianjianneirong;
	}
	
	/**
	 * 获取：点检内容
	 */
	public String getDianjianneirong() {
		return dianjianneirong;
	}
				
	
	/**
	 * 设置：点检日期
	 */
	 
	public void setDianjianriqi(Date dianjianriqi) {
		this.dianjianriqi = dianjianriqi;
	}
	
	/**
	 * 获取：点检日期
	 */
	public Date getDianjianriqi() {
		return dianjianriqi;
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
