package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NongyejiqiaoDao;
import com.entity.NongyejiqiaoEntity;
import com.service.NongyejiqiaoService;
import com.entity.vo.NongyejiqiaoVO;
import com.entity.view.NongyejiqiaoView;

@Service("nongyejiqiaoService")
public class NongyejiqiaoServiceImpl extends ServiceImpl<NongyejiqiaoDao, NongyejiqiaoEntity> implements NongyejiqiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyejiqiaoEntity> page = this.selectPage(
                new Query<NongyejiqiaoEntity>(params).getPage(),
                new EntityWrapper<NongyejiqiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyejiqiaoEntity> wrapper) {
		  Page<NongyejiqiaoView> page =new Query<NongyejiqiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyejiqiaoVO> selectListVO(Wrapper<NongyejiqiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyejiqiaoVO selectVO(Wrapper<NongyejiqiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyejiqiaoView> selectListView(Wrapper<NongyejiqiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyejiqiaoView selectView(Wrapper<NongyejiqiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
