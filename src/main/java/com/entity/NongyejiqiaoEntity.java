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
 * 农业技巧
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
@TableName("nongyejiqiao")
public class NongyejiqiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyejiqiaoEntity() {
		
	}
	
	public NongyejiqiaoEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 简述
	 */
					
	private String jianshu;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 技巧内容
	 */
					
	private String jiqiaoneirong;
	
	/**
	 * 发日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fariqi;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：简述
	 */
	public void setJianshu(String jianshu) {
		this.jianshu = jianshu;
	}
	/**
	 * 获取：简述
	 */
	public String getJianshu() {
		return jianshu;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：技巧内容
	 */
	public void setJiqiaoneirong(String jiqiaoneirong) {
		this.jiqiaoneirong = jiqiaoneirong;
	}
	/**
	 * 获取：技巧内容
	 */
	public String getJiqiaoneirong() {
		return jiqiaoneirong;
	}
	/**
	 * 设置：发日期
	 */
	public void setFariqi(Date fariqi) {
		this.fariqi = fariqi;
	}
	/**
	 * 获取：发日期
	 */
	public Date getFariqi() {
		return fariqi;
	}

}
