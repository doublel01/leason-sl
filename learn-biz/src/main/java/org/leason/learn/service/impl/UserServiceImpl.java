package org.leason.learn.service.impl;

import org.leason.learn.dal.dao.UserDao;
import org.leason.learn.dal.dataobject.UserDO;
import org.leason.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lee on 2018/1/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean createUser(String name, Integer age) {
        UserDO userDO = new UserDO();
        userDO.setAge(age);
        userDO.setName(name);
        return userDao.insertSelective(userDO) == 1;
    }
}
