package com.dao;

import com.entity.NongyexingqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyexingqingVO;
import com.entity.view.NongyexingqingView;


/**
 * 农业行情
 * 
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface NongyexingqingDao extends BaseMapper<NongyexingqingEntity> {
	
	List<NongyexingqingVO> selectListVO(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
	
	NongyexingqingVO selectVO(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
	
	List<NongyexingqingView> selectListView(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);

	List<NongyexingqingView> selectListView(Pagination page,@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
	
	NongyexingqingView selectView(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
	
}
