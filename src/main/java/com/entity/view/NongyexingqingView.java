package com.entity.view;

import com.entity.NongyexingqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农业行情
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
@TableName("nongyexingqing")
public class NongyexingqingView  extends NongyexingqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyexingqingView(){
	}
 
 	public NongyexingqingView(NongyexingqingEntity nongyexingqingEntity){
 	try {
			BeanUtils.copyProperties(this, nongyexingqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
