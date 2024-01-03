package com.cp.service;

import com.cp.pojo.vo.BlogTypeCountVo;

import java.util.List;

public interface IBlogTypeService {
    List<BlogTypeCountVo> selectBlogTypeCount();
}
