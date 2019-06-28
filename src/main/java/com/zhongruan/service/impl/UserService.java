package com.zhongruan.service.impl;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.dao.IuserDao;
import com.zhongruan.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IuserService {
    @Autowired
    public IuserDao userDao;

    @Override
    public List<UserInfo> findAll(){return userDao.findAll();}

    @Override
    public void delete(int id){userDao.delete(id); }


   @Override
   public int adduser(UserInfo userInfo){
       return  userDao.adduser(userInfo);
   }
    public int update(UserInfo userInfo){
        return userDao.update(userInfo);
    }
    public UserInfo queryById(int id){
        return userDao.queryById(id);
    }

}
