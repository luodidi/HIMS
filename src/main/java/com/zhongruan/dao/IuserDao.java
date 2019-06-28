package com.zhongruan.dao;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IuserDao {


    List <UserInfo> findAll();

    public void delete(int id);

    int update(UserInfo userInfo);

    UserInfo queryById(int id);

    public int adduser(UserInfo userInfo);

}
