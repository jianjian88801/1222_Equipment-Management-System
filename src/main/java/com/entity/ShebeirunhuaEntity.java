package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 设备润滑
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-29 16:24:24
 */
@TableName("shebeirunhua")
public class ShebeirunhuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeirunhuaEntity() {
		
	}
	
	public ShebeirunhuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
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
