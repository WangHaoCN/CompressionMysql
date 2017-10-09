package com.whao.sqltest.service;

import com.whao.sqltest.entity.User;

import java.util.List;

public interface IUserService {

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAllUser(int pageNum, int pageSize);

}
