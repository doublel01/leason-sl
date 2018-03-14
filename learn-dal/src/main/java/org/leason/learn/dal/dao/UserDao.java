package org.leason.learn.dal.dao;

import org.leason.learn.dal.dataobject.UserDO;

/**
 * Created by lee on 2018/1/10.
 */
public interface UserDao {

    /**
     * 插入用户
     *
     * @param userDO
     * @return
     */
    int insertSelective(UserDO userDO);
}
