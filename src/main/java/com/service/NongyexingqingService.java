package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyexingqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyexingqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyexingqingView;


/**
 * 农业行情
 *
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface NongyexingqingService extends IService<NongyexingqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyexingqingVO> selectListVO(Wrapper<NongyexingqingEntity> wrapper);
   	
   	NongyexingqingVO selectVO(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
   	
   	List<NongyexingqingView> selectListView(Wrapper<NongyexingqingEntity> wrapper);
   	
   	NongyexingqingView selectView(@Param("ew") Wrapper<NongyexingqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyexingqingEntity> wrapper);
   	
}

