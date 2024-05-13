package com.entity.view;

import com.entity.NongyejiqiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农业技巧
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
@TableName("nongyejiqiao")
public class NongyejiqiaoView  extends NongyejiqiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyejiqiaoView(){
	}
 
 	public NongyejiqiaoView(NongyejiqiaoEntity nongyejiqiaoEntity){
 	try {
			BeanUtils.copyProperties(this, nongyejiqiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
