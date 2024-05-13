package com.dao;

import com.entity.NongyejiqiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyejiqiaoVO;
import com.entity.view.NongyejiqiaoView;


/**
 * 农业技巧
 * 
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface NongyejiqiaoDao extends BaseMapper<NongyejiqiaoEntity> {
	
	List<NongyejiqiaoVO> selectListVO(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
	
	NongyejiqiaoVO selectVO(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
	
	List<NongyejiqiaoView> selectListView(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);

	List<NongyejiqiaoView> selectListView(Pagination page,@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
	
	NongyejiqiaoView selectView(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
	
}
