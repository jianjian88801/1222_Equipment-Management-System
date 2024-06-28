package com.entity.vo;

import com.entity.ShiwubaojingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 事务报警
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
public class ShiwubaojingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报警时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baojingshijian;
		
	/**
	 * 报警原因
	 */
	
	private String baojingyuanyin;
		
	/**
	 * 处理情况
	 */
	
	private String chuliqingkuang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：报警时间
	 */
	 
	public void setBaojingshijian(Date baojingshijian) {
		this.baojingshijian = baojingshijian;
	}
	
	/**
	 * 获取：报警时间
	 */
	public Date getBaojingshijian() {
		return baojingshijian;
	}
				
	
	/**
	 * 设置：报警原因
	 */
	 
	public void setBaojingyuanyin(String baojingyuanyin) {
		this.baojingyuanyin = baojingyuanyin;
	}
	
	/**
	 * 获取：报警原因
	 */
	public String getBaojingyuanyin() {
		return baojingyuanyin;
	}
				
	
	/**
	 * 设置：处理情况
	 */
	 
	public void setChuliqingkuang(String chuliqingkuang) {
		this.chuliqingkuang = chuliqingkuang;
	}
	
	/**
	 * 获取：处理情况
	 */
	public String getChuliqingkuang() {
		return chuliqingkuang;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
