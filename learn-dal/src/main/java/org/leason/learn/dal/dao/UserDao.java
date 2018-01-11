package org.leason.learn.dal.dao;

import org.leason.learn.dal.dataobject.UserDO;

/**
 * Created by lee on 2018/1/10.
 */
public interface UserDao {

    int insertSelective(UserDO userDO);
}
