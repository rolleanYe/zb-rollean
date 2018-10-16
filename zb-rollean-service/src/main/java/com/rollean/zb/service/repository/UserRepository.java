package com.rollean.zb.service.repository;

import com.rollean.zb.domain.User;

/**
 * Created by rollean.
 */
public interface UserRepository {

    User queryByName(String name);

}
