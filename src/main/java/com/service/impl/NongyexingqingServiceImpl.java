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


import com.dao.NongyexingqingDao;
import com.entity.NongyexingqingEntity;
import com.service.NongyexingqingService;
import com.entity.vo.NongyexingqingVO;
import com.entity.view.NongyexingqingView;

@Service("nongyexingqingService")
public class NongyexingqingServiceImpl extends ServiceImpl<NongyexingqingDao, NongyexingqingEntity> implements NongyexingqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyexingqingEntity> page = this.selectPage(
                new Query<NongyexingqingEntity>(params).getPage(),
                new EntityWrapper<NongyexingqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyexingqingEntity> wrapper) {
		  Page<NongyexingqingView> page =new Query<NongyexingqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyexingqingVO> selectListVO(Wrapper<NongyexingqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyexingqingVO selectVO(Wrapper<NongyexingqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyexingqingView> selectListView(Wrapper<NongyexingqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyexingqingView selectView(Wrapper<NongyexingqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
