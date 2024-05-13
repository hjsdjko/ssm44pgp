package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyejiqiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyejiqiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyejiqiaoView;


/**
 * 农业技巧
 *
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface NongyejiqiaoService extends IService<NongyejiqiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyejiqiaoVO> selectListVO(Wrapper<NongyejiqiaoEntity> wrapper);
   	
   	NongyejiqiaoVO selectVO(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
   	
   	List<NongyejiqiaoView> selectListView(Wrapper<NongyejiqiaoEntity> wrapper);
   	
   	NongyejiqiaoView selectView(@Param("ew") Wrapper<NongyejiqiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyejiqiaoEntity> wrapper);
   	
}

