package com.cp.service.impl;

import com.cp.mapper.BlogTypeMapper;
import com.cp.pojo.vo.BlogTypeCountVo;
import com.cp.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeServiceImpl implements IBlogTypeService {
    @Autowired
    private BlogTypeMapper blogTypeMapper;
    @Override
    public List<BlogTypeCountVo> selectBlogTypeCount() {
        return blogTypeMapper.selectBlogTypeCount();
    }
}
