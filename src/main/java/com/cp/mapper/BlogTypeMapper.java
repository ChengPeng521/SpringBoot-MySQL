package com.cp.mapper;

import com.cp.pojo.entity.BlogType;
import com.cp.pojo.vo.BlogTypeCountVo;

import java.util.List;

public interface BlogTypeMapper {

    List<BlogTypeCountVo> selectBlogTypeCount();
    List<BlogType> selectAll();

    void deleteById(Integer id);

    void add(BlogType blog);

    BlogType selectById(Integer id);

    void update(BlogType blog);

    List<BlogType> selectByPage(int offset, Integer pageSize);

    int selectTotalCount();

    void deleteAll(Integer[] ids);
}
