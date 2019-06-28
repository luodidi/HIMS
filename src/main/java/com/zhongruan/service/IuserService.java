package com.zhongruan.service;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IuserService {
    public List<UserInfo> findAll();

    public void delete(int id);

    public int adduser(UserInfo userInfo);

    int update(UserInfo userInfo);

    UserInfo queryById(int id);
}
