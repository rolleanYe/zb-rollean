package com.rollean.zb.service.repository;

import com.rollean.zb.domain.User;

/**
 * Created by rollean.
 */
public interface UserRepository {

    User queryByName(String name);

    User queryById(String id);

    User loginQuery(String userName, String userPassword);

    User duplicateCheck(String nickname, String mobile, String email);

    void insertUser(User user);

    void updateUser(User user);

}
