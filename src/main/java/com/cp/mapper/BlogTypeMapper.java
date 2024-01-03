package com.cp.mapper;

import com.cp.pojo.vo.BlogTypeCountVo;

import java.util.List;

public interface BlogTypeMapper {

    List<BlogTypeCountVo> selectBlogTypeCount();
}
